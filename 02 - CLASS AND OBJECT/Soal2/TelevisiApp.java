package Soal2;

import Soal1.Televisi;

import java.util.Random;

public class TelevisiApp {
  public static void main(String[] args) {
    Random rand = new Random();

    // Membuat 30 objek Televisi
    Televisi[] daftarPrinter = new Televisi[30];

    String[][] dataTelevisi = {
            {"Samsung", "Netflix"},
            {"LG", "YouTube"},
            {"Sony", "HBO"},
            {"Panasonic", "Disney+ Hotstar"},
            {"Sharp", "MNC TV"},
            {"Toshiba", "RCTI"},
            {"Polytron", "SCTV"},
            {"Coocaa", "TVRI"},
            {"Changhong", "NET"},
            {"TCL", "Kompas TV"},
            {"Philips", "Indosiar"},
            {"Akari", "Trans TV"},
            {"Hitachi", "Trans 7"},
            {"Hisense", "CNN Indonesia"},
            {"Aqua", "Metro TV"},
            {"Haier", "ANTV"},
            {"Mito", "TV One"},
            {"Advance", "BBC News"},
            {"Xiaomi", "Disney+ Hotstar"},
            {"Realme", "Netflix"},
            {"Hyundai", "FOX Movies"},
            {"NEO", "Nat Geo"},
            {"Vizio", "HBO GO"},
            {"Konka", "iNews"},
            {"Sanken", "RTV"},
            {"Skyworth", "MNCTV"},
            {"Digitec", "Global TV"},
            {"Daewoo", "CCTV News"},
            {"LeEco", "Amazon Prime"},
            {"Infinix", "Vidio"}
    };

    for (int i = 0; i < 30; i++) {
      String randChannel = dataTelevisi[rand.nextInt(0,30)][1];

      daftarPrinter[i] = new Televisi(dataTelevisi[i][0], dataTelevisi[i][1]);
      System.out.println((i + 1) + ". Televisi: " + dataTelevisi[i][0]);
      daftarPrinter[i].nyalakan();
      daftarPrinter[i].gantiChannel(randChannel);
      daftarPrinter[i].matikan();

      System.out.println();
    }
  }
}
