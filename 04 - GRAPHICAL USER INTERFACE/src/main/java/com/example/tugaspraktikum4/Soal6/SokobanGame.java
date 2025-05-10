package com.example.tugaspraktikum4.Soal6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SokobanGame extends Application {

  private static final int TILE_SIZE = 40; // Ukuran tiap tile
  private static final int BOARD_WIDTH = 5; // Lebar papan
  private static final int BOARD_HEIGHT = 5; // Tinggi papan

  private GridPane board;
  private Rectangle player;
  private int playerX = 1;
  private int playerY = 1;

  private int goalX = 3;
  private int goalY = 3;

  private int boxX = 2;
  private int boxY = 2;

  private boolean gameWon = false;  // Status permainan menang

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    board = new GridPane();
    board.setAlignment(Pos.CENTER);
    board.setHgap(1);
    board.setVgap(1);

    // Membuat papan game (grid)
    for (int y = 0; y < BOARD_HEIGHT; y++) {
      for (int x = 0; x < BOARD_WIDTH; x++) {
        Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE);
        tile.setFill(Color.LIGHTGRAY);
        board.add(tile, x, y);
      }
    }

    // Membuat kotak tujuan
    Rectangle goal = new Rectangle(TILE_SIZE, TILE_SIZE);
    goal.setFill(Color.GREEN);
    board.add(goal, goalX, goalY);

    // Membuat kotak
    Rectangle box = new Rectangle(TILE_SIZE, TILE_SIZE);
    box.setFill(Color.RED);
    board.add(box, boxX, boxY);

    // Membuat pemain
    player = new Rectangle(TILE_SIZE, TILE_SIZE);
    player.setFill(Color.YELLOW);
    board.add(player, playerX, playerY);

    // Scene dan event key
    Scene scene = new Scene(board, TILE_SIZE * BOARD_WIDTH, TILE_SIZE * BOARD_HEIGHT);
    scene.setOnKeyPressed(event -> {
      if (gameWon) return;  // Jika game sudah dimenangkan, tidak bisa bergerak lagi

      if (event.getCode() == KeyCode.UP) {
        movePlayer(0, -1);
      } else if (event.getCode() == KeyCode.DOWN) {
        movePlayer(0, 1);
      } else if (event.getCode() == KeyCode.LEFT) {
        movePlayer(-1, 0);
      } else if (event.getCode() == KeyCode.RIGHT) {
        movePlayer(1, 0);
      }
    });

    primaryStage.setTitle("Sokoban Game");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void movePlayer(int dx, int dy) {
    int newX = playerX + dx;
    int newY = playerY + dy;

    if (isValidMove(newX, newY)) {
      playerX = newX;
      playerY = newY;

      // Jika pemain bergerak ke kotak
      if (newX == boxX && newY == boxY) {
        moveBox(dx, dy);
      }

      updatePlayerPosition();
    }
  }

  private void moveBox(int dx, int dy) {
    int newBoxX = boxX + dx;
    int newBoxY = boxY + dy;

    if (isValidMove(newBoxX, newBoxY)) {
      boxX = newBoxX;
      boxY = newBoxY;
      updateBoxPosition();
    }
  }

  private boolean isValidMove(int x, int y) {
    // Cek apakah posisi valid (dalam batas papan)
    return x >= 0 && x < BOARD_WIDTH && y >= 0 && y < BOARD_HEIGHT;
  }

  private void updatePlayerPosition() {
    // Menghapus posisi pemain lama
    board.getChildren().remove(player);
    // Menambahkan pemain di posisi baru
    player = new Rectangle(TILE_SIZE, TILE_SIZE);
    player.setFill(Color.YELLOW);
    board.add(player, playerX, playerY);
    checkWin();
  }

  private void updateBoxPosition() {
    // Menghapus posisi kotak lama
    for (var child : board.getChildren()) {
      if (child instanceof Rectangle && ((Rectangle) child).getFill().equals(Color.RED)) {
        board.getChildren().remove(child);
        break;
      }
    }
    // Menambahkan kotak di posisi baru
    Rectangle box = new Rectangle(TILE_SIZE, TILE_SIZE);
    box.setFill(Color.RED);
    board.add(box, boxX, boxY);
    checkWin();  // Cek jika kotak berada di tujuan
  }

  private void checkWin() {
    System.out.println("Checking win..."); // Debugging
    if (playerX == goalX && playerY == goalY && boxX == goalX && boxY == goalY) {
      if (!gameWon) {
        gameWon = true;
        displayWinMessage();
      }
    }
  }


  private void displayWinMessage() {
    // Menampilkan pesan kemenangan di layar
    Text winText = new Text("You Win!");
    winText.setFill(Color.WHITE);
    winText.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
    winText.setX(TILE_SIZE * BOARD_WIDTH / 3);
    winText.setY(TILE_SIZE * BOARD_HEIGHT / 2);

    // Menambahkan pesan ke papan
    board.getChildren().add(winText);
  }
}
