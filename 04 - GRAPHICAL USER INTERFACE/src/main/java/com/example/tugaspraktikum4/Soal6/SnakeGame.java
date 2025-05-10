package com.example.tugaspraktikum4.Soal6;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class SnakeGame extends Application {

  private final int B_WIDTH = 300;
  private final int B_HEIGHT = 300;
  private final int DOT_SIZE = 10;
  private final int RAND_POS = 29;
  private final int DELAY = 140;

  private List<Integer> x = new ArrayList<>();
  private List<Integer> y = new ArrayList<>();

  private int dots;
  private int apple_x;
  private int apple_y;

  private boolean leftDirection = false;
  private boolean rightDirection = true;
  private boolean upDirection = false;
  private boolean downDirection = false;
  private boolean inGame = true;

  private Timeline timeline;
  private GraphicsContext gc;

  @Override
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(B_WIDTH, B_HEIGHT);
    gc = canvas.getGraphicsContext2D();

    initGame();

    Scene scene = new Scene(new StackPane(canvas), B_WIDTH, B_HEIGHT);
    scene.setOnKeyPressed(e -> {
      KeyCode key = e.getCode();

      if (key == KeyCode.LEFT && !rightDirection) {
        leftDirection = true;
        upDirection = false;
        downDirection = false;
      }

      if (key == KeyCode.RIGHT && !leftDirection) {
        rightDirection = true;
        upDirection = false;
        downDirection = false;
      }

      if (key == KeyCode.UP && !downDirection) {
        upDirection = true;
        rightDirection = false;
        leftDirection = false;
      }

      if (key == KeyCode.DOWN && !upDirection) {
        downDirection = true;
        rightDirection = false;
        leftDirection = false;
      }
    });

    primaryStage.setTitle("Snake JavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void initGame() {
    dots = 3;
    x.clear();
    y.clear();

    for (int z = 0; z < dots; z++) {
      x.add(50 - z * DOT_SIZE);
      y.add(50);
    }

    locateApple();

    timeline = new Timeline(new KeyFrame(Duration.millis(DELAY), e -> {
      if (inGame) {
        checkApple();
        checkCollision();
        move();
      }
      draw();
    }));
    timeline.setCycleCount(Timeline.INDEFINITE);
    timeline.play();
  }

  private void draw() {
    gc.setFill(Color.BLACK);
    gc.fillRect(0, 0, B_WIDTH, B_HEIGHT);

    if (inGame) {
      // Gambar apel
      gc.setFill(Color.RED);
      gc.fillOval(apple_x, apple_y, DOT_SIZE, DOT_SIZE);

      // Gambar ular
      for (int z = 0; z < dots; z++) {
        if (z == 0) {
          gc.setFill(Color.LIMEGREEN); // Kepala ular
        } else {
          gc.setFill(Color.RED); // Badan ular
        }
        gc.fillRect(x.get(z), y.get(z), DOT_SIZE, DOT_SIZE);
      }

    } else {
      gameOver();
    }
  }

  private void gameOver() {
    gc.setFill(Color.WHITE);
    gc.setFont(Font.font("Helvetica", 20));
    gc.fillText("Game Over", (B_WIDTH - 100) / 2.0, B_HEIGHT / 2.0);
  }

  private void checkApple() {
    if (x.get(0) == apple_x && y.get(0) == apple_y) {
      dots++;
      x.add(0);
      y.add(0);
      locateApple();
    }
  }

  private void move() {
    for (int z = dots - 1; z > 0; z--) {
      x.set(z, x.get(z - 1));
      y.set(z, y.get(z - 1));
    }

    if (leftDirection) {
      x.set(0, x.get(0) - DOT_SIZE);
    } else if (rightDirection) {
      x.set(0, x.get(0) + DOT_SIZE);
    } else if (upDirection) {
      y.set(0, y.get(0) - DOT_SIZE);
    } else if (downDirection) {
      y.set(0, y.get(0) + DOT_SIZE);
    }

    if(x.get(0) < 0){
      x.set(0, B_WIDTH - DOT_SIZE);
    } else if(x.get(0) >= B_WIDTH){
      x.set(0, 0);
    }

    if(y.get(0) < 0){
      y.set(0, B_HEIGHT - DOT_SIZE);
    } else if(y.get(0) >= B_HEIGHT){
      y.set(0,0);
    }


  }

  private void checkCollision() {
    for (int z = dots - 1; z > 4; z--) {
      if (x.get(0).equals(x.get(z)) && y.get(0).equals(y.get(z))) {
        inGame = false;
        break;
      }
    }

//    if (x.get(0) < 0 || x.get(0) >= B_WIDTH || y.get(0) < 0 || y.get(0) >= B_HEIGHT) {
//      inGame = false;
//    }

    if (!inGame) {
      timeline.stop();
    }
  }

  private void locateApple() {
    int r = (int) (Math.random() * RAND_POS);
    apple_x = r * DOT_SIZE;

    r = (int) (Math.random() * RAND_POS);
    apple_y = r * DOT_SIZE;
  }

  public static void main(String[] args) {
    launch(args);
  }
}
