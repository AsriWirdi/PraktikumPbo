package Soal1;

public class Headset {
  // 18. Headset

  // Bagan
  /*+-----------------------------+
    |          Headset            |
    +-----------------------------+
    | - merk: String              |
    | - volume: int               |
    | - tersambung: boolean       |
    +-----------------------------+
    | +sambungkan(): void         |
    | +aturVolume(int): void      |
    | +putuskan(): void           |
    +-----------------------------+
*/

  String merk;
  int volume;
  boolean tersambung;

  public Headset(String merk) {
    this.merk = merk;
  }

  public void sambungkan() {
    tersambung = true;
    System.out.println("Headset tersambung");
  }

  public void aturVolume(int v) {
    volume = v;
    System.out.println("Volume diatur ke: " + volume);
  }

  public void putuskan() {
    tersambung = false;
    System.out.println("Headset diputuskan");
  }
}
