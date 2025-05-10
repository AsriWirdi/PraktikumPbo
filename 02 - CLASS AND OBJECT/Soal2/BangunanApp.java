package Soal2;

import Soal1.Bangunan;

import java.util.Random;

public class BangunanApp {
  public static void main(String[] args) {
    // Membuat 30 objek Bangunan
    Bangunan[] daftarBangunan = new Bangunan[30];

    // Daftar nama bangunan yang bisa dipilih secara acak
    Random rd = new Random();
    String[] daftarNama = {
            "Gedung A", "Gedung B", "Gedung C", "Plaza Sentral", "Menara Cahaya",
            "Ruko Jaya", "Apartemen Mentari", "Hotel Bintang", "Kantor Pusat", "Mall Agung"
    };


    for (int i = 0; i < 30; i++) {
      // Memilih tinggi dan jumlahLantai secara acak
      String daftarNamaAcak = daftarNama[rd.nextInt(daftarNama.length)];
      int tinggiAcak = rd.nextInt(10, 100);
      int jumlahLantaiAcak = rd.nextInt(1, 5);


      daftarBangunan[i] = new Bangunan(daftarNamaAcak,tinggiAcak,jumlahLantaiAcak);
      System.out.println((i + 1) + ". Bangunan: " + daftarNamaAcak);
      daftarBangunan[i].renovasi();
      daftarBangunan[i].tampilkanInfo();



      System.out.println();
    }
  }
}
