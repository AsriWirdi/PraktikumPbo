package Soal2;

import Soal1.Sepeda;

public class SepedaApp {
  public static void main(String[] args) {

    // Membuat 30 objek Sepeda
    Sepeda[] daftarPrinter = new Sepeda[30];

    String[][] dataSepeda = {
            {"Polygon", "45"},
            {"United", "40"},
            {"Pacific", "38"},
            {"Wimcycle", "35"},
            {"Element", "42"},
            {"Trek", "50"},
            {"Giant", "48"},
            {"Specialized", "55"},
            {"Cannondale", "53"},
            {"Scott", "52"},
            {"Merida", "50"},
            {"Bianchi", "54"},
            {"Santa Cruz", "48"},
            {"Fuji", "46"},
            {"Cervelo", "56"},
            {"Norco", "45"},
            {"Rocky Mountain", "44"},
            {"Cube", "47"},
            {"Orbea", "49"},
            {"Pinarello", "57"},
            {"Kona", "43"},
            {"Lapierre", "46"},
            {"Ghost", "42"},
            {"GT", "41"},
            {"Marin", "40"},
            {"Dahon", "37"},
            {"Strida", "35"},
            {"Tern", "38"},
            {"Twitter", "45"},
            {"Schwinn", "39"}
    };

    for (int i = 0; i < 30; i++) {

      daftarPrinter[i] = new Sepeda(dataSepeda[i][0], Integer.parseInt(dataSepeda[i][1]));
      System.out.println((i + 1) + ". Sepeda: " + dataSepeda[i][0]);
      daftarPrinter[i].kayuh();
      daftarPrinter[i].rem();

      System.out.println();
    }
  }
}
