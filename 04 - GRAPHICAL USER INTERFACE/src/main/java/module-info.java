module com.example.tugaspraktikum4 {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.tugaspraktikum4 to javafx.fxml;
  exports com.example.tugaspraktikum4.Soal1;
  exports com.example.tugaspraktikum4.Soal2;
  exports com.example.tugaspraktikum4.Soal3;
  exports com.example.tugaspraktikum4.Soal4;
  exports com.example.tugaspraktikum4.Soal5;
  exports com.example.tugaspraktikum4.Soal6;
  exports com.example.tugaspraktikum4.test;
  exports com.example.tugaspraktikum4.Soal6.PaceManGame;
}
