package test.LatihanIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Soal3 {
  public static void main(String[] args) {
    ArrayList<String> daftarNama = new ArrayList<>();
    daftarNama.add("Ali");
    daftarNama.add("Budi");
    daftarNama.add("Cici");
    daftarNama.add("Dina");

    ListIterator<String> itrDaftarNama = daftarNama.listIterator();

    while (itrDaftarNama.hasNext()){
      System.out.println(itrDaftarNama.next());
    }
    System.out.println();

    while (itrDaftarNama.hasPrevious()){
      System.out.println(itrDaftarNama.previous());
    }
  }
}
