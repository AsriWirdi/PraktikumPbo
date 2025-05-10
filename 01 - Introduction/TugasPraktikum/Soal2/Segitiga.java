package Soal2;

// A. SEGITIGA
class Segitiga {
  private double alas, tinggi, sisi1, sisi2, sisi3;

  public void setNilai(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisi1 = sisi1;
    this.sisi2 = sisi2;
    this.sisi3 = sisi3;
  }

  public double hitungLuas() {
    return 0.5 * (alas * tinggi);
  }

  double hitungKeliling() {
    return sisi1 + sisi2 + sisi3;
  }

  void printState() {
    System.out.println("Segitiga");
    System.out.printf(
            "alas : %.2f\ntinggi : %.2f\nsisi1 : %.2f\nsisi2 : %.2f\nsisi3 : %.2f\nluas : %.2f\nkeliling : %.2f\n",
            alas, tinggi, sisi1, sisi2, sisi3, hitungLuas(), hitungKeliling());
  }

}
