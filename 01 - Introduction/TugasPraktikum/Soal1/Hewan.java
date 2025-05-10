package Soal1;

// 5. Soal1.Hewan
class Hewan {
  // States
  String jenis, suara;

  Hewan(String jenis, String suara) {
    this.jenis = jenis;
    this.suara = suara;
  }

  // Behaviors
  void makan() {
    System.out.println(jenis + "Sedang Makan");
  }

  void bersuara() {
    System.out.println(jenis + " Mengeluarkan Suara " + suara + "...");
  }

  void tidur() {
    System.out.println(jenis + "Sedang Tidur Zzzzz");
  }
}
