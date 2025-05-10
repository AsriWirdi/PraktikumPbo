package com.example.tugaspraktikum4.Soal1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// Buatlah aplikasi JavaFX sederhana ya   ng menampilkan label dan tombol.
//Ketika tombol ditekan, ubah teks label menjadi “Tombol ditekan!”.

public class btnLabel extends Application {

  @Override
  public void start(Stage stage){
    // buat Label
    Label label = new Label("Tombol");

    // buat Tombol
    Button tombol = new Button("Tekan Ini");

    // Event ketika tombol ditekan
    tombol.setOnAction(e -> {
      label.setText("Tombol ditekan!");
    });



    // susun komponen dalam VBox
    VBox root = new VBox(10); // 10 pixel jarak antar komponen
    root.setAlignment(Pos.CENTER);
    root.getChildren().addAll(label, tombol);

    // buat scene dan menampilkannya
    Scene  scene = new Scene(root,300, 200);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
