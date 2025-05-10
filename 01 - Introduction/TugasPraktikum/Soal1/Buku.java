package Soal1;

// 3. Soal1.Buku
class Buku {
  // States
  String judul, penulis;
  int jumlahHalaman;
  int halaman;

  Buku(String judul, String penulis, int jumlahHalaman) {
    this.judul = judul;
    this.penulis = penulis;
    this.jumlahHalaman = jumlahHalaman;
  }

  // Behaviors
  void bukaHalaman(int halamanYgDibuka) {
    if (jumlahHalaman >= halamanYgDibuka) {
      this.halaman = halamanYgDibuka;
      System.out.println("Membuka halaman " + halamanYgDibuka);
    } else {
      System.out.println("Halaman Tidak Ditemukan...");
    }
  }

  void tutupBuku() {
    System.out.println("Menutup Soal1.Buku...");
  }

  void baca() {
    System.out.println("Membaca halaman " + halaman);
  }
}
