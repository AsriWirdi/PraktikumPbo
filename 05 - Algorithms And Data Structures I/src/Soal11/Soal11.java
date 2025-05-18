package Soal11;

import java.util.Vector;

public class Soal11 {
    public static void main(String[] args) {
      Vector<Integer> vector = new Vector<>();

      // Simpan 10 bilangan (bisa kamu ganti dengan angka lain)
      vector.add(34);
      vector.add(12);
      vector.add(56);
      vector.add(7);
      vector.add(89);
      vector.add(23);
      vector.add(45);
      vector.add(10);
      vector.add(67);
      vector.add(3);

      System.out.println("Sebelum diurutkan: " + vector);

      // Bubble Sort Ascending
      for (int i = 0; i < vector.size() - 1; i++) {
        for (int j = 0; j < vector.size() - 1 - i; j++) {

          if (vector.get(j) > vector.get(j + 1)) {
            // Tukar elemen
            int temp = vector.get(j);
            vector.set(j, vector.get(j + 1));
            vector.set(j + 1, temp);
          }
        }
      }

      System.out.println("Setelah diurutkan ascending: " + vector);
    }


}
