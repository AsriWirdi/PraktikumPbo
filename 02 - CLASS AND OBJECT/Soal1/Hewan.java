package Soal1;

public class Hewan {
  // 5. Hewan

  // Bagan
  /*+--------------------------+
    |          Hewan           |
    +--------------------------+
    | - nama: String           |
    | - jenis: String          |
    | - umur: int              |
    +--------------------------+
    | +makan(): void           |
    | +tidur(): void           |
    | +suara(): void           |
    +--------------------------+
*/

  String nama;
  String jenis;
  int umur;

  public Hewan(String nama, String jenis, int umur) {
    this.nama = nama;
    this.jenis = jenis;
    this.umur = umur;
  }

  public void makan() {
    System.out.println(nama + " sedang makan");
  }

  public void tidur() {
    System.out.println(nama + " sedang tidur");
  }

  public void suara() {
    System.out.println(nama + " mengeluarkan suara");
  }

}
