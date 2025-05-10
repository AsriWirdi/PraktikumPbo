package Soal4;

public class Soal4 {
  // Fields static
  static String nama;
  static int umur;

  // Methods static
  static void info(){
    System.out.println("halo nama saya " + nama);
    System.out.println("umur saya " + umur);
  }

  // jadi, kita bisa langsung memanggil atau mengakses field atau method yang diberikan modifier static.
  // karena static ini tidak bergantung pada objek, jadi kita tidak perlu buat objeknya dulu untuk mengakses field atau method yang ada di class, itu tidak usah.
  // sebab static ini bisa dibilang kepunyaan class. jadi cuma ada satu salinan untuk static ini.


}
