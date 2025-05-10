package Soal2;

import Soal1.Hewan;

public class HewanApp {
  public static void main(String[] args) {

    // Membuat 30 objek Hewan
    Hewan[] daftarHewan = new Hewan[30];

    String[][] dataHewan = {
            {"Kucing", "Mamalia", "3"},
            {"Anjing", "Mamalia", "5"},
            {"Kelinci", "Mamalia", "2"},
            {"Burung Merpati", "Burung", "4"},
            {"Ikan Koi", "Ikan", "6"},
            {"Kuda", "Mamalia", "10"},
            {"Sapi", "Mamalia", "8"},
            {"Ayam", "Unggas", "3"},
            {"Bebek", "Unggas", "4"},
            {"Kambing", "Mamalia", "7"},
            {"Hamster", "Mamalia", "2"},
            {"Tikus", "Mamalia", "1"},
            {"Kura-kura", "Reptil", "30"},
            {"Iguana", "Reptil", "8"},
            {"Buaya", "Reptil", "25"},
            {"Harimau", "Mamalia", "15"},
            {"Singa", "Mamalia", "12"},
            {"Gajah", "Mamalia", "40"},
            {"Zebra", "Mamalia", "20"},
            {"Panda", "Mamalia", "18"},
            {"Koala", "Mamalia", "10"},
            {"Rubah", "Mamalia", "7"},
            {"Lumba-lumba", "Mamalia", "20"},
            {"Paus", "Mamalia", "60"},
            {"Elang", "Burung", "15"},
            {"Kakatua", "Burung", "30"},
            {"Penguin", "Burung", "20"},
            {"Ular", "Reptil", "9"},
            {"Katak", "Amfibi", "4"},
            {"Komodo", "Reptil", "50"}
    };

    for (int i = 0; i < 30; i++) {

      daftarHewan[i] = new Hewan(dataHewan[i][0],dataHewan[i][1],Integer.parseInt(dataHewan[i][2]));
      System.out.println((i + 1) + ". Hewan: " + dataHewan[i][0]);
      daftarHewan[i].makan();
      daftarHewan[i].suara();
      daftarHewan[i].tidur();

      System.out.println();
    }
  }
}
