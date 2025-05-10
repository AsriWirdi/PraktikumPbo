package Soal8dan9.Laptop;

import Soal7.Laptop;

public class Asus extends Laptop {
  // Constructor Overloading
  public Asus() {

  }

  public Asus(String merek) {
    this.merek = merek;
  }

  public Asus(String merek, int ram) {
    this.merek = merek;
    this.ram = ram;
  }

  // Method Overloading
  @Override
  public void menyalakan() {
    menyala = true;
    System.out.println("Menyalakan Laptop " + merek + "...");
  }

  @Override
  public void bukaApp(String namaApp) {
    if (menyala == true) {
      System.out.println("membuka aplikasi " + namaApp);
    }
  }

  @Override
  public void mematikan() {
    menyala = false;
    System.out.println("Mematikan Laptop...");
  }

  // setter
  public void setRam(int ram){
    this.ram = ram;
  }

  // getter
  public int getRam(){
    return ram;
  }

}
