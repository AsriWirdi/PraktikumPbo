package Soal2;

import Soal1.Kursi;

import java.util.Random;

public class KursiApp {
  public static void main(String[] args) {
    Random rand = new Random();

    // Membuat 30 objek Kursi
    Kursi[] daftarKursi = new Kursi[30];

    String[][] dataKursi = {
            {"Kayu Jati", "Tinggi", "Coklat"},
            {"Plastik", "Rendah", "Biru"},
            {"Besi", "Sedang", "Hitam"},
            {"Rotan", "Tinggi", "Coklat Muda"},
            {"Aluminium", "Tanpa Sandaran", "Silver"},
            {"Kain + Kayu", "Tinggi", "Abu-abu"},
            {"Kulit Sintetis", "Sedang", "Hitam"},
            {"Akrilik", "Tanpa Sandaran", "Bening"},
            {"Bambu", "Tinggi", "Hijau"},
            {"Stainless Steel", "Rendah", "Perak"},
            {"Kulit Asli", "Tinggi", "Coklat Tua"},
            {"Kain + Busa", "Sedang", "Merah"},
            {"Kayu Mahoni", "Tinggi", "Marun"},
            {"Anyaman Rotan", "Rendah", "Cream"},
            {"Besi Hollow", "Sedang", "Putih"},
            {"Polypropylene", "Tanpa Sandaran", "Ungu"},
            {"Plastik HDPE", "Rendah", "Kuning"},
            {"Spons", "Sedang", "Pink"},
            {"Kulit + Kayu", "Tinggi", "Hitam"},
            {"Jaring Mesh", "Tinggi", "Abu-abu"},
            {"Aluminium + Busa", "Sedang", "Oranye"},
            {"Kayu Pinus", "Tinggi", "Natural"},
            {"Rotan Sintetis", "Rendah", "Krem"},
            {"Fiberglass", "Tanpa Sandaran", "Putih"},
            {"Kain Beludru", "Tinggi", "Biru Tua"},
            {"Kain Denim", "Sedang", "Navy"},
            {"Kayu Laminasi", "Rendah", "Coklat Muda"},
            {"Kulit PU", "Tinggi", "Hitam"},
            {"PVC", "Sedang", "Merah Marun"},
            {"Busa Latex", "Tinggi", "Hijau Tosca"}
    };


    for (int i = 0; i < 30; i++) {
      String warnaAcak = dataKursi[rand.nextInt(0,30)][2];

      daftarKursi[i] = new Kursi(dataKursi[i][0], dataKursi[i][2]);
      System.out.println((i + 1) + ". Kursi: " + dataKursi[i][0]);
      daftarKursi[i].duduk();
      daftarKursi[i].ubahWarna(warnaAcak);

      System.out.println();
    }
  }
}
