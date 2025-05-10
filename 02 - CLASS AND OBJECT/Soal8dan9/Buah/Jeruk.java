package Soal8dan9.Buah;

import Soal7.Buah;

public class Jeruk extends Buah {
  // Constructor overloading
  public Jeruk() {

  }

  protected Jeruk(String namaBuah) {
    this.namaBuah = namaBuah;
  }

  protected Jeruk(String namaBuah, String warna, String rasa) {
    this.namaBuah = namaBuah;
    this.warna = warna;
    this.rasa = rasa;
  }

  // Method overloading
  @Override
  public void rasa() {
    System.out.println("Rasa Jeruk " + rasa);
  }

  @Override
  public void makan() {
    System.out.println("Makan Jeruk");
  }

  // getter
  public String getWarna() {
    return warna;
  }

  // setter
  public void setRasaBuah(String rasa) {
    this.rasa = rasa;
  }
}
