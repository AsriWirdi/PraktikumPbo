// Aturan Umum Skor & Level:
/*1 garis = 100 poin
  2 garis = 300 poin
  3 garis = 500 poin
  4 garis (Tetris) = 800 poin
  Setiap 10 garis = naik 1 level
  Kecepatan tetromino turun meningkat seiring level*/

package com.example.tugaspraktikum4.Soal6;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class Tetris extends Application {

  private static final int BOARD_WIDTH = 10;
  private static final int BOARD_HEIGHT = 22;
  private static final int SQUARE_SIZE = 30;

  private Canvas canvas;
  private GraphicsContext gc;
  private Tetromino curPiece;
  private Tetromino.Shape[] board;

  private int curX, curY;
  private boolean isFallingFinished = false;
  private boolean isPaused = false;

  private long lastTime = 0;
  private long dropInterval = 500_000_000; // 500ms

  // Score, level, lines
  private int score = 0;
  private int level = 1;
  private int linesRemoved = 0;

  private Label scoreLabel = new Label();
  private Label levelLabel = new Label();
  private Label linesLabel = new Label();

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    canvas = new Canvas(BOARD_WIDTH * SQUARE_SIZE, BOARD_HEIGHT * SQUARE_SIZE);
    gc = canvas.getGraphicsContext2D();

    VBox infoPanel = new VBox(10, scoreLabel, levelLabel, linesLabel);
    infoPanel.setPadding(new Insets(20));
    updateInfoLabels();

    HBox root = new HBox(20, canvas, infoPanel);
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Tetris");
    stage.show();

    initGame();

    scene.setOnKeyPressed(e -> {
      if (curPiece.getShape() == Tetromino.Shape.NoShape || isPaused) return;
      switch (e.getCode()) {
        case LEFT -> tryMove(curPiece, curX - 1, curY);
        case RIGHT -> tryMove(curPiece, curX + 1, curY);
        case DOWN -> tryMove(curPiece.rotateRight(), curX, curY);
        case UP -> tryMove(curPiece.rotateLeft(), curX, curY);
        case SPACE -> dropDown();
        case P -> isPaused = !isPaused;
      }
    });

    AnimationTimer timer = new AnimationTimer() {
      @Override
      public void handle(long now) {
        if (now - lastTime > dropInterval && !isPaused) {
          if (isFallingFinished) {
            isFallingFinished = false;
            newPiece();
          } else {
            oneLineDown();
          }
          render();
          lastTime = now;
        }
      }
    };
    timer.start();
  }

  private void initGame() {
    board = new Tetromino.Shape[BOARD_WIDTH * BOARD_HEIGHT];
    for (int i = 0; i < board.length; i++) board[i] = Tetromino.Shape.NoShape;
    newPiece();
  }

  private void newPiece() {
    curPiece = new Tetromino();
    curPiece.setRandomShape();
    curX = BOARD_WIDTH / 2;
    curY = BOARD_HEIGHT - 1 + curPiece.minY();

    if (!tryMove(curPiece, curX, curY)) {
      curPiece.setShape(Tetromino.Shape.NoShape);
      isPaused = true;
    }
  }

  private boolean tryMove(Tetromino piece, int newX, int newY) {
    for (int i = 0; i < 4; i++) {
      int x = newX + piece.x(i);
      int y = newY - piece.y(i);
      if (x < 0 || x >= BOARD_WIDTH || y < 0 || y >= BOARD_HEIGHT) return false;
      if (shapeAt(x, y) != Tetromino.Shape.NoShape) return false;
    }
    curPiece = piece;
    curX = newX;
    curY = newY;
    return true;
  }

  private void dropDown() {
    int newY = curY;
    while (tryMove(curPiece, curX, newY - 1)) {
      newY--;
    }
    pieceDropped();
  }

  private void oneLineDown() {
    if (!tryMove(curPiece, curX, curY - 1)) {
      pieceDropped();
    }
  }

  private void pieceDropped() {
    for (int i = 0; i < 4; i++) {
      int x = curX + curPiece.x(i);
      int y = curY - curPiece.y(i);
      board[y * BOARD_WIDTH + x] = curPiece.getShape();
    }
    removeFullLines();
    isFallingFinished = true;
  }

  private void removeFullLines() {
    int lines = 0;
    for (int row = 0; row < BOARD_HEIGHT; row++) {
      boolean full = true;
      for (int col = 0; col < BOARD_WIDTH; col++) {
        if (shapeAt(col, row) == Tetromino.Shape.NoShape) {
          full = false;
          break;
        }
      }
      if (full) {
        lines++;
        for (int r = row; r < BOARD_HEIGHT - 1; r++) {
          for (int col = 0; col < BOARD_WIDTH; col++) {
            board[r * BOARD_WIDTH + col] = shapeAt(col, r + 1);
          }
        }
        for (int col = 0; col < BOARD_WIDTH; col++) {
          board[(BOARD_HEIGHT - 1) * BOARD_WIDTH + col] = Tetromino.Shape.NoShape;
        }
      }
    }

    if (lines > 0) {
      linesRemoved += lines;
      score += switch (lines) {
        case 1 -> 100;
        case 2 -> 300;
        case 3 -> 500;
        case 4 -> 800;
        default -> 0;
      };
      level = linesRemoved / 10 + 1;
      dropInterval = Math.max(100_000_000, 500_000_000 - (level - 1) * 50_000_000); // Min 100ms
      updateInfoLabels();
    }
  }

  private void updateInfoLabels() {
    scoreLabel.setText("Score: " + score);
    levelLabel.setText("Level: " + level);
    linesLabel.setText("Lines: " + linesRemoved);
  }

  private Tetromino.Shape shapeAt(int x, int y) {
    return board[y * BOARD_WIDTH + x];
  }

  private void render() {
    gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    // Draw board
    for (int row = 0; row < BOARD_HEIGHT; row++) {
      for (int col = 0; col < BOARD_WIDTH; col++) {
        Tetromino.Shape s = shapeAt(col, row);
        if (s != Tetromino.Shape.NoShape) drawSquare(col, BOARD_HEIGHT - row - 1, s);
      }
    }

    // Draw current piece
    if (curPiece.getShape() != Tetromino.Shape.NoShape) {
      for (int i = 0; i < 4; i++) {
        int x = curX + curPiece.x(i);
        int y = curY - curPiece.y(i);
        drawSquare(x, BOARD_HEIGHT - y - 1, curPiece.getShape());
      }
    }
  }

  private void drawSquare(int x, int y, Tetromino.Shape shape) {
    Color[] colors = {
            Color.BLACK, Color.RED, Color.GREEN, Color.BLUE,
            Color.YELLOW, Color.PURPLE, Color.CYAN, Color.ORANGE
    };
    Color color = colors[shape.ordinal()];
    gc.setFill(color);
    gc.fillRect(x * SQUARE_SIZE, y * SQUARE_SIZE, SQUARE_SIZE - 1, SQUARE_SIZE - 1);
  }
}

