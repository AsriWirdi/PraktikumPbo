import java.util.Scanner;

public class Soal12 {
  /*
  * Buatlah program Java untuk menampilkan penjumlahan bilangan bulat
    diantara dua bilangan bulat m dan n secara ascending (tidak termasuk
    bilangan m dan n, nilai m tidak harus lebih kecil dari n). Input program
    adalah bilangan bulat m dan n. outputnya adalah barisan bilangan yang
    dipisahkan menggunakan simbol “+” kemudian sebelum hasil penjumlahan ditampilkan
    terlebih dahulu dituliskan symbol “=” baru kemudian hasil penjumlahannya.
    Contoh Input Output sebagai berikut:
    7
    2
    3 + 4 + 5 + 6 = 18
  * */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int min = (n < m) ? n : m;
    int max = (n > m) ? n : m;
    int jumlah = 0;
    for (int i = min + 1; i < max; i++) {
      System.out.print(i);
      jumlah += i;
      if (i < max - 1) {
        System.out.print(" + ");
      } else{
        System.out.print(" = " + jumlah);

      }
    }
  }
}
