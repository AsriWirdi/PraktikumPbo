package com.example.tugaspraktikum4.Soal4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KonversiUsdToIdr extends Application {

  @Override
  public void start(Stage stage) {
    // Label input nilai
    Label lblDari = new Label("Dari Mata Uang: ");
    Label lblKe = new Label("Ke Mata Uang: ");
    // ComboBox untuk pilih dari mata uang
    ComboBox<String> cbDari = new ComboBox<>();
    // isi ComboBox cbDari
    cbDari.getItems().addAll("Dolar" , "Rupiah");

    // ComboBox untuk pilih ke mata uang
    ComboBox<String> cbKe = new ComboBox<>();
    // isi ComboBox cbKe
    cbKe.getItems().addAll("Dolar" , "Rupiah");

    // set nilai default ComboBox
    cbDari.setValue("Dolar");
    cbKe.setValue("Rupiah");

    // TextField untuk input
    TextField in = new TextField();

    Label lblOut = new Label("Hasil: " );
    lblOut.setId("lblHasil");


    // tombol konversi
    Button btnKonversi = new Button("Konversi");

    btnKonversi.setOnAction(e -> {
      try{
        double input = Integer.parseInt(in.getText());
         String satuanDari = cbDari.getValue();
         String satuanKe = cbKe.getValue();

         double hasil = konversi(input, satuanDari, satuanKe);
         lblOut.setText(String.format("Hasil: %.2f %s" , hasil ,satuanKe));
      } catch (NumberFormatException ex){
        lblOut.setText("Input harus Angka!");

      }
    });

    // layout
    GridPane root = new GridPane();
    root.setHgap(10);
    root.setVgap(10);
    root.setStyle("-fx-padding: 20;");

    root.add(lblDari, 0, 0);
    root.add(cbDari, 1, 0);
    root.add(lblKe, 0, 1);
    root.add(cbKe, 1, 1);
    root.add(in, 1, 2);
    root.add(btnKonversi, 0, 3);
    root.add(lblOut, 1, 3);

    // Scene
    Scene scene = new Scene(root, 600, 350);
    stage.setTitle("Konversi Mata Uang");
    stage.setScene(scene);
    scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

  private double konversi(double input, String satuanDari, String satuanKe) {
    double rupiah = 0;
    double hasil = 0;

    switch (satuanDari) {
      case "Dolar" -> rupiah = input * 16_531;
      case "Rupiah" -> rupiah = input;
    }

    switch (satuanKe) {
      case "Dolar" -> hasil = rupiah / 16_531;
      case "Rupiah" -> hasil = rupiah;
    }

    return hasil;
  }
}

