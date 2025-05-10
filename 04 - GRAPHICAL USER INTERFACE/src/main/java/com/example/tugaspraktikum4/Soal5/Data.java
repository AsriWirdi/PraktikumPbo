package com.example.tugaspraktikum4.Soal5;

public class Data {
  private String kodeMk;
  private String mataKuliah;
  private String sks;
  private String nilai;

  // constructor

  public Data(String kodeMk, String mataKuliah, String sks, String nilai) {
    this.kodeMk = kodeMk;
    this.mataKuliah = mataKuliah;
    this.sks = sks;
    this.nilai = nilai;
  }

  // getter

  public String getKodeMk() {
    return kodeMk;
  }

  public String getMataKuliah() {
    return mataKuliah;
  }

  public String getSks() {
    return sks;
  }

  public String getNilai() {
    return nilai;
  }


  // setter
  public void setKodeMk(String kodeMk) {
    this.kodeMk = kodeMk;
  }

  public void setMataKuliah(String mataKuliah) {
    this.mataKuliah = mataKuliah;
  }

  public void setSks(String sks) {
    this.sks = sks;
  }

  public void setNilai(String nilai) {
    this.nilai = nilai;
  }
}
