package Soal3;

// Class Utama
public class Rumah {

  // Inner Class 1: Kamar
  public class Kamar {
    String namaPenghuni;
    int luas;

    public Kamar(String namaPenghuni, int luas) {
      this.namaPenghuni = namaPenghuni;
      this.luas = luas;
    }

    public void deskripsi() {
      System.out.println("Kamar milik: " + namaPenghuni);
      System.out.println("Luas kamar: " + luas + " m²");
    }
  }

  // Inner Class 2: Dapur
  public class Dapur {
    boolean adaKompor;
    boolean adaKulkas;

    public Dapur(boolean adaKompor, boolean adaKulkas) {
      this.adaKompor = adaKompor;
      this.adaKulkas = adaKulkas;
    }

    public void cekPeralatan() {
      String cekKompor = "Tidak Ada";
      if(adaKompor) {
        cekKompor = "Ada";
      }
      String cekKulkas = "Tidak Ada";
      if(adaKulkas) {
        cekKulkas = "Ada";
      }
      System.out.println("Dapur memiliki kompor: " + cekKompor);
      System.out.println("Dapur memiliki kulkas: " + cekKulkas);
    }
  }

  // Inner Class 3: RuangTamu
  public class RuangTamu {
    int jumlahKursi;
    boolean adaTV;

    public RuangTamu(int jumlahKursi, boolean adaTV) {
      this.jumlahKursi = jumlahKursi;
      this.adaTV = adaTV;
    }

    public void tampilkanRuangTamu() {
      String cekTv = "Tidak ada";
      if(adaTV) {
        cekTv = "Ada";
      }
      System.out.println("Jumlah kursi di ruang tamu: " + jumlahKursi);
      System.out.println("Apakah ada TV? " + cekTv);
    }
  }
}

