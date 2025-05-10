package com.example.tugaspraktikum4.Soal2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KonversiSI extends Application {

  public void start(Stage stage) {

    // komponen
    // input angka
    Label lblInput = new Label("Masukkan Nilai: ");
    TextField tfInput = new TextField();


    // pilih satuan asal dan satuan tujuan
    Label lblDari = new Label("Dari: ");
    ComboBox<String> cbDari = new ComboBox<>();

    Label lblKe = new Label("Ke: ");
    ComboBox<String> cbKe = new ComboBox<>();

    // klik tombol -> hasil konversi tampil
    Button btnKonversi = new Button("Konversi");
    Label lblHasil = new Label("Hasil: ");
    lblHasil.setId("lblHasil");

    // Isi ComboBox
    cbDari.getItems().addAll("km", "hm", "dam", "m", "dm", "cm", "mm");
    cbKe.getItems().addAll("km", "hm", "dam", "m", "dm", "cm", "mm");
    cbDari.setValue("m"); // default
    cbKe.setValue("cm"); // default

    // Event tombol
    btnKonversi.setOnAction(f -> {
      try {
        double input = Double.parseDouble(tfInput.getText());
        String satuanDari = cbDari.getValue();
        String satuanKe = cbKe.getValue();

        double hasil = konversi(input, satuanDari, satuanKe);
        lblHasil.setText("Hasil: " + hasil + " " + satuanKe);
      } catch (NumberFormatException ex) {
        lblHasil.setText("Input harus Angka!");
      }
    });

    // Layout
    GridPane root = new GridPane();
    root.setVgap(10);
    root.setHgap(10);
    root.setPadding(new Insets(20));

    root.add(lblInput, 0, 0);
    root.add(tfInput, 1, 0);
    root.add(lblDari, 0, 1);
    root.add(cbDari, 1, 1);
    root.add(lblKe, 0, 2);
    root.add(cbKe, 1, 2);
    root.add(btnKonversi, 0, 3);
    root.add(lblHasil, 1, 3);

    Scene scene = new Scene(root, 400, 250);
    stage.setTitle("Konversi panjang");
    scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
    stage.setScene(scene);
    stage.show();
  }

   public static void main(String[] args) {
     launch(args);
   }

  // method konversi
  private double konversi(double nilai, String dari, String ke) {
    double meter = 0;
    double hasil = 0;

    // ubah semua ke meter dulu
    switch (dari) {
      case "km" -> meter = nilai * 1000;
      case "hm" -> meter = nilai * 100;
      case "dam" -> meter = nilai * 10;
      case "m" -> meter = nilai;
      case "dm" -> meter = nilai / 10;
      case "cm" -> meter = nilai / 100;
      case "mm" -> meter = nilai  / 1000;
    }

    // ubah dari meter ke satuan tujuan
    switch (ke) {
      case "km" -> hasil = meter / 1000;
      case "hm" -> hasil = meter / 100;
      case "dam" -> hasil = meter / 10;
      case "m" -> hasil = meter;
      case "dm" -> hasil = meter * 10;
      case "cm" -> hasil = meter * 100;
      case "mm" -> hasil = meter * 1000;
    }
    return hasil;
  }
}

