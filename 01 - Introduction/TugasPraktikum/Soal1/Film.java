package Soal1;

// 8. Soal1.Film
class Film {
  // States
  String judul, gendre;
  int durasiMenit;

  Film(String judul, String gendre, int durasiMenit) {
    this.judul = judul;
    this.gendre = gendre;
    this.durasiMenit = durasiMenit;
  }

  // Behaviors
  void putar() {
    System.out.println("Memutar film " + judul + "...");
  }

  void berhenti() {
    System.out.println("Soal1.Film di Pause...");
  }
}
