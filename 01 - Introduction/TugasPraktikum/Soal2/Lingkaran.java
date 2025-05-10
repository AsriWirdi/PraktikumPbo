package Soal2;

// D. Soal2.Lingkaran
class Lingkaran {
  private double jariJari;

  public void setNilai(double jariJari) {
    this.jariJari = jariJari;
  }

  public double hitungLuas() {
    return Math.PI * jariJari * jariJari;
  }

  double hitungKeliling() {
    return 2 * Math.PI * jariJari;
  }

  void printState() {
    System.out.println("Lingkaran");
    System.out.printf(
            "jariJari : %.2f\nluas : %.2f\nkeliling : %.2f\n",
            jariJari, hitungLuas(), hitungKeliling());
  }
}
