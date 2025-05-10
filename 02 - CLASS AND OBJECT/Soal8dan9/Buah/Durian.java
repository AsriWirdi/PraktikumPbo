package Soal8dan9.Buah;

import Soal7.Buah;

public class Durian extends Buah {
  // Constructor overloading
  public Durian() {

  }

  protected Durian(String namaBuah) {
    this.namaBuah = namaBuah;
  }

  protected Durian(String namaBuah, String warna, String rasa) {
    this.namaBuah = namaBuah;
    this.warna = warna;
    this.rasa = rasa;
  }

  // Method overloading
  @Override
  public void rasa() {
    System.out.println("Rasa Durian " + rasa);
  }

  @Override
  public void makan() {
    System.out.println("Makan Durian");
  }

  // getter
  public String getWarnaBuah() {
    return warna;
  }

  // setter
  public void setRasaBuah(String rasa) {
    this.rasa = rasa;
  }
}
