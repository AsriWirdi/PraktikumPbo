package com.example.tugaspraktikum4.Soal6;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class SpaceInvadersGame extends Application {

  private static final int WIDTH = 600;
  private static final int HEIGHT = 400;

  private static final int PLAYER_WIDTH = 40;
  private static final int PLAYER_HEIGHT = 20;
  private static final int BULLET_WIDTH = 5;
  private static final int BULLET_HEIGHT = 10;
  private static final int ALIEN_WIDTH = 40;
  private static final int ALIEN_HEIGHT = 40;

  private Rectangle player;
  private double playerSpeed = 15; // Kecepatan pemain diperbesar
  private double playerX = WIDTH / 2 - PLAYER_WIDTH / 2;

  private Timeline gameLoop;
  private Pane root;
  private Text scoreText;
  private int score = 0;

  private ArrayList<Rectangle> bullets = new ArrayList<>();
  private ArrayList<Rectangle> aliens = new ArrayList<>();

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    root = new Pane();
    root.setStyle("-fx-background-color: black;");

    player = new Rectangle(PLAYER_WIDTH, PLAYER_HEIGHT, Color.YELLOW);
    player.setX(playerX);
    player.setY(HEIGHT - PLAYER_HEIGHT - 10);
    root.getChildren().add(player);

    scoreText = new Text(10, 20, "Score: " + score);
    scoreText.setFill(Color.WHITE);
    root.getChildren().add(scoreText);

    // Membuat alien dalam grid 3x3
    createAliens();

    // Mengatur kontrol keyboard
    Scene scene = new Scene(root, WIDTH, HEIGHT);
    scene.setOnKeyPressed(event -> {
      if (event.getCode() == KeyCode.LEFT) {
        movePlayer(-playerSpeed); // Gerakan lebih cepat ke kiri
      } else if (event.getCode() == KeyCode.RIGHT) {
        movePlayer(playerSpeed); // Gerakan lebih cepat ke kanan
      } else if (event.getCode() == KeyCode.SPACE) {
        shootBullet();
      }
    });

    // Mengatur loop permainan
    gameLoop = new Timeline(new KeyFrame(Duration.millis(30), e -> gameUpdate())); // Memperlambat gerakan alien
    gameLoop.setCycleCount(Timeline.INDEFINITE);
    gameLoop.play();

    primaryStage.setTitle("Space Invaders");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  // Membuat alien dalam posisi acak
  private void createAliens() {
    int rows = 3; // Jumlah baris alien
    int cols = 3; // Jumlah kolom alien
    int xSpacing = 50; // Jarak antar alien horizontal
    int ySpacing = 50; // Jarak antar alien vertikal

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        // Tentukan posisi acak untuk masing-masing alien
        double x = Math.random() * (WIDTH - ALIEN_WIDTH);
        double y = Math.random() * (HEIGHT / 2); // Batasi posisi y di atas tengah layar

        Rectangle alien = new Rectangle(ALIEN_WIDTH, ALIEN_HEIGHT, Color.GREEN);
        alien.setX(x);
        alien.setY(y);
        root.getChildren().add(alien);
        aliens.add(alien);
      }
    }
  }

  // Menggerakkan pemain
  private void movePlayer(double speed) {
    if (player.getX() + speed >= 0 && player.getX() + speed <= WIDTH - PLAYER_WIDTH) {
      player.setX(player.getX() + speed);
    }
  }

  // Menembakkan peluru
  private void shootBullet() {
    Rectangle bullet = new Rectangle(BULLET_WIDTH, BULLET_HEIGHT, Color.WHITE);
    bullet.setX(player.getX() + PLAYER_WIDTH / 2 - BULLET_WIDTH / 2);
    bullet.setY(player.getY() - BULLET_HEIGHT);
    root.getChildren().add(bullet);
    bullets.add(bullet);
  }

  // Mengupdate status game
  private void gameUpdate() {
    // Gerakkan peluru ke atas
    ArrayList<Rectangle> bulletsToRemove = new ArrayList<>();
    for (Rectangle bullet : bullets) {
      bullet.setY(bullet.getY() - 5);
      if (bullet.getY() < 0) {
        bulletsToRemove.add(bullet);
      }
      checkCollisionWithAliens(bullet);
    }
    bullets.removeAll(bulletsToRemove);
    root.getChildren().removeAll(bulletsToRemove);

    // Gerakkan aliens (perlambat sedikit)
    for (Rectangle alien : aliens) {
      alien.setY(alien.getY() + 0.5); // Aliens turun perlahan
      if (alien.getY() > HEIGHT - ALIEN_HEIGHT) {
        gameOver();
      }
    }

    // Jika semua alien telah dihancurkan, buat alien baru di posisi acak
    if (aliens.isEmpty()) {
      createAliens();
    }
  }

  // Mengecek tabrakan peluru dengan alien
  private void checkCollisionWithAliens(Rectangle bullet) {
    ArrayList<Rectangle> aliensToRemove = new ArrayList<>();
    for (Rectangle alien : aliens) {
      if (alien.getFill() == Color.GREEN && alien.getBoundsInParent().intersects(bullet.getBoundsInParent())) {
        aliensToRemove.add(alien);
        bullet.setY(-10); // Menyembunyikan peluru setelah mengenai alien
        score += 10;
        scoreText.setText("Score: " + score);
      }
    }
    aliens.removeAll(aliensToRemove);
    root.getChildren().removeAll(aliensToRemove);
  }

  // Menampilkan pesan game over
  private void gameOver() {
    gameLoop.stop();
    Text gameOverText = new Text(WIDTH / 2 - 70, HEIGHT / 2, "GAME OVER");
    gameOverText.setFill(Color.RED);
    gameOverText.setStyle("-fx-font-size: 30px;");
    root.getChildren().add(gameOverText);
  }
}
