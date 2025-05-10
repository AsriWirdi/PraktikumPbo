package Soal2;

// F. LAYANG-LAYANG
class LayangLayang {
  double diagonal1, diagonal2, sisiA, sisiB;

  void setNilai(double diagonal1, double diagonal2, double sisiA, double sisiB) {
    this.diagonal1 = diagonal1;
    this.diagonal2 = diagonal2;
    this.sisiA = sisiA;
    this.sisiB = sisiB;
  }

  double hitungLuas() {
    return 0.5 * diagonal1 * diagonal2;
  }

  double hitungKeliling() {
    return 2 * (sisiA + sisiB);
  }

  void printState() {
    System.out.println("Layang Layang");
    System.out.printf("Diagonal 1 : %.2f\n", diagonal1);
    System.out.printf("Diagonal 2 : %.2f\n", diagonal2);
    System.out.printf("Sisi A : %.2f\n", sisiA);
    System.out.printf("Sisi B : %.2f\n", sisiB);
    System.out.printf("Luas : %.2f\n", hitungLuas());
    System.out.printf("Keliling : %.2f\n", hitungKeliling());
  }
}
