package Soal1;

public class Ponsel {
  // 6. Ponsel

  // Bagan
  /*+----------------------------+
    |          Ponsel            |
    +----------------------------+
    | - merk: String             |
    | - baterai: int             |
    | - hidup: boolean           |
    +----------------------------+
    | +nyalakan(): void          |
    | +matikan(): void           |
    | +telepon(String): void     |
    | +kirimPesan(String): void  |
    +----------------------------+
*/

  String merk;
  int baterai;
  boolean hidup;

  public Ponsel(String merk) {
    this.merk = merk;
  }

  public void nyalakan() {
    hidup = true;
    System.out.println("Ponsel dinyalakan");
  }

  public void matikan() {
    hidup = false;
    System.out.println("Ponsel dimatikan");
  }

  public void telepon(String nomor) {
    if (hidup) {
      System.out.println("Menelpon ke " + nomor);
    } else {
      System.out.println("Nyalakan ponsel terlebih dahulu!");
    }
  }

  public void kirimPesan(String pesan) {
    if (hidup) {
      System.out.println("Mengirim pesan: " + pesan);
    } else {
      System.out.println("Ponsel mati, tidak bisa mengirim pesan!");
    }
  }
}
