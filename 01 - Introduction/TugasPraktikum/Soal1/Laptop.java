package Soal1;

// 2. Soal1.Laptop
class Laptop {
  // States
  String merek;
  int ram;
  boolean menyala;

  Laptop(String merek, int ram) {
    this.merek = merek;
    this.ram = ram;
  }

  // Behaviors

  void menyalakan() {
    menyala = true;
    System.out.println("Menyalakan Soal1.Laptop...");
  }

  void bukaApp(String namaApp) {
    if (menyala == true) {
      System.out.println("membuka aplikasi " + namaApp);
    }
  }

  void mematikan() {
    menyala = false;
    System.out.println("Mematikan Soal1.Laptop...");
  }
}
