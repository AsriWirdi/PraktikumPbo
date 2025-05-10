package Soal8dan9.Laptop;

import Soal7.Laptop;

public class Lenovo extends Laptop {
  // Constructor Overloading
  public Lenovo() {

  }

  public Lenovo(String merek) {
    this.merek = merek;
  }

  public Lenovo(String merek, int ram) {
    this.merek = merek;
    this.ram = ram;
  }


  // Method Overloading
  @Override
  protected void menyalakan() {
    menyala = true;
    System.out.println("Menyalakan Laptop " + merek + "...");
  }

  @Override
  protected void bukaApp(String namaApp) {
    if (menyala == true) {
      System.out.println("membuka aplikasi " + namaApp);
    }
  }

  @Override
  protected void mematikan() {
    menyala = false;
    System.out.println("Mematikan Soal1.Laptop...");
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