class Tetromino {
  enum Shape {
    NoShape, ZShape, SShape, LineShape, TShape, SquareShape, LShape, MirroredLShape
  }

  private Point2D[] coords = new Point2D[4];
  private Shape pieceShape;

  public Tetromino() {
    for (int i = 0; i < 4; i++) coords[i] = new Point2D(0, 0);
    setShape(Shape.NoShape);
  }

  public void setShape(Shape shape) {
    Point2D[][] coordsTable = {
            {p(0, 0), p(0, 0), p(0, 0), p(0, 0)},
            {p(0, -1), p(0, 0), p(-1, 0), p(-1, 1)},
            {p(0, -1), p(0, 0), p(1, 0), p(1, 1)},
            {p(0, -1), p(0, 0), p(0, 1), p(0, 2)},
            {p(-1, 0), p(0, 0), p(1, 0), p(0, 1)},
            {p(0, 0), p(1, 0), p(0, 1), p(1, 1)},
            {p(-1, -1), p(0, -1), p(0, 0), p(0, 1)},
            {p(1, -1), p(0, -1), p(0, 0), p(0, 1)}
    };
    for (int i = 0; i < 4; i++) coords[i] = coordsTable[shape.ordinal()][i];
    pieceShape = shape;
  }

  public void setRandomShape() {
    Random rand = new Random();
    setShape(Shape.values()[rand.nextInt(7) + 1]);
  }

  public Shape getShape() {
    return pieceShape;
  }

  public int x(int i) {
    return (int) coords[i].getX();
  }

  public int y(int i) {
    return (int) coords[i].getY();
  }

  public int minY() {
    int m = y(0);
    for (int i = 1; i < 4; i++) m = Math.min(m, y(i));
    return m;
  }

  public Tetromino rotateRight() {
    if (pieceShape == Shape.SquareShape) return this;
    Tetromino result = new Tetromino();
    result.setShape(pieceShape);
    for (int i = 0; i < 4; i++)
      result.coords[i] = new Point2D(-coords[i].getY(), coords[i].getX());
    return result;
  }

  public Tetromino rotateLeft() {
    if (pieceShape == Shape.SquareShape) return this;
    Tetromino result = new Tetromino();
    result.setShape(pieceShape);
    for (int i = 0; i < 4; i++)
      result.coords[i] = new Point2D(coords[i].getY(), -coords[i].getX());
    return result;
  }

  private Point2D p(int x, int y) {
    return new Point2D(x, y);
  }
}
