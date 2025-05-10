package Soal1;

public class Mobil {
  // 1. Mobil

  // Bagan
  /*+------------------------+
    |          Mobil         |
    +------------------------+
    | - merk: String         |
    | - warna: String        |
    | - kecepatan: int       |
    | - mesinNyala: boolean  |
    +----------------------+
    | +nyalakanMesin(): void |
    | +matikanMesin(): void  |
    | +jalan(): void         |
    | +rem(): void           |
    +------------------------+
   */

  public String merk;
  public String warna;
  int kecepatan;
  boolean mesinNyala;

  public Mobil(String merk, String warna) {
    this.merk = merk;
    this.warna = warna;
  }

  public Mobil() {

  }


  public void nyalakanMesin() {
    mesinNyala = true;
    System.out.println("Mesin dinyalakan");
  }

  public void matikanMesin() {
    mesinNyala = false;
    System.out.println("Mesin dimatikan");
  }

  public void jalan() {
    if (mesinNyala) {
      System.out.println("Mobil berjalan");
    } else {
      System.out.println("Mesin belum dinyalakan!");
    }
  }

  public void rem() {
    System.out.println("Mobil berhenti");
  }

}
