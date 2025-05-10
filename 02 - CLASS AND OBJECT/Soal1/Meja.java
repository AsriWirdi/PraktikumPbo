package Soal1;

public class Meja {
  // 11. Meja

  // Bagan
  /*+--------------------------+
    |           Meja           |
    +--------------------------+
    | - bentuk: String         |
    | - panjang: double        |
    | - lebar: double          |
    | - warna: String          |
    +--------------------------+
    | +tampilkanInfo(): void   |
    | +ubahWarna(String): void |
    +--------------------------+
*/

  String bentuk;
  double panjang;
  double lebar;
  String warna;

  public Meja(String bentuk, double panjang, double lebar, String warna) {
    this.bentuk = bentuk;
    this.panjang = panjang;
    this.lebar = lebar;
    this.warna = warna;
  }

  public void tampilkanInfo() {
    System.out.println("Meja " + bentuk + " warna " + warna + " ukuran " + panjang + "x" + lebar);
  }

  public void ubahWarna(String warnaBaru) {
    warna = warnaBaru;
    System.out.println("Warna meja diubah menjadi " + warna);
  }
}
