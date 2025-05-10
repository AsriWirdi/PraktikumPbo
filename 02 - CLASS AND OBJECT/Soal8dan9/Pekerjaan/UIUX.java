package Soal8dan9.Pekerjaan;

import Soal7.Pekerjaan;

public class UIUX extends Pekerjaan {
  // Constructor Overloading
  public UIUX(){

  }

  public UIUX(String nama){
    this.nama = nama;
  }

  public UIUX(String nama, String jabatan) {
    this.nama = nama;
    this.jabatan = jabatan;
  }

  // Method Overriding
  @Override
  public void kerja() {
    System.out.println(nama + " sedang bekerja...");
  }

  @Override
  public void TerimaGaji(int gaji) {
    this.gaji = gaji;
    System.out.println(nama + " Menerima Gaji Rp." + gaji);
  }

  // getter
  public int getGaji(){
    return gaji;
  }

  // setter
  public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
  }

}
