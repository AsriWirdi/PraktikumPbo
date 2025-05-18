package test.LatihanIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class ContohNyata {
  public static void main(String[] args) {
    /*
      1. Menyimpan daftar nama mahasiswa (ArrayList<String>).
      2. Menampilkan semua nama menggunakan ListIterator.
      3. Mencari mahasiswa dengan nama tertentu, lalu:
          - Jika ditemukan, ubah namanya.
          - Jika tidak ditemukan, tambahkan nama baru ke akhir list.
      4. Setelah itu, tampilkan daftar terbaru maju dan mundur.*/

    ArrayList<String> daftarNama = new ArrayList<>();
    daftarNama.add("Rina");
    daftarNama.add("Dedi");
    daftarNama.add("Sinta");

    /*User ingin mengganti "Dedi" menjadi "Denny".
      Jika user cari "Tono", karena tidak ditemukan, program akan menambahkan
      "Tono" ke akhir list.*/

    Scanner sc = new Scanner(System.in);
    System.out.println(daftarNama);

    System.out.print("Masukkan nama yang ingin di ganti: ");
    String search = sc.nextLine();

    ListIterator<String> itrDaftarNama = daftarNama.listIterator();

    boolean ditemukan = false;
    while (itrDaftarNama.hasNext()) {
      String elemen = itrDaftarNama.next();

      if (elemen.equalsIgnoreCase(search)) {
        System.out.print("Masukkan nama baru: ");
        String namaBaru = sc.nextLine();
        itrDaftarNama.set(namaBaru);
        ditemukan = true;
        break;
      }
    }

    if(!ditemukan){
      daftarNama.add(search);
    }

    System.out.println(daftarNama);

  }
}
