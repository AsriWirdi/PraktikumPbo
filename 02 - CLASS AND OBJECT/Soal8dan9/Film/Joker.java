package Soal8dan9.Film;

import Soal7.Film;

public class Joker extends Film {
  // method overloading

  public Joker() {

  }

  public Joker(String judul) {
    this.judul = judul;
  }


  public Joker(String judul, String gendre, int durasiMenit) {
    this.judul = judul;
    this.gendre = gendre;
    this.durasiMenit = durasiMenit;
  }

  // Method Overriding
  @Override
  public void putar() {
    System.out.println("Memutar film " + judul + "...");
  }

  @Override
  public void berhenti() {
    System.out.println("Film di Pause...");
  }

  // getter
  public String getJudul() {
    return judul;
  }

  // setter
  public void setJudul(String judul) {
    this.judul = judul;
  }
}
