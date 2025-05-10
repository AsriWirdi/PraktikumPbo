import java.util.Scanner;

public class Soal5 {
  public static void main(String[] args) {
    /* SOAL 5
    * Buatlah program untuk menampilkan sejumlah n baris String
      “INFORMATIKA” dengan nilai variabel n diinput melalui console window.
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris \"INFORMATIKA\" yang ingin di tampilkan : ");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {
      System.out.println("INFORMATIKA");
    }


  }
}
