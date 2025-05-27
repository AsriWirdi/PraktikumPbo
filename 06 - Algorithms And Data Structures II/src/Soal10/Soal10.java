package Soal10;

import java.util.Scanner;

public class Soal10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int hari = 7;
    int kota = 5;

    int suhu[][] = new int[hari][kota];

    System.out.println("Masukkan data suhu udara harian selama 7 hari di kota : ");

    for (int i = 0; i < hari; i++) {
      System.out.println("Hari ke-" + (i + 1) + ": ");
      for (int j = 0; j < kota; j++) {
        System.out.print(" Suhu kota " + (j + 1) + ": ");
        suhu[i][j] = sc.nextInt();
      }
    }

    System.out.println("\nData Suhu Udara (7 hari x 5 kota):");
    System.out.print("Hari/Kota\t");
    for (int k = 0; k < kota; k++) {
      System.out.print("Kota " + (k + 1) + "\t");
    }
    System.out.println();

    for (int h = 0; h < hari; h++) {
      System.out.print("Hari " + (h + 1) + "\t\t");
      for (int k = 0; k < kota; k++) {
        System.out.print(suhu[h][k] + "\t\t");
      }
      System.out.println();
    }
  }

}
