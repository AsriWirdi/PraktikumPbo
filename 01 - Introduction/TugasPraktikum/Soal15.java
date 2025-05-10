import java.util.Scanner;

public class Soal15 {
    /*
    *  Buatlah Program Kriptografi sederhana untuk Algoritma Caesar Cipher
      dan Vigenere Cipher (masing-masing disertai encrypt dan decrypt).
      Jelaskan langkah-langkah manual dari kedua algoritma tersebut, susun
      algoritmanya, buat flowchartnya menggunakan flowgorithm, kemudian
      buatlah source code untuk mengimplementasikan kedua algoritma
      Kriptografi tersebut.

      Langkah-langkah Manual :
      1.Caesar Chipher
        Caesar Chiper mengenkripsi dengan menggeser setiap huruf sejumlah k posisi dalam alfabet
        Langkah manual Caesar Chiper ( misalnya geser = 3).
        - Plaintext : HELLO
        - Geser setiap huruf 3 posisi:
          - H -> K
          - E -> H
          - L -> O
          - L -> O
          - O -> R
         - ChiperText : KHOOR
         - Jadi tiap huruf dari Plaintextnya itu di geser ke kanan sebanyak 3 (+3)


       2. Vigenere Chiper
          Menggunakan kunci huruf untuk menentukan pergeesran setiap huruf dalam pesan

          Langkah manual Vigenere Chiper ( misalnya key = KEY )
          - PlainText : HELLO
          - Ulangi key : KEYKE
          - Geser per huruf berdasarkan key(A = 0, B = 1, ... Z = 25) Encrypt (plain + key) %26
            - H + K = 7 + 10 = 17 (R)
            - E + E = 4 + 4 = 8 (I)
            - L + Y = 11 + 24 = 35 (J) (35 % 26 = 9)
            - L + K = 11 + 10 = 21 (V)
            - O + E = 14 + 4 = 18 (S)

           - Chipertext : RIJVS
           - Decrypt : Kurangkan nilai key dari huruf chiper (chiper - key + 26) % 26, dan wrap ke A-Z jika perlu



      *
    * */

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("CAESAR CIPHER");
    caesarChiper();
    System.out.println();

    System.out.println("VIGENERE CIPHER");
    vigenereChiper();
    System.out.println();

  }

  static void caesarChiper() {
    System.out.print("Plaintext: ");
    String plain = sc.next().toUpperCase();
    System.out.print("geser: ");
    int geser = sc.nextInt();

    String[] hurufStr = plain.split("");
    char[] hurufChar = new char[hurufStr.length];

    for (int i = 0; i < hurufStr.length; i++) {
      hurufChar[i] = hurufStr[i].charAt(0);
    }

    // Encrypt
    char[] encrypt = new char[hurufChar.length];
    for (int i = 0; i < hurufStr.length; i++) {
      if (hurufChar[i] >= 65 && hurufChar[i] <= 90) {
        encrypt[i] = (char) ((hurufChar[i] + geser));
      }
    }

    // TAMPILKAN ENCRYPT
    System.out.println("Encrypt: ");
    for (char c : encrypt) {
      System.out.print(c);
    }
    System.out.println();

    // Decrypt
    char[] decrypt = new char[hurufChar.length];
    for (int i = 0; i < hurufStr.length; i++) {
      if (hurufChar[i] >= 65 && hurufChar[i] <= 90) {
        decrypt[i] = (char) ((encrypt[i] - geser));
      }
    }

    // TAMPILKAN DECRYPT
    System.out.println("Decrypt: ");
    for (char c : decrypt) {
      System.out.print(c);
    }
    System.out.println();
  }


  static void vigenereChiper() {

    System.out.print("Plaintext: ");
    String plaintext = sc.next().toUpperCase();
    StringBuilder hasil = new StringBuilder();

    System.out.print("Key: ");
    String key = sc.next().toUpperCase();

    for (int i = 0, j = 0; i < plaintext.length(); i++) {
      char huruf = plaintext.charAt(i);

      if (huruf < 'A' || huruf > 'Z') {
        hasil.append(huruf); // Abaikan karakter selain A-Z
        continue;
      }

      int shift = key.charAt(j % key.length()) - 'A'; // Geser berdasarkan huruf kunci
      char enkripsi = (char) ((huruf - 'A' + shift) % 26 + 'A');
      hasil.append(enkripsi);
      j++;
    }

    System.out.print("Encrypt: ");
    System.out.println(hasil.toString());


    // Decrypt
    System.out.print("Decrypt: ");
    String ciphertext = hasil.toString();  // hasil dari enkripsi

    StringBuilder hasilDekripsi = new StringBuilder(); // GANTI dengan StringBuilder baru

    for (int i = 0, j = 0; i < ciphertext.length(); i++) {
      char huruf = ciphertext.charAt(i);

      if (huruf < 'A' || huruf > 'Z') {
        hasilDekripsi.append(huruf); // Abaikan karakter selain A-Z
        continue;
      }

      int shift = key.charAt(j % key.length()) - 'A'; // Geser berdasarkan huruf kunci
      char dekripsi = (char) ((huruf - 'A' - shift + 26) % 26 + 'A');
      hasilDekripsi.append(dekripsi);
      j++;
    }

    System.out.println(hasilDekripsi.toString());


  }


//  static void vigenereChiper() {
//
//    System.out.print("Plaintext: ");
//    String plain = sc.next().toUpperCase();
//    char[] plainChar = plain.toCharArray();
//
//    System.out.print("Key: ");
//    String key = sc.next().toUpperCase();
//    char[] keyChar = new char[plain.length()];
//
//    for (int i = 0; i < key.length(); i++) {
//      keyChar[i] = plainChar[i];
//    }
//
//
//    for (int i = key.length(); i < keyChar.length; i++) {
//    for (int j = 0; j < keyChar.length; j++) {
//      int indexValueKosong = 0;
//      if(keyChar[j] == ' '){
//        indexValueKosong = j;
//      }
//      keyChar[i] = keyChar[indexValueKosong];
//    }
//
//    }
//
//    //tes tampilkan keychar
//    for (char c : keyChar) {
//      System.out.print(c);
//    }
//
//
//  }

}
