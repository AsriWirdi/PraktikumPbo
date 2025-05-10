package Soal2;

import Soal1.Meja;

public class MejaApp {
  public static void main(String[] args) {


    // Membuat 30 objek Meja
    Meja[] daftarMeja = new Meja[30];

    String[][] dataMeja = {
            {"Persegi", "100", "100", "Cokelat"},
            {"Persegi Panjang", "120", "60", "Hitam"},
            {"Bundar", "90", "90", "Putih"},
            {"Oval", "150", "80", "Abu-abu"},
            {"Persegi", "80", "80", "Merah"},
            {"Persegi Panjang", "140", "70", "Biru"},
            {"Bundar", "100", "100", "Hijau"},
            {"Oval", "130", "75", "Krem"},
            {"Persegi", "110", "110", "Kuning"},
            {"Persegi Panjang", "160", "80", "Cokelat Tua"},
            {"Bundar", "85", "85", "Putih Gading"},
            {"Oval", "145", "85", "Hitam Doff"},
            {"Persegi", "95", "95", "Biru Laut"},
            {"Persegi Panjang", "125", "65", "Hijau Muda"},
            {"Bundar", "105", "105", "Merah Marun"},
            {"Oval", "155", "90", "Silver"},
            {"Persegi", "70", "70", "Cokelat Muda"},
            {"Persegi Panjang", "135", "75", "Hitam"},
            {"Bundar", "95", "95", "Kuning Emas"},
            {"Oval", "140", "80", "Putih"},
            {"Persegi", "120", "120", "Cokelat Gelap"},
            {"Persegi Panjang", "150", "90", "Abu-abu"},
            {"Bundar", "100", "100", "Merah Tua"},
            {"Oval", "135", "70", "Hijau Botol"},
            {"Persegi", "90", "90", "Krem"},
            {"Persegi Panjang", "145", "85", "Cokelat"},
            {"Bundar", "88", "88", "Biru"},
            {"Oval", "150", "78", "Putih"},
            {"Persegi", "100", "100", "Pink"},
            {"Persegi Panjang", "160", "85", "Abu Misty"}
    };


    for (int i = 0; i < 30; i++) {

      daftarMeja[i] = new Meja(dataMeja[i][0], Double.parseDouble(dataMeja[i][1]), Double.parseDouble(dataMeja[i][2]), dataMeja[i][3]);
      System.out.println("Meja " + (i + 1));
      daftarMeja[i].ubahWarna(dataMeja[i][3]);
      daftarMeja[i].tampilkanInfo();

      System.out.println();
    }
  }
}
