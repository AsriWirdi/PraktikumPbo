package com.example.tugaspraktikum4.Soal5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GuiTranskipCRUD extends Application {

  private TextField tkodeMk, tMataKuliah, tSks, tNilai;
  private TableView<Data> table;
  private ObservableList<Data> dataList;
  private Data selectedData = null;

  @Override
  public void start(Stage stage) {
    Label title = new Label("Data Transkrip");
    tkodeMk = new TextField();
    tMataKuliah = new TextField();
    tSks = new TextField();
    tNilai = new TextField();

    Button btnGetData = new Button("Tambah Data");
    Button btnEdit = new Button("Edit Data");
    Button btnDelete = new Button("Hapus Data");

    btnGetData.setOnAction(e -> tambahData());
    btnEdit.setOnAction(e -> editData());
    btnDelete.setOnAction(e -> hapusData());

    // VBox (side panel)
    VBox side = new VBox(10);
    side.setPadding(new Insets(20, 10, 10, 20));
    side.setMinWidth(200); // supaya tidak collapse

    side.getChildren().addAll(
            title,
            createField("kodeMk        ", tkodeMk),
            createField("Mata Kuliah  ", tMataKuliah),
            createField("Sks                ", tSks),
            createField("Nilai              ", tNilai),
            btnGetData, btnEdit, btnDelete
    );

    // Table
    String[] columnNames = {"kodeMk", "MataKuliah", "Sks", "Nilai"}; // Nama kolom tabel
    table = new TableView<>(); // komponen ui untuk menampilkan data dalam bentuk tabel
    dataList = FXCollections.observableArrayList(); // sumber data bagi tabel (harus di kaitkan ke table.setItems(dataList)

    for (String colName : columnNames) {
      TableColumn<Data, String> col = new TableColumn<>(colName); // buat kolom dengan header sesuai string
      col.setCellValueFactory(new PropertyValueFactory<>(colName));  // Menyambungkan kolom dengan property dari class Data.
      col.setPrefWidth(150); // atur lebar kolom
      col.setStyle("-fx-alignment: CENTER; -fx-padding: 8px;"); // style supaya teks di tengah padding
      table.getColumns().addAll(col); // menambahkan kolom yang sudah di buat ke table.
    }

    table.setItems(dataList); // kaitkan table dengan dataListnya

    table.setOnMouseClicked(e -> pilihData());

    // SplitPane untuk membuat VBox side bisa di-resize
    SplitPane splitPane = new SplitPane();
    splitPane.getItems().addAll(side, table);
    splitPane.setDividerPositions(0.33); // 33% untuk side, 67% untuk tabel

    // tata letak BorderPane
    BorderPane root = new BorderPane();

    // Tambahkan splitPane ke root
    root.setCenter(splitPane);

    // Stage dan Scene
    stage.setTitle("CRUD TRANSKIP");
    Scene scene = new Scene(root, 900, 700);
    stage.setScene(scene);

    // Styling
    side.setStyle("-fx-background-color:#9ad49f;");
    title.setStyle("-fx-font-size:18px; -fx-text-fill:black; -fx-font-weight: bold;");
    btnGetData.setStyle("-fx-background-color:#d4edd6;-fx-text-fill:black; -fx-font-weight: bold; ");
    btnEdit.setStyle("-fx-background-color:#d4edd6;-fx-text-fill:black;-fx-font-weight: bold;");
    btnDelete.setStyle("-fx-background-color:#d4edd6;-fx-text-fill:black;-fx-font-weight: bold;");
    table.setStyle("-fx-font-size:14px");

    muatDataDariCSV();
    stage.show();
  }

  private HBox createField(String labelText, TextField textField) {
    Label label = new Label(labelText + ":");
    textField.setMaxWidth(200);
    HBox field = new HBox(10, label, textField);
    textField.setStyle("-fx-background-color:transparent; -fx-border-color:#d4edd6; -fx-border-width:2px;-fx-text-fill:black;-fx-padding:5px;");
    label.setStyle("-fx-text-fill:black;-fx-font-size:14px;");
    return field;
  }

  private void muatDataDariCSV() {
    String filename = "transkrip.csv";
    Path path = Path.of(filename);
    ArrayList<Data> data = new ArrayList<>();
    try {
      List<String> baris = Files.readAllLines(path);
      for (int i = 1; i < baris.size(); i++) {
        String line = baris.get(i);
        String[] elements = line.split(";");
        String kodeMk = elements[0];
        String mk = elements[1];
        String sks = elements[2];
        String nilai = elements[3];
        Data mhs = new Data(kodeMk,mk,sks,nilai);
        data.add(mhs);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    dataList.clear();
    dataList.addAll(data);
  }

  private void tambahData() {
    if (tkodeMk.getText().isEmpty() || tMataKuliah.getText().isEmpty() ||
            tSks.getText().isEmpty() || tNilai.getText().isEmpty() ) {
      System.out.println("Semua field harus diisi!");
      return;
    }

    Data mahasiswa = new Data(tkodeMk.getText(), tMataKuliah.getText(), tSks.getText(), tNilai.getText());
    dataList.add(mahasiswa);
    clearField();
    simpanDataKeCSV();
  }

  private void clearField() {
    tkodeMk.clear();
    tMataKuliah.clear();
    tSks.clear();
    tNilai.clear();
  }

  private void simpanDataKeCSV() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("transkrip.csv"))) {
      writer.write("Kode MK;Matakuliah;SKS;Nilai\n");
      for (Data mhs : dataList) {
        writer.write(String.format("%s;%s;%s;%s\n", mhs.getKodeMk(), mhs.getMataKuliah(),
                mhs.getSks(), mhs.getNilai()));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private void pilihData() {
    selectedData = table.getSelectionModel().getSelectedItem();
    if (selectedData != null) {
      tkodeMk.setText(selectedData.getKodeMk());
      tMataKuliah.setText(selectedData.getMataKuliah());
      tSks.setText(selectedData.getSks());
      tNilai.setText(selectedData.getNilai());
    }
  }

  private void editData() {
    if (selectedData != null) {
      selectedData.setKodeMk(tkodeMk.getText());
      selectedData.setMataKuliah(tMataKuliah.getText());
      selectedData.setSks(tSks.getText());
      selectedData.setNilai(tNilai.getText());
      table.refresh();
      clearField();
      simpanDataKeCSV();
      selectedData = null;
    }
  }

  private void hapusData() {
    if (selectedData != null) {
      dataList.remove(selectedData);
      clearField();
      simpanDataKeCSV();
      selectedData = null;
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
