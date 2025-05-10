package Soal15;

import java.util.Scanner;

public class Soal15Vigenere {
  // untuk membuat keyword agar panjangnya sama dengan teks
  public static String generateKey(String text, String key) {
    StringBuilder result = new StringBuilder();
    int keyLen = key.length();
    int keyIndex = 0;

    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isLetter(c)) {
        result.append(key.charAt(keyIndex % keyLen));
        keyIndex++;
      } else {
        result.append(c); // biarkan karakter non-huruf
      }
    }
    return result.toString();
  }

  public static String encrypt(String text, String key) {
    StringBuilder result = new StringBuilder();
    String fullKey = generateKey(text, key);

    for (int i = 0; i < text.length(); i++) {
      char ptChar = text.charAt(i);
      char keyChar = fullKey.charAt(i);

      if (Character.isUpperCase(ptChar)) {
        char ch = (char) ((ptChar - 'A' + Character.toUpperCase(keyChar) - 'A') % 26 + 'A');
        result.append(ch);
      } else if (Character.isLowerCase(ptChar)) {
        char ch = (char) ((ptChar - 'a' + Character.toLowerCase(keyChar) - 'a') % 26 + 'a');
        result.append(ch);
      } else {
        result.append(ptChar);
      }
    }
    return result.toString();
  }

  public static String decrypt(String text, String key) {
    StringBuilder result = new StringBuilder();
    String fullKey = generateKey(text, key);

    for (int i = 0; i < text.length(); i++) {
      char ctChar = text.charAt(i);
      char keyChar = fullKey.charAt(i);

      if (Character.isUpperCase(ctChar)) {
        char ch = (char) ((ctChar - 'A' - (Character.toUpperCase(keyChar) - 'A') + 26) % 26 + 'A');
        result.append(ch);
      } else if (Character.isLowerCase(ctChar)) {
        char ch = (char) ((ctChar - 'a' - (Character.toLowerCase(keyChar) - 'a') + 26) % 26 + 'a');
        result.append(ch);
      } else {
        result.append(ctChar);
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String lastEncrypted = "";
    String key = "";

    System.out.print("Masukkan keyword: ");
    key = sc.nextLine();

    while (true) {
      System.out.print("Masukkan teks (atau 'exit' untuk keluar): ");
      String input = sc.nextLine();

      if (input.equalsIgnoreCase("exit")) break;

      if (input.equals(lastEncrypted)) {
        String decrypted = decrypt(input, key);
        System.out.println("Hasil dekripsi: " + decrypted);
      } else {
        String encrypted = encrypt(input, key);
        System.out.println("Hasil enkripsi: " + encrypted);
        lastEncrypted = encrypted;
      }

      System.out.println();
    }
  }
}
