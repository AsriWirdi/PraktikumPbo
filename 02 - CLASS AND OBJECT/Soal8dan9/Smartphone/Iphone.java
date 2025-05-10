package Soal8dan9.Smartphone;

import Soal7.Smartphone;

public class Iphone extends Smartphone {
  // Constructor Overloading
  public Iphone() {

  }

  public Iphone(String merk) {
    this.merk = merk;
  }


  // Method Overriding
  @Override
  public void nyalakan() {
    hidup = true;
    System.out.println("Ponsel dinyalakan");
  }

  @Override
  public void matikan() {
    hidup = false;
    System.out.println("Ponsel dimatikan");
  }

  @Override
  public void telepon(String nomor) {
    if (hidup) {
      System.out.println("Menelpon ke " + nomor);
    } else {
      System.out.println("Nyalakan ponsel terlebih dahulu!");
    }
  }

  @Override
  public void kirimPesan(String pesan) {
    if (hidup) {
      System.out.println("Mengirim pesan: " + pesan);
    } else {
      System.out.println("Ponsel mati, tidak bisa mengirim pesan!");
    }
  }

}
