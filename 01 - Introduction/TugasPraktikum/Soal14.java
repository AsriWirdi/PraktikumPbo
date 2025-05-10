import java.util.Scanner;

public class Soal14 {
  /*
  * Buatlah program untuk mengidentifikasi Kata terpanjang yang ada pada
    sebuah kalimat. Program akan menerima input berupa kalimat yang terdiri
    dari beberapa kata. Setiap kata akan dipisahkan oleh spasi. Selanjutnya
    program akan menampilkan nilai panjang dari kata terpanjang diikuti
    dengan kata yang dimaksud. Panjang kata berarti banyaknya karakter
    yang ada pada kata tersebut. Misalnya kata: berusaha panjangnya
    adalah 8 karena ada delapan karakter di dalam kata berusaha. Berikut ini
    contoh IO programnya:
      Sedang berusaha menjadi lebih baik lagi bekerja keras dan pantang menyerah bertanggungjawab percaya diri
      16 bertanggungjawab
  * */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String kalimat = sc.nextLine();

    int jumlahKarakter = 0;
    String karakter = null;
    String[] kata = kalimat.split(" ");
    for (int i = 0; i < kata.length; i++) {
      String[] jumlah = kata[i].split("");
      if (jumlah.length > jumlahKarakter) {
        jumlahKarakter = jumlah.length;
//        System.out.println(jumlahKarakter);
        karakter = kata[i];
      }
    }

    System.out.println(jumlahKarakter + " " + karakter);

  }
}
