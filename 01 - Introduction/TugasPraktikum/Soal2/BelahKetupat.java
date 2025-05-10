package Soal2;

// G. BELAH KETUPAT
class BelahKetupat {
  double diagonal1, diagonal2, sisi;

  void setNilai(double diagonal1, double diagonal2, double sisi) {
    this.diagonal1 = diagonal1;
    this.diagonal2 = diagonal2;
    this.sisi = sisi;
  }

  double hitungLuas() {
    return 0.5 * diagonal1 * diagonal2;
  }

  double hitungKeliling() {
    return 4 * sisi;
  }

  void printState() {
    System.out.println("Belah Ketupat");
    System.out.printf("Diagonal 1 : %.2f\n", diagonal1);
    System.out.printf("Diagonal 2 : %.2f\n", diagonal2);
    System.out.printf("Sisi : %.2f\n", sisi);
    System.out.printf("Luas : %.2f\n", hitungLuas());
    System.out.printf("Keliling : %.2f\n", hitungKeliling());
  }
}
