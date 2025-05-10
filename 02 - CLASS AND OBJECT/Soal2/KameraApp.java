package Soal2;

import Soal1.Kamera;

public class KameraApp {
  public static void main(String[] args) {

    // Membuat 30 objek Kamera
    Kamera[] daftarKamera = new Kamera[30];

    String[][] kameraData = {
            {"Canon EOS R5", "45"},
            {"Nikon Z9", "45.7"},
            {"Sony Alpha a7R IV", "61"},
            {"Fujifilm X-T4", "26.1"},
            {"Panasonic Lumix GH6", "25.2"},
            {"Olympus OM-D E-M1 Mark III", "20.4"},
            {"Leica Q2", "47.3"},
            {"Pentax K-1 Mark II", "36.4"},
            {"GoPro Hero 11", "27"},
            {"DJI Osmo Action 3", "12"},
            {"Sony ZV-E10", "24.2"},
            {"Canon EOS M50 Mark II", "24.1"},
            {"Nikon D850", "45.7"},
            {"Sony Alpha a1", "50.1"},
            {"Fujifilm GFX 100S", "102"},
            {"Panasonic Lumix S5", "24.2"},
            {"Leica SL2", "47"},
            {"Canon EOS 90D", "32.5"},
            {"Nikon Z7 II", "45.7"},
            {"Sony RX100 VII", "20.1"},
            {"Ricoh GR III", "24.2"},
            {"Sigma fp L", "61"},
            {"Olympus PEN-F", "20.3"},
            {"Fujifilm X100V", "26.1"},
            {"Canon PowerShot G7 X Mark III", "20.1"},
            {"Sony Cyber-shot HX99", "18.2"},
            {"Panasonic Lumix ZS200", "20.1"},
            {"GoPro Hero 10", "23"},
            {"Insta360 ONE R", "19"},
            {"DJI Pocket 2", "64"}
    };


    for (int i = 0; i < 30; i++) {

      daftarKamera[i] = new Kamera(kameraData[i][0],Double.parseDouble(kameraData[i][1]));
      System.out.println((i + 1) + ". Kamera: " + kameraData[i][0]);
      daftarKamera[i].nyalakan();
      daftarKamera[i].ambilFoto();
      daftarKamera[i].matikan();

      System.out.println();
    }
  }
}
