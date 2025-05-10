package Soal1;

// 1. Soal1.Mobil
class Mobil {
  // States
  String merek;
  String warna;
  int kecepatan;

  Mobil(String merek, String warna) {
    this.merek = merek;
    this.warna = warna;
    this.kecepatan = 0;
  }

  // Behaviors
  void gas() {
    kecepatan = +10;
    System.out.println("Kecepatan bertambah 10++ kecepatan mobil anda : " + this.kecepatan);
  }

  void ngerem() {
    kecepatan = -10;
    System.out.println("Kecepatan berkurang 10-- kecepatan mobil anda : " + this.kecepatan);
  }

  void berhenti() {
    kecepatan = 0;
    System.out.println("mobil anda berhenti. kecepatan mobil anda : " + this.kecepatan);
  }
}
