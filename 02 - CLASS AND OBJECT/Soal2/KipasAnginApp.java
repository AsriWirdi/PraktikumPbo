package Soal2;

import Soal1.KipasAngin;

import java.util.Random;

public class KipasAnginApp {
  public static void main(String[] args) {
    Random rand = new Random();

    // Membuat 30 objek KipasAngin
    KipasAngin[] daftarKipasAngin = new KipasAngin[30];

    String[] merekKipasAngin = {
            "Panasonic",
            "Mistral",
            "National",
            "Sharp",
            "KDK",
            "Cosmos",
            "Miyako",
            "Oxone",
            "Claris",
            "Arctic",
            "Emery",
            "Delizia",
            "Bionaire",
            "Vornado",
            "Honeywell",
            "Fanco",
            "Trisonic",
            "Sanyo",
            "Kaila",
            "Everton",
            "Geson",
            "Alva",
            "Tornado",
            "Air King",
            "Vornado",
            "Fischer",
            "Zebra",
            "Hasegawa",
            "Maxtron",
            "Blizzard"
    };


    for (int i = 0; i < 30; i++) {
      int kecepatanAcak = rand.nextInt(0,4);

      daftarKipasAngin[i] = new KipasAngin(merekKipasAngin[i]);
      System.out.println((i + 1) + ". KipasAngin: " + merekKipasAngin[i]);
      daftarKipasAngin[i].nyalakan();
      daftarKipasAngin[i].aturKecepatan(kecepatanAcak);
      daftarKipasAngin[i].matikan();

      System.out.println();
    }
  }
}
