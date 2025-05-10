package com.example.tugaspraktikum4.Soal6;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BreakoutGame extends Application {

  private static final int WIDTH = 300;
  private static final int HEIGHT = 400;
  private static final int BOTTOM_EDGE = 390;
  private static final int N_OF_BRICKS = 30;

  private boolean left, right, inGame = true;
  private String message = "Game Over";

  private double ballX = 230, ballY = 355, ballDX = 1, ballDY = -1;
  private double paddleX = 200, paddleY = 360, paddleDX = 0;

  private Image ballImg, paddleImg, brickImg;
  private boolean[] brickDestroyed = new boolean[N_OF_BRICKS];
  private double[] brickX = new double[N_OF_BRICKS];
  private double[] brickY = new double[N_OF_BRICKS];

  @Override
  public void start(Stage stage) {
    Canvas canvas = new Canvas(WIDTH, HEIGHT);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Scene scene = new Scene(new javafx.scene.Group(canvas));

    loadImages();
    initBricks();

    scene.setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.LEFT) left = true;
      if (e.getCode() == KeyCode.RIGHT) right = true;
    });

    scene.setOnKeyReleased(e -> {
      if (e.getCode() == KeyCode.LEFT) left = false;
      if (e.getCode() == KeyCode.RIGHT) right = false;
    });

    new AnimationTimer() {
      @Override
      public void handle(long now) {
        if (inGame) {
          updateGame();
        }
        draw(gc);
      }
    }.start();

    stage.setScene(scene);
    stage.setTitle("BreakoutFX");
    stage.setResizable(false);
    stage.show();
  }

  private void loadImages() {
    // Pastikan gambar di-resize sesuai ukuran yang lebih kecil
    ballImg = new Image(getClass().getResourceAsStream("/breakOut/ball.png"), 15, 15, true, true); // Resize bola
    paddleImg = new Image(getClass().getResourceAsStream("/breakOut/paddle.png"), 60, 10, true, true); // Resize paddle
    brickImg = new Image(getClass().getResourceAsStream("/breakOut/brick.png"), 40, 10, true, true); // Resize brick
  }

  private void initBricks() {
    int k = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        brickX[k] = j * 45 + 25; // Adjust x to prevent overlap
        brickY[k] = i * 15 + 50; // Adjust y to create rows
        brickDestroyed[k] = false;
        k++;
      }
    } 
  }

  private void updateGame() {
    // Paddle movement
    if (left) paddleDX = -2;
    else if (right) paddleDX = 2;
    else paddleDX = 0;

    paddleX += paddleDX;
    paddleX = Math.max(0, Math.min(WIDTH - paddleImg.getWidth(), paddleX));

    // Ball movement
    ballX += ballDX;
    ballY += ballDY;

    if (ballX <= 0 || ballX >= WIDTH - ballImg.getWidth()) ballDX *= -1;
    if (ballY <= 0) ballDY *= -1;
    if (ballY >= BOTTOM_EDGE) {
      inGame = false;
      return;
    }

    // Paddle collision
    if (ballY + ballImg.getHeight() >= paddleY &&
            ballX + ballImg.getWidth() >= paddleX &&
            ballX <= paddleX + paddleImg.getWidth()) {

      double hitPos = ballX - paddleX;
      if (hitPos < 8) {
        ballDX = -1;
        ballDY = -1;
      } else if (hitPos < 16) {
        ballDX = -1;
        ballDY *= -1;
      } else if (hitPos < 24) {
        ballDX = 0;
        ballDY = -1;
      } else if (hitPos < 32) {
        ballDX = 1;
        ballDY *= -1;
      } else {
        ballDX = 1;
        ballDY = -1;
      }
    }

    // Brick collision
    int destroyedCount = 0;
    for (int i = 0; i < N_OF_BRICKS; i++) {
      if (brickDestroyed[i]) {
        destroyedCount++;
        continue;
      }

      double bx = brickX[i];
      double by = brickY[i];
      if (ballX + ballImg.getWidth() >= bx && ballX <= bx + brickImg.getWidth() &&
              ballY + ballImg.getHeight() >= by && ballY <= by + brickImg.getHeight()) {

        brickDestroyed[i] = true;

        // Determine bounce direction
        if (ballX + ballImg.getWidth() - ballDX <= bx || ballX - ballDX >= bx + brickImg.getWidth()) {
          ballDX *= -1;
        } else {
          ballDY *= -1;
        }
      }
    }

    if (destroyedCount == N_OF_BRICKS) {
      inGame = false;
      message = "Victory";
    }
  }

  private void draw(GraphicsContext gc) {
    gc.clearRect(0, 0, WIDTH, HEIGHT);

    if (inGame) {
      gc.drawImage(ballImg, ballX, ballY);
      gc.drawImage(paddleImg, paddleX, paddleY);

      for (int i = 0; i < N_OF_BRICKS; i++) {
        if (!brickDestroyed[i]) {
          gc.drawImage(brickImg, brickX[i], brickY[i]);
        }
      }
    } else {
      gc.setFill(Color.BLACK);
      gc.setFont(new Font("Verdana", 18));
      gc.fillText(message, WIDTH / 2.0 - 40, HEIGHT / 2.0);
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
