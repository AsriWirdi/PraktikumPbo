package Soal8dan9.Hewan;

import Soal7.Hewan;

public class Anjing extends Hewan {
  // constructor overloading
  public Anjing() {

  }

  public Anjing(String jenis) {
    this.jenis = jenis;
  }

  public Anjing(String jenis, String suara) {
    this.jenis = jenis;
    this.suara = suara;
  }

  // Method OVerriding
  @Override
  public void makan() {
    System.out.println(jenis + "Sedang Makan");
  }

  @Override
  public void bersuara() {
    System.out.println(jenis + " Mengeluarkan Suara " + suara + "...");
  }

  @Override
  public void tidur() {
    System.out.println(jenis + "Sedang Tidur Zzzzz");
  }

  // getter
  public String getJenis() {
    return jenis;
  }

  // setter
  public void seSuara(String suara) {
    this.suara = suara;
  }
}
