package Soal1;

public class Buku {
  // 3. Buku

  /*+------------------------+
    |         Buku           |
    +------------------------+
    | - judul: String        |
    | - penulis: String      |
    | - jumlahHalaman: int   |
    | - dibuka: boolean      |
    +------------------------+
    | +buka(): void          |
    | +tutup(): void         |
    | +baca(): void          |
    +------------------------+
*/
  String judul;
  String penulis;
  int jumlahHalaman;
  boolean dibuka;

  public Buku(String judul, String penulis) {
    this.judul = judul;
    this.penulis = penulis;
  }

  public void buka() {
    dibuka = true;
    System.out.println("Buku dibuka");
  }

  public void tutup() {
    dibuka = false;
    System.out.println("Buku ditutup");
  }

  public void baca() {
    if (dibuka) {
      System.out.println("Membaca buku " + judul);
    } else {
      System.out.println("Buka dulu bukunya!");
    }
  }
}
