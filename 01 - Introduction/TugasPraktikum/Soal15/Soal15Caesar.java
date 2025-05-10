package Soal15;

import java.util.Scanner;

public class Soal15Caesar {

  public static String encrypt(String text, int shift) {
    StringBuilder result = new StringBuilder();

    for (char c : text.toCharArray()) {
      if (Character.isUpperCase(c)) {
        result.append((char) ((c - 'A' + shift) % 26 + 'A'));
      } else if (Character.isLowerCase(c)) {
        result.append((char) ((c - 'a' + shift) % 26 + 'a'));
      } else {
        result.append(c);
      }
    }

    return result.toString();
  }

  public static String decrypt(String text, int shift) {
    return encrypt(text, 26 - (shift % 26));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String lastEncrypted = "";
    // untuk menyimpan hasil enkripsi terakhir yang telah dihasilkan dari input sebelumnya, supaya program bisa membedakan:
    // Apakah teks yang dimasukkan user sekarang itu text baru yang mau di encripsi atau hasil encrpsi sebelumnya yang perlu di dekripsi balik:

    // Contoh alur:
    // User input: hello
    // Program enkripsi jadi: khoor
    // Variabel lastEncrypted diset jadi "khoor"
    // User input lagi: khoor
    //  Program cek: input sama dengan lastEncrypted?
    // Maka lakukan dekripsi: hasil = hello

    System.out.print("Masukkan jumlah geseran : ");
    int shift = sc.nextInt();
    sc.nextLine();

    while (true) {
      System.out.print("Masukkan teks (atau ketik 'exit' untuk keluar): ");
      String input = sc.nextLine();

      if (input.equalsIgnoreCase("exit")) break;

      // Cek apakah input adalah hasil enkripsi sebelumnya
      if (input.equals(lastEncrypted)) {
        String decrypted = decrypt(input, shift);
        System.out.println("Hasil dekripsi: " + decrypted);
      } else {
        String encrypted = encrypt(input, shift);
        System.out.println("Hasil enkripsi: " + encrypted);
        lastEncrypted = encrypted;
      }

      System.out.println();
    }

  }
}
