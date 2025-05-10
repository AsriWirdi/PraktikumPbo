import java.util.ArrayList;
import java.util.Scanner;

public class Soal8 {
      /*
    * Buatlah program transkrip nilai untuk menginput nilai dan menampilkan
      data transkrip (lakukan identifikasi terhadap transkrip kalian masing
      masing di SIAKAD Unsulbar) lalu demokan hasil Aplikasi yang dibuat
      menggunakan data transkrip kalian. Desain dan susun program sekreatif
      mungkin. Lengkapi fitur-fiturnya dengan operasi CRUD berbasis
      Array/ArrayList/LinkedList/Vector (tanpa menggunakan file maupun
      database server/DBMS)
    * */

  static Scanner sc = new Scanner(System.in);
  static ArrayList<Transkrip> daftarTranskrip = new ArrayList();

  public static void main(String[] args) {
    while (true) {
      System.out.println("\n=== MENU TRANSKIP NILAI ===");
      System.out.println("   | 1. CREATE TRANSKIP |");
      System.out.println("   | 2. READ TRANSKIP   |");
      System.out.println("   | 3. UPDATE TRANSKIP |");
      System.out.println("   | 4. DELETE TRANSKIP |");
      System.out.println("   | 0. EXIT            |");
      System.out.println("============================");
      System.out.print("Pilih menu : ");
      int menu = sc.nextInt();
      sc.nextLine(); // bersihkan buffer

      switch (menu) {
        case 1 -> tambahTransip();
        case 2 -> tampilkanTranskrip();
        case 3 -> editTranskrip();
        case 4 -> hapusTranskrip();
        case 0 -> {
          System.out.println("Terima kasih");
          return;
        }
        default -> System.out.println("Menu tidak tersedia.");
      }

    }

  }

  static void tambahTransip() {
    System.out.print("Kode MK    : ");
    String kode = sc.nextLine().toUpperCase();

    System.out.print("Nama MK    : ");
    String nama = sc.nextLine().toUpperCase();

    System.out.print("SKS        : ");
    int sks = sc.nextInt();
    sc.nextLine(); // bersihkan buffer

    System.out.print("Nilai Huruf (A/B/C/D/E): ");
    String huruf = sc.next().toUpperCase();

    double angka = konversiNilai(huruf);
    if (angka < 0) {
      System.out.println("Nilai huruf tidak Valid");
      return;
    }

    daftarTranskrip.add(new Transkrip(kode, nama, sks, huruf, angka));
    System.out.println("Data berhasil ditambahkan.");
  }

  static double konversiNilai(String huruf) {
    return switch (huruf) {
      case "A" -> 4.0;
      case "B" -> 3.0;
      case "C" -> 2.0;
      case "D" -> 1.0;
      case "E" -> 0.0;
      default -> 0.0;
    };
  }

  static void tampilkanTranskrip() {
    System.out.println("\n=== DATA TRANSKRIP NILAI ===");
    if (daftarTranskrip.isEmpty()) {
      System.out.println("Belum ada data.");
      return;
    }

    System.out.printf("%-10s %-25s %3s %-10s %-10s\n", "Kode", "Nama Mata Kuliah", "SKS", "Nilai", "Angka");
    System.out.println("-------------------------------------------------------------");
    for (Transkrip t : daftarTranskrip) {
      t.print();
    }
  }


  static void editTranskrip() {
    tampilkanTranskrip();
    System.out.print("Masukkan Kode MK yang ingin diedit: ");
    String kodeEdit = sc.nextLine().toUpperCase();

    boolean ditemukan = false;
    for (Transkrip t : daftarTranskrip) {
      if(t.getKodeMK().equalsIgnoreCase(kodeEdit)) {
        System.out.print("Nama MK baru : ");
        t.setNamaMK(sc.nextLine().toUpperCase());

        System.out.print("SKS baru : ");
        t.setSks(sc.nextInt());
        sc.nextLine(); // bersihkan buffer

        System.out.print("Nilai Huruf baru (A/B/C/D/E): ");
        t.setNilaiHuruf(sc.nextLine().toUpperCase());

        t.setNilaiAngka(konversiNilai(t.getNilaiHuruf()));

        System.out.println("Data berhasil diupdate.");
        ditemukan = true;
        break;

      }
    }

    if(!ditemukan) {
      System.out.println("Data tidak ditemukan");
    }
  }

  static void hapusTranskrip() {
    tampilkanTranskrip();
    System.out.print("Masukkan kode MK yang ingin dihapus: ");
    String kodeHapus = sc.next().toUpperCase();

    boolean diHapus = daftarTranskrip.removeIf(t -> t.getKodeMK().equalsIgnoreCase(kodeHapus));

    if(diHapus) {
      System.out.println("Data berhasil dihapus");
      return;
    } else {
      System.out.println("Data tidak ditemukan");
    }

  }

//  static void hitungIPK(){
//    if (daftarTranskrip.isEmpty()) {
//      System.out.println("Belum ada data.");
//    }
//
//    double totalSKS = 0;
//    double totalBobot = 0;
//
//    for (Transkrip t : daftarTranskrip) {
//      totalSKS += t.getSks();
//      totalBobot += t.getNilaiAngka() * t.getSks();
//    }
//
//    double ipk = totalBobot/totalSKS;
//    System.out.printf("Total SKS: %.0f\n", totalSKS);
//    System.out.printf("IPK Sementara: %.2f\n", ipk);
//  }
}


class Transkrip {
  private String kodeMK, namaMK, nilaiHuruf;
  private double nilaiAngka;
  private int sks;

  public Transkrip(String kodeMk, String namaMk, int sks, String nilaiHuruf, double nilaiAngka) {
    this.kodeMK = kodeMk;
    this.namaMK = namaMk;
    this.nilaiHuruf = nilaiHuruf;
    this.nilaiAngka = nilaiAngka;
    this.sks = sks;
  }

  // getter
  public String getKodeMK() {
    return kodeMK;
  }

  public String getNamaMK() {
    return namaMK;
  }

  public String getNilaiHuruf() {
    return nilaiHuruf;
  }

  public double getNilaiAngka() {
    return nilaiAngka;
  }

  public int getSks() {
    return sks;
  }

  // setter
  public void setKodeMK(String kodeMK) {
    this.kodeMK = kodeMK;
  }

  public void setNamaMK(String namaMK) {
    this.namaMK = namaMK;
  }

  public void setNilaiHuruf(String nilaiHuruf) {
    this.nilaiHuruf = nilaiHuruf;
  }

  public void setNilaiAngka(double nilaiAngka) {
    this.nilaiAngka = nilaiAngka;
  }

  public void setSks(int sks) {
    this.sks = sks;
  }


  public void print() {
    System.out.printf("%-10s %-25s %3d %-10s %-10.2f\n",
            kodeMK, namaMK, sks, nilaiHuruf, nilaiAngka);
  }
}
