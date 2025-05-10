package Soal5;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // buat ArrayList bertipe kotak
    ArrayList<Kotak> daftarKotak = new ArrayList<>();

    // Menambahkan beberapa object kotak ke dalam ArrayList
    daftarKotak.add(new Kotak("hijau"));
    daftarKotak.add(new Kotak("kuning"));
    daftarKotak.add(new Kotak("hitam"));

    // Memanggil method objek
    daftarKotak.get(0).setPanjang(5);
    daftarKotak.get(0).setLebar(4);
    System.out.println(daftarKotak.get(0).getLuas());
    System.out.println(daftarKotak.get(0).getKeliling());
    System.out.println(daftarKotak.get(0));


    daftarKotak.get(1).setPanjang(5);
    daftarKotak.get(1).setLebar(4);
    System.out.println(daftarKotak.get(1).getLuas());
    System.out.println(daftarKotak.get(1).getKeliling());
    System.out.println(daftarKotak.get(1));

    daftarKotak.get(2).setPanjang(5);
    daftarKotak.get(2).setLebar(4);
    System.out.println(daftarKotak.get(2).getLuas());
    System.out.println(daftarKotak.get(2).getKeliling());
    System.out.println(daftarKotak.get(2));
  }
}
