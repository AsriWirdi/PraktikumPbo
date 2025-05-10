package Soal8dan9.Film;

import Soal7.Film;

public class Parasite extends Film {
  // method overloading

  public Parasite() {

  }

  public Parasite(String judul) {
    this.judul = judul;
  }


  public Parasite(String judul, String gendre, int durasiMenit) {
    this.judul = judul;
    this.gendre = gendre;
    this.durasiMenit = durasiMenit;
  }


  // Method Overriding
  @Override
  protected void putar() {
    System.out.println("Memutar film " + judul + "...");
  }

  @Override
  protected void berhenti() {
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
