package Soal1;

public class Manusia {
  // 20. Manusia

  // Bagan
  /*+---------------------------+
    |         Manusia           |
    +---------------------------+
    | - nama: String            |
    | - umur: int               |
    | - pekerjaan: String       |
    +---------------------------+
    | +perkenalan(): void       |
    | +bekerja(): void          |
    | +tidur(): void            |
    +---------------------------+
*/

  String nama;
  int umur;
  String pekerjaan;

  public Manusia(String nama, int umur, String pekerjaan) {
    this.nama = nama;
    this.umur = umur;
    this.pekerjaan = pekerjaan;
  }

  public void perkenalan() {
    System.out.println("Halo, nama saya " + nama + ", saya seorang " + pekerjaan);
  }

  public void bekerja() {
    System.out.println(nama + " sedang bekerja sebagai " + pekerjaan);
  }

  public void tidur() {
    System.out.println(nama + " sedang tidur.");
  }
}
