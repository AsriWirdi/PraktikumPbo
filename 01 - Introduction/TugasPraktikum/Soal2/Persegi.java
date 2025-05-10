package Soal2;

// C. Soal2.Persegi
class Persegi {
  private double sisi;

  public void setNilai(double sisi) {
    this.sisi = sisi;
  }

  public double hitungLuas() {
    return sisi * sisi;
  }

  double hitungKeliling() {
    return 4 * sisi;
  }

  void printState() {
    System.out.println("Persegi");
    System.out.printf(
            "sisi : %.2f\nluas : %.2f\nkeliling : %.2f\n",
            sisi, hitungLuas(), hitungKeliling());
  }
}
