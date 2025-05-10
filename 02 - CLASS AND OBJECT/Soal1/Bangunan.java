package Soal1;

public class Bangunan {
  // 19. Bangunan

  // Bagan
  /*+-----------------------------+
    |         Bangunan            |
    +-----------------------------+
    | - nama: String              |
    | - tinggi: double            |
    | - jumlahLantai: int         |
    +-----------------------------+
    | +tampilkanInfo(): void      |
    | +renovasi(): void           |
    +-----------------------------+
*/

  String nama;
  double tinggi;
  int jumlahLantai;

  public Bangunan(String nama, double tinggi, int jumlahLantai) {
    this.nama = nama;
    this.tinggi = tinggi;
    this.jumlahLantai = jumlahLantai;
  }

  public void tampilkanInfo() {
    System.out.println("Bangunan: " + nama + ", Tinggi: " + tinggi + " m, Lantai: " + jumlahLantai);
  }

  public void renovasi() {
    System.out.println("Bangunan " + nama + " sedang direnovasi.");
  }
}
