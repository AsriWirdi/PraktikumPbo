package Soal2;

import Soal1.Lampu;

public class LampuApp {
  public static void main(String[] args) {


    // Membuat 30 objek Lampu
    Lampu[] daftarLampu = new Lampu[30];

    String[] warnaLampu = {
            "Putih",
            "Kuning",
            "Biru",
            "Merah",
            "Hijau",
            "Ungu",
            "Oranye",
            "Pink",
            "Cyan",
            "Amber",
            "Magenta",
            "Biru Muda",
            "Biru Gelap",
            "Hijau Muda",
            "Hijau Tua",
            "Kuning Emas",
            "Kuning Lemon",
            "Merah Muda",
            "Merah Tua",
            "Putih Hangat",
            "Putih Dingin",
            "Putih Netral",
            "Biru Neon",
            "Merah Neon",
            "Hijau Neon",
            "Biru Laut",
            "Lavender",
            "Turquoise",
            "Silver",
            "Gold"
    };


    for (int i = 0; i < 30; i++) {

      daftarLampu[i] = new Lampu(warnaLampu[i]);
      System.out.println((i + 1) + ". Warna Lampu: " + warnaLampu[i]);
      daftarLampu[i].nyalakan();
      daftarLampu[i].matikan();

      System.out.println();
    }
  }
}
