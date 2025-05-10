package Soal1;

public class KipasAngin {
  // 4. Kipas Angin

  // Bagan
  /*+--------------------------+
    |       KipasAngin         |
    +--------------------------+
    | - merek: String          |
    | - kecepatan: int         |
    | - menyala: boolean       |
    +--------------------------+
    | +nyalakan(): void        |
    | +matikan(): void         |
    | +aturKecepatan(int): void|
    +--------------------------+
*/

  String merek;
  int kecepatan;
  boolean menyala;

  public KipasAngin(String merek) {
    this.merek = merek;
  }

  public void nyalakan() {
    menyala = true;
    kecepatan = 1;
    System.out.println("Kipas angin menyala dengan kecepatan " + kecepatan);
  }

  public void matikan() {
    menyala = false;
    kecepatan = 0;
    System.out.println("Kipas angin dimatikan");
  }

  public void aturKecepatan(int kecepatanBaru) {
    if (menyala) {
      kecepatan = kecepatanBaru;
      System.out.println("Kecepatan kipas diatur ke " + kecepatan);
    } else {
      System.out.println("Nyalakan dulu kipasnya!");
    }
  }
}
