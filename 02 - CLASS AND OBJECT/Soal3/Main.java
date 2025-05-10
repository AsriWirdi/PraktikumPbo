package Soal3;

public class Main {
  public static void main(String[] args) {
    // Membuat object dari class luar (Rumah)
    Rumah rumahSaya = new Rumah();

    // Membuat object dari inner class Kamar
    Rumah.Kamar kamarSaya = rumahSaya.new Kamar("Asri", 12);
    kamarSaya.deskripsi();

    System.out.println();

    // Membuat object dari inner class Dapur
    Rumah.Dapur dapurSaya = rumahSaya.new Dapur(true, false);
    dapurSaya.cekPeralatan();

    System.out.println();

    // Membuat object dari inner class RuangTamu
    Rumah.RuangTamu ruangTamuSaya = rumahSaya.new RuangTamu(4, true);
    ruangTamuSaya.tampilkanRuangTamu();
  }
}
