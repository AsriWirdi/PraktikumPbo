package Soal1;

// 10. Soal1.Tempat
class Tempat {
  // States
  String namaTempat;
  double jumlahPenduduk;
  double luas;

  Tempat(String namaTempat, double luas, double jumlahPenduduk) {
    this.namaTempat = namaTempat;
    this.luas = luas;
    this.jumlahPenduduk = jumlahPenduduk;
  }

  // Behaviors
  void tampilkanInfo() {
    System.out.println("Nama tempat : " + namaTempat);
    System.out.println("Luas tempat : " + luas);
    System.out.println("Jumlah penduduk : " + jumlahPenduduk + "juta jiwa");
  }
}
