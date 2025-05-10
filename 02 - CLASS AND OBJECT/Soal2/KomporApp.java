package Soal2;

import Soal1.Kompor;

public class KomporApp {
  public static void main(String[] args) {

    // Membuat 30 objek Kompor
    Kompor[] daftarKompor = new Kompor[30];

    String[][] dataKompor = {
            {"Kompor Gas 1 Tungku", "Mie Rebus"},
            {"Kompor Gas 2 Tungku", "Nasi Goreng"},
            {"Kompor Gas Tanam", "Tumis Kangkung"},
            {"Kompor Listrik", "Sup Ayam"},
            {"Kompor Induksi", "Omelet"},
            {"Kompor Minyak Tanah", "Sayur Asem"},
            {"Kompor Portable", "Sosis Bakar"},
            {"Kompor Camping", "Kopi"},
            {"Kompor Spiritus", "Teh"},
            {"Kompor Listrik Infrared", "Sop Daging"},
            {"Kompor Gas High Pressure", "Mie Instan"},
            {"Kompor Tanam 3 Tungku", "Capcay"},
            {"Kompor Hybrid (Gas & Listrik)", "Dadar Jagung"},
            {"Kompor Keramik", "Pasta"},
            {"Kompor Gas Komersial", "Ikan Bakar"},
            {"Kompor Induksi Komersial", "Sate Ayam"},
            {"Kompor Mini Elektrik", "Telur Rebus"},
            {"Kompor BBQ Listrik", "Steak"},
            {"Kompor BBQ Arang", "Ayam Bakar"},
            {"Kompor Gas Outdoor", "Mie Kuah"},
            {"Kompor Mini Portable", "Nugget"},
            {"Kompor Halogen", "Sup Ikan"},
            {"Kompor Wajan Besar", "Gorengan"},
            {"Kompor Tanam Induksi", "Ayam Goreng"},
            {"Kompor Kayu Bakar", "Sayur Lodeh"},
            {"Kompor Gas Otomatis", "Telur Ceplok"},
            {"Kompor Gas Mini", "Bubur Ayam"},
            {"Kompor Uap", "Dim Sum"},
            {"Kompor Jet Cooker", "Bakso"},
            {"Kompor Pizza", "Pizza"}
    };

    for (int i = 0; i < 30; i++) {

      daftarKompor[i] = new Kompor(dataKompor[i][0]);
      System.out.println((i + 1) + ". Kompor: " + dataKompor[i][0]);
      daftarKompor[i].nyalakan();
      daftarKompor[i].masak(dataKompor[i][1]);
      daftarKompor[i].matikan();

      System.out.println();
    }
  }
}
