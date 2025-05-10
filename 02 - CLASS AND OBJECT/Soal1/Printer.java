package Soal1;

public class Printer {
  // 9.Printer

  // Bagan
  /*+--------------------------+
    |         Printer          |
    +--------------------------+
    | - merk: String           |
    | - tintaLevel: int        |
    | - status: String         |
    +--------------------------+
    | +cetak(String): void     |
    | +isiTinta(): void        |
    +--------------------------+
*/

  String merk;
  int tintaLevel;
  String status;

  public Printer(String merk, int tintaLevel) {
    this.merk = merk;
  }

  public void cetak(String dokumen) {
    if (tintaLevel > 0) {
      System.out.println("Mencetak dokumen: " + dokumen);
      tintaLevel -= 10;
    } else {
      System.out.println("Tinta habis, isi tinta dulu!");
    }
  }

  public void isiTinta() {
    tintaLevel = 100;
    System.out.println("Tinta printer diisi penuh");
  }
}
