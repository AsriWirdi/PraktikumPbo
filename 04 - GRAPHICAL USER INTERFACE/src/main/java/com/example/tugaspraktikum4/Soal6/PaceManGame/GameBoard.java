package com.example.tugaspraktikum4.Soal6.PaceManGame;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class GameBoard extends Pane {
  private static final int TILE_SIZE = 20;
  private static final int WIDTH = 28;
  private static final int HEIGHT = 31;

  private Canvas canvas;
  private GraphicsContext gc;
  private PacMan pacMan;
  private boolean[][] dots;

  public GameBoard() {
    canvas = new Canvas(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
    gc = canvas.getGraphicsContext2D();
    this.getChildren().add(canvas);
    initializeGame();
    setFocusTraversable(true);
    setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.UP) pacMan.setDirection(0, -1);
      else if (e.getCode() == KeyCode.DOWN) pacMan.setDirection(0, 1);
      else if (e.getCode() == KeyCode.LEFT) pacMan.setDirection(-1, 0);
      else if (e.getCode() == KeyCode.RIGHT) pacMan.setDirection(1, 0);
    });
  }

  private void initializeGame() {
    pacMan = new PacMan(WIDTH / 2, HEIGHT / 2);
    dots = new boolean[WIDTH][HEIGHT];
    for (int x = 0; x < WIDTH; x++)
      for (int y = 0; y < HEIGHT; y++)
        dots[x][y] = true;
  }

  public void startGame() {
    AnimationTimer timer = new AnimationTimer() {
      private long lastUpdate = 0;
      @Override
      public void handle(long now) {
        if (now - lastUpdate >= 200_000_000) { // 200 ms
          update();
          render();
          lastUpdate = now;
        }
      }
    };
    timer.start();
  }

  private void update() {
    pacMan.move();
    int x = pacMan.getX();
    int y = pacMan.getY();
    if (x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT) {
      dots[x][y] = false;
    }
  }

  private void render() {
    gc.setFill(Color.BLACK);
    gc.fillRect(0, 0, WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);

    // Draw dots
    gc.setFill(Color.WHITE);
    for (int x = 0; x < WIDTH; x++)
      for (int y = 0; y < HEIGHT; y++)
        if (dots[x][y])
          gc.fillOval(x * TILE_SIZE + TILE_SIZE / 2 - 2, y * TILE_SIZE + TILE_SIZE / 2 - 2, 4, 4);

    // Draw Pac-Man
    gc.setFill(Color.YELLOW);
    gc.fillOval(pacMan.getX() * TILE_SIZE, pacMan.getY() * TILE_SIZE, TILE_SIZE, TILE_SIZE);
  }
}

