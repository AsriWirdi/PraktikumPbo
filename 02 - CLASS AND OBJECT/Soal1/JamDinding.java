package Soal1;

public class JamDinding {
  // 16. Jam Dinding

  // Bagan
  /*+---------------------------+
    |        JamDinding         |
    +---------------------------+
    | - merk: String            |
    | - waktu: String           |
    | - berdetik: boolean       |
    +---------------------------+
    | +tampilkanWaktu(): void   |
    | +aturWaktu(String): void  |
    +---------------------------+
*/

  String merk;
  int kecepatan;
  boolean menyala;

  public JamDinding(String merk) {
    this.merk = merk;
  }

  public void nyalakan() {
    menyala = true;
    System.out.println("Kipas angin menyala");
  }

  public void matikan() {
    menyala = false;
    System.out.println("Kipas angin dimatikan");
  }

  public void aturKecepatan(int kecepatanBaru) {
    kecepatan = kecepatanBaru;
    System.out.println("Kecepatan diatur ke level " + kecepatan);
  }
}
