package Soal2;

import Soal1.Helm;

import java.util.Random;


public class HelmApp {
  public static void main(String[] args) {
    Random rand = new Random();

    // Membuat 30 objek Helm
    Helm[] daftarHelm = new Helm[30];

    String[] merekHelm = {
            "KYT",
            "NHK",
            "INK",
            "GM",
            "Cargloss",
            "BMC",
            "MDS",
            "ZEUS",
            "Arai",
            "Shoei",
            "AGV",
            "HJC",
            "Scorpion",
            "Shark",
            "LS2",
            "Nolan",
            "Bell",
            "Axxis",
            "VOX",
            "Bogo",
            "GIX",
            "Index",
            "Snail",
            "X-Lite",
            "One3",
            "HIU",
            "VOG",
            "JPX",
            "JPN",
            "Real Helm"
    };

    String[] ukuranHelm = {
            "S", "M", "L", "XL"
    };

    String[] warnaHelm = {
            "Hitam", "Putih", "Biru"
    };

    for (int i = 0; i < 30; i++) {
      // ukuran acak
      String ukuran = ukuranHelm[rand.nextInt(ukuranHelm.length)];

      // warna acak
      String warna = warnaHelm[rand.nextInt(warnaHelm.length)];

      daftarHelm[i] = new Helm(merekHelm[i]);
      System.out.println((i + 1) + ". Helm: " + merekHelm[i]);
      daftarHelm[i].pakai();
      daftarHelm[i].lepas();

      System.out.println();
    }
  }
}
