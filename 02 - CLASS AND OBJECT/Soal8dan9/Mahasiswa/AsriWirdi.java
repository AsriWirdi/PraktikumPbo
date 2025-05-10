package Soal8dan9.Mahasiswa;

import Soal7.Mahasiswa;

public class AsriWirdi extends Mahasiswa {
  // Constructor Overloading
  public AsriWirdi() {

  }

  public AsriWirdi(String nama) {
    this.nama = nama;
  }

  public AsriWirdi(String nama, String NIM, String jurusan) {
    this.nama = nama;
    this.NIM = NIM;
    this.jurusan = jurusan;
  }

  // Method Overriding
  @Override
  public void belajar() {
    System.out.println(nama + "Sedang Belajar");
  }

  @Override
  public void absen() {
    System.out.println(nama + "Sedang Absen");
  }

  @Override
  public void ujian() {
    System.out.println(nama + "Sedang Ujian");
  }

  // getter
  public String getJurusan(){
    return jurusan;
  }
  // setter
  public void setJurusan(String jurusan){
    this.jurusan = jurusan;
  }

}
