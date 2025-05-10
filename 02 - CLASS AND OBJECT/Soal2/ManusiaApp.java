package Soal2;

import Soal1.Manusia;

public class ManusiaApp {
  public static void main(String[] args) {

    // Membuat 30 objek Manusia
    Manusia[] daftarManusia = new Manusia[30];

    String[][] dataManusia = {
            {"Andi", "25", "Programmer"},
            {"Budi", "30", "Dokter"},
            {"Citra", "28", "Guru"},
            {"Dewi", "32", "Perawat"},
            {"Eko", "27", "Desainer Grafis"},
            {"Fajar", "35", "Arsitek"},
            {"Gita", "22", "Mahasiswa"},
            {"Hendra", "40", "Pengacara"},
            {"Intan", "26", "Content Creator"},
            {"Joko", "38", "Petani"},
            {"Kiki", "29", "Akuntan"},
            {"Lina", "24", "Pramugari"},
            {"Maman", "45", "Sopir"},
            {"Nina", "33", "Chef"},
            {"Oka", "31", "Dosen"},
            {"Putri", "23", "Barista"},
            {"Qori", "36", "Psikolog"},
            {"Rian", "34", "Polisi"},
            {"Santi", "30", "Apoteker"},
            {"Tono", "41", "Pengusaha"},
            {"Umar", "28", "Teknisi"},
            {"Vina", "25", "Editor"},
            {"Wawan", "37", "Pilot"},
            {"Xenia", "29", "Model"},
            {"Yoga", "33", "Montir"},
            {"Zahra", "26", "Customer Service"},
            {"Bambang", "44", "Satpam"},
            {"Cindy", "27", "HRD"},
            {"Deni", "35", "Web Developer"},
            {"Evi", "31", "Marketing"}
    };

    for (int i = 0; i < 30; i++) {

      daftarManusia[i] = new Manusia(dataManusia[i][0], Integer.parseInt(dataManusia[i][1]), dataManusia[i][2]);
      System.out.println((i + 1) + ". Nama: " + dataManusia[i][0]);
      daftarManusia[i].perkenalan();
      daftarManusia[i].bekerja();
      daftarManusia[i].tidur();

      System.out.println();
    }
  }
}
