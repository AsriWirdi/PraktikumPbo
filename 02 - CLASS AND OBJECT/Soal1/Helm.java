package Soal1;

public class Helm {
  // 17. Helm

  // Bagan
  /*+------------------------+
    |          Helm          |
    +------------------------+
    | - merk: String         |
    | - ukuran: String       |
    | - warna: String        |
    +------------------------+
    | +pakai(): void         |
    | +lepas(): void         |
    +------------------------+
*/

  String merk;
  String ukuran;
  String warna;

  public Helm(String merk) {
    this.merk = merk;
  }

  public void pakai() {
    System.out.println("Helm " + merk + " dipakai");
  }

  public void lepas() {
    System.out.println("Helm dilepas");
  }
}
