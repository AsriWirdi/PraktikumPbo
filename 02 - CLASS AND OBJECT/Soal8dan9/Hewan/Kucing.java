package Soal8dan9.Hewan;

import Soal7.Hewan;

public class Kucing extends Hewan {
  // constructor overloading
  public Kucing() {

  }

  public Kucing(String jenis) {
    this.jenis = jenis;
  }

  public Kucing(String jenis, String suara) {
    this.jenis = jenis;
    this.suara = suara;
  }

  // Method OVerriding
  @Override
  protected void makan() {
    System.out.println(jenis + "Sedang Makan");
  }

  @Override
  protected void bersuara() {
    System.out.println(jenis + " Mengeluarkan Suara " + suara + "...");
  }

  @Override
  protected void tidur() {
    System.out.println(jenis + "Sedang Tidur Zzzzz");
  }
}
