import java.util.Scanner;

public class Soal7 {
  public static void main(String[] args) {
    /*
    * Buatlah program untuk menentukan nilai MIN dan MAX jika inputnya terdiri
      dari 5 variabel a, b, c, d, dan e yang diinput melalui console.
    * */


    // Membuat objek Scanner untuk input dari console
    Scanner sc = new Scanner(System.in);

    // Meminta pengguna untuk memasukkan dua bilangan
    System.out.print("Masukkan bilangan pertama (a) : ");
    int a = sc.nextInt();

    System.out.print("Masukkan bilangan kedua (b) : ");
    int b = sc.nextInt();

    System.out.print("Masukkan bilangan ketiga (c) : ");
    int c = sc.nextInt();

    System.out.print("Masukkan bilangan keempat (d) : ");
    int d = sc.nextInt();

    System.out.print("Masukkan bilangan kelima (e) : ");
    int e = sc.nextInt();

    // Inisialisasi nilai min dan max
    // anggap nilai pertama(a) adalah nilai minimum dan maximum
    int min = a;
    int max = a;

    // cek nilai minimum
    // jika ada yang lebih kecil dari min, maka min siap di ganti
    if (b < min) min = b;
    if (c < min) min = c;
    if (d < min) min = d;
    if (e < min) min = e;

    // cek nilai maximum
    // jika ada yang lebih besar dari max, maka max siap di ganti
    if (b > max) max = b;
    if (c > max) max = c;
    if (d > max) max = d;
    if (e > max) max = e;

    // output
    System.out.printf("Nilai MIN antara kelima nilai : %d\n", min);
    System.out.printf("Nilai MAX antara kelima nilai : %d\n",  max);
  }
}
