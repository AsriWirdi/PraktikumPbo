package Soal1;

public class Kamera {
  // 13. Kamera

  // Bagan
  /*+---------------------------+
    |          Kamera           |
    +---------------------------+
    | - merk: String            |
    | - megapixel: double       |
    | - hidup: boolean          |
    +---------------------------+
    | +nyalakan(): void         |
    | +matikan(): void          |
    | +ambilFoto(): void        |
    +---------------------------+
*/

  String merk;
  double megapixel;
  boolean hidup;

  public Kamera(String merk, double megapixel ) {
    this.merk = merk;
    this.megapixel = megapixel;
  }

  public void nyalakan() {
    hidup = true;
    System.out.println("Kamera dinyalakan");
  }

  public void matikan() {
    hidup = false;
    System.out.println("Kamera dimatikan");
  }

  public void ambilFoto() {
    if (hidup) {
      System.out.println("Foto diambil dengan kamera " + merk + " (" + megapixel + " MP)");
    } else {
      System.out.println("Kamera dalam keadaan mati");
    }
  }
}
