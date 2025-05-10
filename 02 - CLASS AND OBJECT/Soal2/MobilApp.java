package Soal2;

import Soal1.Mobil;
import java.util.Random;

public class MobilApp {
  public static void main(String[] args) {
    // Membuat 30 objek Mobil
    Mobil[] daftarMobil = new Mobil[30];

    // Daftar merek dan warna yang bisa dipilih secara acak
    Random rd = new Random();
    String[] merkList = {"Toyota", "Honda", "BMW", "Mercedes", "Ford"};
    String[] warnaList = {"Merah", "Hitam", "Putih", "Biru", "Abu-Abu"};


    for (int i = 0; i < 30; i++) {
      // Memilih merk dan warna secara acak
      String merkAcak = merkList[rd.nextInt(merkList.length)];
      String warnaAcak = warnaList[rd.nextInt(warnaList.length)];

      daftarMobil[i] = new Mobil(merkAcak,warnaAcak);
      System.out.println("Mobil " + (i + 1) + ": Merk = " + daftarMobil[i].merk + ", Warna = " + daftarMobil[i].warna);

      daftarMobil[i].nyalakanMesin();
      daftarMobil[i].jalan();
      daftarMobil[i].rem();
      daftarMobil[i].matikanMesin();
      System.out.println();
    }
  }
}
