package Soal2;

// E.JAJARGENJANG
class JajarGenjang {
  private double alas, tinggi, sisiMiring;


  public void setNilai(double alas, double tinggi, double sisiMiring) {
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiMiring = sisiMiring;
  }

  public double hitungLuas() {
    return alas * tinggi;
  }

  double hitungKeliling() {
    return 2 * (alas + sisiMiring);
  }

  void printState() {
    System.out.println("JajarGenjang");
    System.out.printf(
            "alas : %.2f\ntinggi : %.2f\nsisi miringluas : %.2f\nkeliling : %.2f\n", alas,tinggi,sisiMiring,hitungLuas(), hitungKeliling());
  }
}
