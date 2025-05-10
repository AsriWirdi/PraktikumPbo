package com.example.tugaspraktikum4.Soal3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KonversiNilaiMatkul extends Application {

  @Override
  public void start(Stage stage) {
    // Label input nilai
    Label lblIn = new Label("Nilai Matkul: ");

    // TextField untuk input
    TextField in = new TextField();

    Label lblOut = new Label("Nilai Konversi Matkul: ");
    lblOut.setId("lblHasil");

    // tombol konversi
    Button btnKonversi = new Button("Konversi");

    btnKonversi.setOnAction(e -> {

      String inputChar = in.getText().trim().toUpperCase();

      String hasil = "";

      // pengecekan
      try {
        int inputAngka = Integer.parseInt(in.getText());
        if (inputAngka <= 100 && inputAngka >= 90) {
          hasil = "A";
        } else if (inputAngka < 90 && inputAngka >= 85) {
          hasil = "A-";
        } else if (inputAngka < 84 && inputAngka >= 70) {
          hasil = "B";
        } else if (inputAngka < 70 && inputAngka >= 65) {
          hasil = "B-";
        } else if (inputAngka < 65 && inputAngka >= 60) {
          hasil = "C";
        } else if (inputAngka < 60 && inputAngka >= 50) {
          hasil = "D";
        } else if (inputAngka < 50 && inputAngka >= 0) {
          hasil = "E";
        } else {
          hasil = "Masukkan input yang sesuai (0-100)";
        }

      } catch (NumberFormatException ex) {

        switch (inputChar) {
          case "A" -> hasil = "90-100";
          case "A-" -> hasil = "85-89";
          case "B" -> hasil = "70-84";
          case "B-" -> hasil = "65-69";
          case "C" -> hasil = "60-64";
          case "D" -> hasil = "50-59";
          case "E" -> hasil = "0-49";
          default -> hasil = "Masukkan input yang sesuai (A, A-, B, B-, C, D, E)";
        }
      }

      lblOut.setText("Hasil Konversi : " + hasil);

    });

    // layout
    GridPane root = new GridPane();
    root.setHgap(10);
    root.setVgap(10);
    root.setStyle("-fx-padding: 20;");

    root.add(lblIn, 0, 0);
    root.add(in, 1, 0);
    root.add(btnKonversi, 0, 2);
    root.add(lblOut, 1, 2);

    // Scene
    Scene scene = new Scene(root, 600, 350);
    stage.setTitle("Konversi Matkul");
    stage.setScene(scene);
    scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
    stage.setResizable(false);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
