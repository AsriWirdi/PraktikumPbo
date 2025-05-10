import java.util.Scanner;

public class soal6 {
  public static void main(String[] args) {
    // Soal 6
    // Buatlah program untuk menentukan nilai MIN dan MAX jika inputnya
    // berupa dua buah bilangan a dan b yang diinput melalui console window.

    // Membuat objek Scanner untuk input dari console
    Scanner sc = new Scanner(System.in);

    // Meminta pengguna untuk memasukkan dua bilangan
    System.out.print("Masukkan bilangan pertama (a) : ");
    int a = sc.nextInt();

    System.out.print("Masukkan bilangan kedua (b) : ");
    int b = sc.nextInt();

    // Menentukan nilai minimum dan maximum
    if(a!=b) {
      int min = (a < b) ? a : b;
      int max = (a > b) ? a : b;
    System.out.printf("Nilai MIN antara a(%d) dan b(%d) : %d\n", a, b, min);
      System.out.printf("Nilai MAX antara a(%d) dan b(%d) : %d\n", a, b,max);
    } else {
      System.out.println("kedua bilangan sama");
    }
  }
}
