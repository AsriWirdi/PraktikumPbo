package Soal2;

import Soal1.Buku;


public class BukuApp {
  public static void main(String[] args) {
    // Membuat 30 objek Buku
    Buku[] daftarBuku = new Buku[30];

    String[][] bukuData = {
            {"Laskar Pelangi", "Andrea Hirata"},
            {"Perahu Kertas", "Dewi Lestari"},
            {"Pulang", "Tere Liye"},
            {"Bumi", "Tere Liye"},
            {"Negeri 5 Menara", "Ahmad Fuadi"},
            {"Ayat-Ayat Cinta", "Habiburrahman El Shirazy"},
            {"Dilan 1990", "Pidi Baiq"},
            {"Ronggeng Dukuh Paruk", "Ahmad Tohari"},
            {"Supernova", "Dewi Lestari"},
            {"Rectoverso", "Dewi Lestari"},
            {"Sang Pemimpi", "Andrea Hirata"},
            {"Edensor", "Andrea Hirata"},
            {"Cinta Brontosaurus", "Raditya Dika"},
            {"Koala Kumal", "Raditya Dika"},
            {"Manusia Setengah Salmon", "Raditya Dika"},
            {"Sabtu Bersama Bapak", "Adhitya Mulya"},
            {"Garis Waktu", "Fiersa Besari"},
            {"Catatan Juang", "Fiersa Besari"},
            {"Tentang Kamu", "Tere Liye"},
            {"Hujan", "Tere Liye"},
            {"Rindu", "Tere Liye"},
            {"Daun yang Jatuh Tak Pernah Membenci Angin", "Tere Liye"},
            {"Jakarta Sebelum Pagi", "Ziggy Zezsyazeoviennazabrizkie"},
            {"Aroma Karsa", "Dee Lestari"},
            {"Laut Bercerita", "Leila S. Chudori"},
            {"Amba", "Laksmi Pamuntjak"},
            {"Saman", "Ayu Utami"},
            {"Larung", "Ayu Utami"},
            {"Padang Bulan", "Andrea Hirata"},
            {"Maryam", "Okky Madasari"}
    };

    for (int i = 0; i < 30; i++) {

      daftarBuku[i] = new Buku(bukuData[i][0], bukuData[i][1]);
      System.out.println((i + 1) + ". Buku: " + bukuData[i][0] + " - " + bukuData[i][1]);
      daftarBuku[i].buka();
      daftarBuku[i].baca();
      daftarBuku[i].tutup();

      System.out.println();
    }
  }
}
