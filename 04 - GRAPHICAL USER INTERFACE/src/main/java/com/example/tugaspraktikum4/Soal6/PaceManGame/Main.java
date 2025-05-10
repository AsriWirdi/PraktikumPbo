package com.example.tugaspraktikum4.Soal6.PaceManGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
    GameBoard gameBoard = new GameBoard();
    Scene scene = new Scene(gameBoard, 600, 600);
    primaryStage.setTitle("Pac-Man");
    primaryStage.setScene(scene);
    primaryStage.show();

    gameBoard.requestFocus();
    gameBoard.startGame();
  }

  public static void main(String[] args) {
    launch(args);
  }
}

