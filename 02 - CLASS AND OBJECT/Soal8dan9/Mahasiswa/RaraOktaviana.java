package Soal8dan9.Mahasiswa;

import Soal7.Mahasiswa;

public class RaraOktaviana extends Mahasiswa {
  // Constructor Overloading
  public RaraOktaviana() {

  }

  public RaraOktaviana(String nama) {
    this.nama = nama;
  }

  public RaraOktaviana(String nama, String NIM, String jurusan) {
    this.nama = nama;
    this.NIM = NIM;
    this.jurusan = jurusan;
  }

  // Method Overriding
  @Override
  protected void belajar() {
    System.out.println(nama + "Sedang Belajar");
  }

  @Override
  protected void absen() {
    System.out.println(nama + "Sedang Absen");
  }

  @Override
  protected void ujian() {
    System.out.println(nama + "Sedang Ujian");
  }

  // getter
  public String getJurusan() {
    return jurusan;
  }

  // setter
  public void setJurusan(String jurusan) {
    this.jurusan = jurusan;
  }

}
