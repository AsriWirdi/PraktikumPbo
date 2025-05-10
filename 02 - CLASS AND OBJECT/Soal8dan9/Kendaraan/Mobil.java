package Soal8dan9.Kendaraan;

import Soal7.Kendaraan;

public class Mobil extends Kendaraan {
  // Constructor overloading
  public Mobil() {

  }

  public Mobil(String kendaraan) {
    this.kendaraan = kendaraan;
  }

  // Method Overriding
  @Override
  public void hidupkanMesin() {
    hidup = true;
    System.out.println("Mesin " + kendaraan + " hidup");
  }

  @Override
  public void gas() {
    if (hidup) {
      kecepatan += 20;
      System.out.println("Kecepatan tertambah 20km/jam++");
      System.out.println("Kecepatan " + kendaraan + " anda: " + kecepatan);
    } else {
      System.out.println("Anda belum nyalakan mesin");
    }
  }

  @Override
  public void rem() {
    if (hidup && kecepatan > 0) {
      kecepatan -= 20;
      System.out.println("Kecepatan berkurang 20km/jam++");
      System.out.println("Kecepatan " + kendaraan + " anda: " + kecepatan);
    } else {
      System.out.println("Anda belum nyalakan mesin");
    }
  }

  @Override
  public void matikanMesin() {
    if (hidup) {
      hidup = false;
    } else {
      System.out.println(kendaraan + " anda memang sudah mati");
    }
  }

}
