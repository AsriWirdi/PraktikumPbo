import java.util.Scanner;

public class Soal13 {
  // Buatlah sebuah program kriptografi sederhana dengan scenario berikut.
  //Program akan menerima sebuah kalimat (terdiri dari beberapa kata)
  //kemudian anda diminta untuk memanipulasi semua huruf vocal yang ada
  //pada kalimat tersebut dengan format:
  //a menjadi ava
  //i menjadi ivi
  //u menjadi uvu
  //e menjadi eve
  //o menjadi ovo
  //berikut ini contoh Input-Output programnya:
  //selamat belajar java
  //sevelavamavat bevelavajavar javavava
  //informatika unsulbar
  //ivinfovormavativikava uvunsuvulbavar

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine().toUpperCase();
    String[] kriptografi = a.split("");

    for (int i = 0; i < kriptografi.length; i++) {
      switch (kriptografi[i]){
        case "A" -> kriptografi[i] = "ava";
        case "I" -> kriptografi[i] = "ivi";
        case "U" -> kriptografi[i] = "uvu";
        case "E" -> kriptografi[i] = "eve";
        case "O" -> kriptografi[i] = "ovo";
      }
    }

    for(String k : kriptografi){
      System.out.print(k.toLowerCase());
    }
  }
}
