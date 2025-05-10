package Soal1;

public class Kulkas {
  // 15. Kulkas

  // Bagan
  /*+--------------------------+
    |          Kulkas          |
    +--------------------------+
    | - merk: String           |
    | - suhu: int              |
    | - pintuTerbuka: boolean  |
    +--------------------------+
    | +aturSuhu(int): void     |
    | +bukaPintu(): void       |
    | +tutupPintu(): void      |
    +--------------------------+
*/

  String merk;
  int suhu;
  boolean pintuTerbuka;

  public Kulkas(String merk, int suhu) {
    this.merk = merk;
    this.suhu = suhu;
  }

  public void aturSuhu(int suhuBaru) {
    suhu = suhuBaru;
    System.out.println("Suhu kulkas diatur ke " + suhu + " derajat");
  }

  public void bukaPintu() {
    pintuTerbuka = true;
    System.out.println("Pintu kulkas dibuka");
  }

  public void tutupPintu() {
    pintuTerbuka = false;
    System.out.println("Pintu kulkas ditutup");
  }
}
