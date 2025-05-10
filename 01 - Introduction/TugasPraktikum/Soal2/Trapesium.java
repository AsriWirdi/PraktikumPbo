package Soal2;

// F.TRAPESIUM
class Trapesium {
  double sisiAtas, sisiBawah, tinggi, sisiMiringKiri, sisiMiringKanan;

  void setNilai(double sisiAtas, double sisiBawah, double tinggi, double sisiMiringKiri, double sisiMiringKanan) {
    this.sisiAtas = sisiAtas;
    this.sisiBawah = sisiBawah;
    this.tinggi = tinggi;
    this.sisiMiringKiri = sisiMiringKiri;
    this.sisiMiringKanan = sisiMiringKanan;
  }

  double hitungLuas() {
    return 0.5 * (sisiAtas + sisiBawah) * tinggi;
  }

  double hitungKeliling() {
    return sisiAtas + sisiBawah + sisiMiringKiri + sisiMiringKanan;
  }

  void printState() {
    System.out.println("Trapesium");
    System.out.printf("Sisi Atas : %.2f\n", sisiAtas);
    System.out.printf("Sisi Bawah : %.2f\n", sisiBawah);
    System.out.printf("Tinggi : %.2f\n", tinggi);
    System.out.printf("Sisi Miring Kiri : %.2f\n", sisiMiringKiri);
    System.out.printf("Sisi Miring Kanan : %.2f\n", sisiMiringKanan);
    System.out.printf("Luas : %.2f\n", hitungLuas());
    System.out.printf("Keliling : %.2f\n", hitungKeliling());
  }
}
