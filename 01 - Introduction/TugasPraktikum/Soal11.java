import java.util.Scanner;

public class Soal11 {
  /*
  * Buatlah program Java untuk menampilkan bilangan bulat diantara dua
    bilangan bulat m dan n secara ascending (tidak termasuk bilangan m dan
    n, nilai m tidak harus lebih kecil dari n). Input program adalah bilangan
    bulat m dan n. outputnya adalah barisan bilangan yang dipisahkan
    menggunakan <,>.
    Contoh IO sebagai berikut:
    17
    2
    3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16

  * */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int min = (n < m) ? n : m;
    int max = (n > m) ? n : m;

    for (int i = min + 1; i < max; i++) {
      System.out.print(i);
      if (i < max - 1) {
        System.out.print(", ");
      }
    }

  }
}
