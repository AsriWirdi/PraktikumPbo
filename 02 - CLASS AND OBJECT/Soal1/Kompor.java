package Soal1;

public class Kompor {
  // 8. Kompor

  // Bagan
  /*+-------------------------+
    |         Kompor          |
    +-------------------------+
    | - jenis: String         |
    | - menyala: boolean      |
    +-------------------------+
    | +nyalakan(): void       |
    | +matikan(): void        |
    | +masak(String): void    |
    +-------------------------+
*/

  String jenis;
  boolean menyala;

  public Kompor(String jenis) {
    this.jenis = jenis;
  }

  public void nyalakan() {
    menyala = true;
    System.out.println("Kompor dinyalakan");
  }

  public void matikan() {
    menyala = false;
    System.out.println("Kompor dimatikan");
  }

  public void masak(String makanan) {
    if (menyala) {
      System.out.println("Memasak " + makanan);
    } else {
      System.out.println("Nyalakan dulu kompornya!");
    }
  }
}
