package com.example.tugaspraktikum4.Soal6;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzleGame extends Application {

  private static final int ROWS = 4;
  private static final int COLS = 3;
  private static final int TILE_SIZE = 100;

  private List<String> imagePaths = List.of(
          "/gambar/kakMahmuddin.jpg",
          "/gambar/kakBaso.jpg"
  );

  private int currentImageIndex = 0;
  private Image fullImage;
  private List<Tile> tiles = new ArrayList<>();
  private Tile firstSelected = null;

  @Override
  public void start(Stage primaryStage) {
    loadPuzzle(primaryStage);
  }

  private void loadPuzzle(Stage stage) {
    if (currentImageIndex >= imagePaths.size()) {
      stage.setTitle("Semua Puzzle Selesai!");
      return;
    }

    String path = imagePaths.get(currentImageIndex);
    fullImage = new Image(getClass().getResourceAsStream(path));
    tiles.clear();
    firstSelected = null;

    GridPane grid = new GridPane();

    double tileWidth = fullImage.getWidth() / COLS;
    double tileHeight = fullImage.getHeight() / ROWS;

    for (int row = 0; row < ROWS; row++) {
      for (int col = 0; col < COLS; col++) {
        Rectangle2D viewport = new Rectangle2D(
                col * tileWidth,
                row * tileHeight,
                tileWidth,
                tileHeight
        );

        ImageView imageView = new ImageView(fullImage);
        imageView.setViewport(viewport);
        imageView.setFitWidth(TILE_SIZE);
        imageView.setFitHeight(TILE_SIZE);

        Tile tile = new Tile(imageView, row, col);
        tiles.add(tile);
      }
    }

    Collections.shuffle(tiles);

    int index = 0;
    for (int row = 0; row < ROWS; row++) {
      for (int col = 0; col < COLS; col++) {
        Tile tile = tiles.get(index++);
        tile.setCurrentPosition(row, col);
        grid.add(tile.getImageView(), col, row);
        tile.getImageView().addEventHandler(MouseEvent.MOUSE_CLICKED, e -> handleClick(tile, grid, stage));
      }
    }

    Scene scene = new Scene(grid, COLS * TILE_SIZE, ROWS * TILE_SIZE);
    stage.setTitle("Puzzle Gambar ke-" + (currentImageIndex + 1));
    stage.setScene(scene);
    stage.show();
  }

  private void handleClick(Tile clickedTile, GridPane grid, Stage stage) {
    if (firstSelected == null) {
      firstSelected = clickedTile;
      return;
    }

    int firstRow = firstSelected.getCurrentRow();
    int firstCol = firstSelected.getCurrentCol();
    int secondRow = clickedTile.getCurrentRow();
    int secondCol = clickedTile.getCurrentCol();

    grid.getChildren().removeAll(firstSelected.getImageView(), clickedTile.getImageView());

    grid.add(firstSelected.getImageView(), secondCol, secondRow);
    grid.add(clickedTile.getImageView(), firstCol, firstRow);

    firstSelected.setCurrentPosition(secondRow, secondCol);
    clickedTile.setCurrentPosition(firstRow, firstCol);

    firstSelected = null;

    if (isSolved()) {
      System.out.println("Puzzle ke-" + (currentImageIndex + 1) + " selesai!");
      currentImageIndex++;
      loadPuzzle(stage);
    }
  }

  private boolean isSolved() {
    for (Tile tile : tiles) {
      if (!tile.isInCorrectPosition()) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    launch(args);
  }

  class Tile {
    private ImageView imageView;
    private int correctRow;
    private int correctCol;
    private int currentRow;
    private int currentCol;

    public Tile(ImageView imageView, int correctRow, int correctCol) {
      this.imageView = imageView;
      this.correctRow = correctRow;
      this.correctCol = correctCol;
    }

    public ImageView getImageView() {
      return imageView;
    }

    public void setCurrentPosition(int row, int col) {
      this.currentRow = row;
      this.currentCol = col;
    }

    public int getCurrentRow() {
      return currentRow;
    }

    public int getCurrentCol() {
      return currentCol;
    }

    public boolean isInCorrectPosition() {
      return currentRow == correctRow && currentCol == correctCol;
    }
  }
}
