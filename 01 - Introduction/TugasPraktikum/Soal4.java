import java.util.Scanner;
public class Soal4 {

  public static void main(String[] args) {
      /* Soal 3
      * Buatlah program untuk menghitung debit air dengan input consol terdiri
        dari nilai luas permukaan dan kecepatan aliran air.
      **/

    //Debit = Luas Penampang × Kecepatan
    // Nilai satuan umum :
    // - Luas dalam m^2
    // - Kecepatan dalam m/s
    // - Maka Debit dalam m^3/s

    Scanner sc = new Scanner(System.in);

    // Input luas permukaan
    System.out.print("Masukkan luas penampang aliran air (m^2): ");
    double luas = sc.nextDouble();

    // Input kecepatan aliran
    System.out.print("Masukkan kecepatan aliran air (m/s): ");
    double kecepatan = sc.nextDouble();

    // Hitung debit
    double debit = luas * kecepatan;

    // Tampilkan hasil
    System.out.println("Debit air = " + debit + " m^3/s");
  }
}
