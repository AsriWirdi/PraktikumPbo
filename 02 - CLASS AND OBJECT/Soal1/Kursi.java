package Soal1;

public class Kursi {
  // 12. Kursi

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

  String bahan;
  boolean sandaran;
  String warna;

  public Kursi(String bahan, String warna) {
    this.bahan = bahan;
    this.sandaran = sandaran;
    this.warna = warna;
  }

  public void duduk() {
    System.out.println("Kamu duduk di kursi berbahan " + bahan);
  }

  public void ubahWarna(String warnaBaru) {
    warna = warnaBaru;
    System.out.println("Warna kursi diubah menjadi " + warna);
  }
}
