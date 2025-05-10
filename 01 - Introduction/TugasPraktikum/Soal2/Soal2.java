package Soal2;

public class Soal2 {
  public static void main(String[] args) {
        /*
          SOAL 2
          Buatlah class untuk membuat object geometri: segitiga, persegi panjang,
          persegi, lingkaran, jajargenjang, trapesium, belah ketupat dan layang
          layang. Setiap class harus dilengkapi dengan method untuk men-set nilai
          variabel variabel yang ada di dalam class. selain itu setiap class juga
          harus memiliki method hitungLuas( ), hitungKeliling( ), dan printState( )
          untuk menampilkan nilai variabel-variabel terkini.*/


    // segitiga
    Segitiga s = new Segitiga();
    s.setNilai(5, 10, 15, 15, 5);
    s.printState();

    System.out.println();

    // Persegi Panjang
    PersegiPanjang pp = new PersegiPanjang();
    pp.setNilai(5, 10);
    pp.printState();

    System.out.println();

    // Persegi
    Persegi p = new Persegi();
    p.setNilai(5);
    p.printState();

    System.out.println();

    // Lingkaran
    Lingkaran lingkaran = new Lingkaran();
    lingkaran.setNilai(10);
    lingkaran.printState();

    System.out.println();

    // Jajar Genjang
    JajarGenjang jg = new JajarGenjang();
    jg.setNilai(5, 3, 2);
    jg.printState();

    System.out.println();

    // Trapesium
    Trapesium trapesium = new Trapesium();
    trapesium.setNilai(5, 4, 5, 2, 2);
    trapesium.printState();

    System.out.println();

    // Belah Ketupat
    BelahKetupat bk = new BelahKetupat();
    bk.setNilai(7, 7, 5);
    bk.printState();

    System.out.println();

    // Layang layang
    LayangLayang ll = new LayangLayang();
    ll.setNilai(10, 5, 2, 4);
    ll.printState();


  }
}


