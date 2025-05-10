package Soal8dan9.Buku;

import Soal7.Buku;

public class LaskarPelangi extends Buku {

  // Constructor overloading
  public LaskarPelangi() {

  }

  public LaskarPelangi(String judul) {
    this.judul = judul;
  }

  public LaskarPelangi(String judul, String penulis, int jumlahHalaman) {
    this.judul = judul;
    this.penulis = penulis;
    this.jumlahHalaman = jumlahHalaman;
  }

  // Method Overriding
  @Override
  protected void bukaHalaman(int halamanYgDibuka) {
    if (jumlahHalaman >= halamanYgDibuka) {
      this.halaman = halamanYgDibuka;
      System.out.println("Membuka halaman " + halamanYgDibuka);
    } else {
      System.out.println("Halaman Tidak Ditemukan...");
    }
  }

  protected void tutupBuku() {
    System.out.println("Menutup Buku " + judul + "...");
  }

  protected void baca() {
    System.out.println("Membaca halaman " + halaman);
  }


  // setter
  public void setHalaman(int halaman) {
    this.halaman = halaman;
  }

  // getter
  public String getJudul() {
    return judul;
  }

}
