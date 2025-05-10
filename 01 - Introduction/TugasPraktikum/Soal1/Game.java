package Soal1;

// 6. Soal1.Game
class Game {
  // States
  String judul;
  double rating;

  Game(String judul, double rating) {
    this.judul = judul;
    if (rating <= 5.0 && rating >= 0.0) {
      this.rating = rating;
    } else {
      System.out.println("Rating tidak dalam rentang 0.0 - 5.0");
    }
  }

  // Behaviors
  void memulaiGame() {
    System.out.println("memulai game " + judul);
  }

  void keluarGame() {
    System.out.println("keluar game dari game...");
  }
}
