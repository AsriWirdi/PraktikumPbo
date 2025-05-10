package Soal1;

public class Lampu {
  // 2. Lampu

  // Bagan
  /*+--------------------+
    |       Lampu        |
    +--------------------+
    | - warna: String    |
    | - status: boolean  |
    | - daya: int        |
    +--------------------+
    | +nyalakan(): void  |
    | +matikan(): void   |
    +--------------------+
*/

  String warna;
  boolean status;
  int daya;

  public Lampu(String warna) {
    this.warna = warna;
  }

  public void nyalakan() {
    status = true;
    System.out.println("Lampu menyala");
  }

  public void matikan() {
    status = false;
    System.out.println("Lampu mati");
  }
}
