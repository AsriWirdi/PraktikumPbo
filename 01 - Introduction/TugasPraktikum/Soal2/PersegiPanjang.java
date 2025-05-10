package Soal2;

// B. Soal2.Persegi Panjang
class PersegiPanjang {
  private double panjang, lebar;

  public void setNilai(double panjang, double lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public double hitungLuas() {
    return panjang * lebar;
  }

  double hitungKeliling() {
    return 2 * (panjang + lebar);
  }

  void printState() {
    System.out.println("Persegi Panjang");
    System.out.printf(
            "panjang : %.2f\nlebar : %.2f\nluas : %.2f\nkeliling : %.2f\n",
            panjang, lebar, hitungLuas(), hitungKeliling());
  }
}
