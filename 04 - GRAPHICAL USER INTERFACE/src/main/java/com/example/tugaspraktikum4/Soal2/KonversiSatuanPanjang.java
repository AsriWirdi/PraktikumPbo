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

//Buatlah program GUI Java untuk mengkonversi satuan panjang Sistem
//Internasional (km, hm, dam, m, dm, cm, mm)
public class KonversiSatuanPanjang extends Application {
  private static final String[] satuan = {
          "km", "hm", "dam", "m", "dm", "cm", "mm"
  };
  private static final double[] faktor = {
          1_000_000.0, // km ke mm
          100_000.0, // hm ke mm
          10_000.0, // dam ke mm
          1_000.0, // m ke mm
          100.0, // dm ke mm
          10.0, // cm ke mm
          1.0, // mm ke mm
  };

  @Override
  public void start(Stage stage) {
    // komponen input
    TextField inputNilai = new TextField();
    ComboBox<String> comboAsal = new ComboBox<>();
    ComboBox<String> comboTujuan = new ComboBox<>();
    Button btnKonversi = new Button("Konversi");
    Label lblHasil = new Label();

    comboAsal.getItems().addAll(satuan);
    comboTujuan.getItems().addAll(satuan);
    comboAsal.getSelectionModel().select("m");
    comboTujuan.getSelectionModel().select("cm");

    // Event konversi
    btnKonversi.setOnAction(e -> {
      try{
        double nilaiInput = Double.parseDouble(inputNilai.getText());
        String asal = comboAsal.getValue();
        String tujuan = comboTujuan.getValue();

        // Konversi satuan ke mm, lalu ke satuan tujuan
        double nilaiDalamMM = nilaiInput * getFaktor(asal);
        double hasil = nilaiDalamMM / getFaktor(tujuan);

        lblHasil.setText(String.format("%.1f %s", hasil, tujuan));
      } catch (NumberFormatException ex){
        lblHasil.setText("Input tidak Valid!");
      }
    });

    // Layout
    GridPane root = new GridPane();
    root.setPadding(new Insets(20));
    root.setHgap(10);
    root.setVgap(10);

    root.add(new Label ("Nilai:"),0,0);
    root.add(inputNilai,1,0);
    root.add(new Label("Dari:"),0,1);
    root.add(comboAsal,1,1);
    root.add(new Label("Ke:"),0,2);
    root.add(comboTujuan,1,2);
    root.add(btnKonversi,0,3);
    root.add(lblHasil,1,3);

    // Scene dan Stage
    Scene scene = new Scene(root, 350, 200);
    stage.setTitle("Konversi Panjang SI");
    stage.setScene(scene);
    stage.show();
  }

  private double getFaktor(String satuanInput) {
    for (int i = 0; i < satuan.length; i++) {
      if (satuan[i].equals(satuanInput)) {
        return faktor[i];
      }
    }
    return 1.0;
  }
  public static void main(String[] args) {
    launch(args);
  }
}
