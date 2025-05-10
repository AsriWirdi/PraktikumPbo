package Soal2;

import Soal1.Kulkas;

import java.util.Random;

public class KulkasApp {
  public static void main(String[] args) {
    Random rand = new Random();

    // Membuat 30 objek Kulkas
    Kulkas[] daftarKulkas = new Kulkas[30];

    String[][] dataKulkas = {
            {"Kulkas 1 Pintu Sharp", "-5"},
            {"Kulkas 2 Pintu LG", "-18"},
            {"Kulkas Side by Side Samsung", "-20"},
            {"Kulkas Mini Polytron", "4"},
            {"Kulkas Showcase Aqua", "3"},
            {"Kulkas 1 Pintu Panasonic", "-6"},
            {"Kulkas 2 Pintu Toshiba", "-17"},
            {"Kulkas Inverter LG", "-20"},
            {"Kulkas Portable Midea", "5"},
            {"Kulkas Chest Freezer Modena", "-25"},
            {"Kulkas Upright Freezer GEA", "-22"},
            {"Kulkas Side by Side Electrolux", "-21"},
            {"Kulkas Top Freezer Samsung", "-18"},
            {"Kulkas Bottom Freezer Beko", "-20"},
            {"Kulkas French Door Hitachi", "-23"},
            {"Kulkas Mini USB", "8"},
            {"Kulkas 2 Pintu Sanken", "-18"},
            {"Kulkas 1 Pintu Aqua", "-5"},
            {"Kulkas Showroom Cooler Sharp", "3"},
            {"Kulkas Portable USB Xiaomi", "10"},
            {"Kulkas 2 Pintu Polytron Belleza", "-19"},
            {"Kulkas Freezer Box RSA", "-22"},
            {"Kulkas Showcase Modena", "2"},
            {"Kulkas French Door LG", "-24"},
            {"Kulkas Portable Car Cooler", "6"},
            {"Kulkas 2 Pintu Samsung RT29", "-18"},
            {"Kulkas Side by Side Panasonic NR", "-20"},
            {"Kulkas Upright Freezer Hisense", "-22"},
            {"Kulkas Mini Electrolux", "4"},
            {"Kulkas Chest Freezer Sharp", "-26"}
    };


    for (int i = 0; i < 30; i++) {
      int suhuAcak = rand.nextInt(-30,5);

      daftarKulkas[i] = new Kulkas(dataKulkas[i][0],Integer.parseInt(dataKulkas[i][1]));
      System.out.println((i + 1) + ". Kulkas: " +dataKulkas[i][0]);
      daftarKulkas[i].aturSuhu(suhuAcak);
      daftarKulkas[i].bukaPintu();
      daftarKulkas[i].tutupPintu();

      System.out.println();
    }
  }
}
