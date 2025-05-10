package Soal1;

public class Sepeda {
  // 14. Sepeda

  // Bagan
  /*+----------------------------+
    |          Sepeda            |
    +----------------------------+
    | - merk: String             |
    | - warna: String            |
    | - kecepatan: int           |
    +----------------------------+
    | +kayuh(): void             |
    | +rem(): void               |
    | +gantiKecepatan(int): void|
    +----------------------------+
*/

  String merk;
  String warna;
  int kecepatan;

  public Sepeda(String merk, int kecepatan) {
    this.kecepatan = kecepatan;
    this.merk = merk;
  }

  public void kayuh() {
    System.out.println("Mengayuh sepeda " + merk + " dengan kecepatan " + kecepatan + " km/jam");
  }

  public void rem() {
    System.out.println("Sepeda direm");
  }

  public void gantiKecepatan(int kecepatanBaru) {
    kecepatan = kecepatanBaru;
    System.out.println("Kecepatan sepeda diatur ke " + kecepatan);
  }
}
