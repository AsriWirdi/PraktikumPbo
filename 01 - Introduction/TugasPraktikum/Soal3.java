import java.util.Scanner;

public class Soal3 {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    /*
    * Buatlah program untuk menghitung luas dan keliling bangun datar:
     persegi, persegi panjang, segitiga, jajar genjang, trapesium, layang
     layang, belah ketupat dan lingkaran. Sesuaikan variabel input yang
     dibutuhkan. input variabel dilakukan melalui console window
    * */

    Soal3 geometri = new Soal3();
    geometri.persegi();
    geometri.persegiPanjang();
    geometri.segitiga();
    geometri.jajarGenjang();
    geometri.trapesium();
    geometri.layanglayang();
    geometri.belahKetupat();
    geometri.lingkaran();



  }

  void persegi() {
    System.out.println("PERSEGI");
    System.out.print("Masukkan sisi persegi : ");
    double sisi = sc.nextInt();
    System.out.println("Luas Soal2.Persegi : " + sisi * sisi);
    System.out.println("Keliling Soal2.Persegi : " + 4 * sisi);
    System.out.println();
  }


  void persegiPanjang() {
    System.out.println("PERSEGI PANJANG");
    System.out.print("Masukkan panjang : ");
    double panjang = sc.nextInt();

    System.out.print("Masukkan lebar : ");
    double lebar = sc.nextInt();

    System.out.println("Luas Soal2.Persegi Panjang : " + panjang * lebar);
    System.out.println("Keliling Soal2.Persegi Panjang : " + 2 * (panjang + lebar));
    System.out.println();
  }

  void segitiga(){
    System.out.println("PERSEGI SEGITIGA");
    System.out.print("Masukkan alas : ");
    double alas = sc.nextDouble();

    System.out.print("Masukkan tinggi : ");
    double tinggi = sc.nextDouble();

    System.out.print("Masukkan Sisi1 : ");
    double sisi1 = sc.nextDouble();

    System.out.print("Masukkan Sisi2 : ");
    double sisi2 = sc.nextDouble();

    System.out.print("Masukkan Sisi3 : ");
    double sisi3 = sc.nextDouble();


    System.out.println("Luas Soal2.Segitiga : " + 0.5 * (alas * tinggi));
    System.out.println("Keliling Soal2.Segitiga : " + (sisi1 + sisi2 + sisi3));
    System.out.println();
  }

  void jajarGenjang(){
    System.out.println("JAJAR GENJANG");
    System.out.print("Masukkan alas : ");
    double alas = sc.nextDouble();

    System.out.print("Masukkan tinggi : ");
    double tinggi = sc.nextDouble();

    System.out.print("Masukkan sisi miring : ");
    double sisiMiring = sc.nextDouble();

    System.out.println("Luas Jajargenjang : " +  (alas * tinggi));
    System.out.println("Keliling Jajargenjang : " + 2 * (alas + sisiMiring));
    System.out.println();
  }

  void trapesium(){
    System.out.println("TRAPESIUM");
    System.out.print("Masukkan sisi atas : ");
    double sisiatas = sc.nextDouble();

    System.out.print("Masukkan sisi bawah : ");
    double sisibawah = sc.nextDouble();

    System.out.print("Masukkan tinggi : ");
    double tinggi = sc.nextDouble();

    System.out.print("Masukkan sisi miring kiri: ");
    double sisiMiringKiri = sc.nextDouble();

    System.out.print("Masukkan sisi miring kanan: ");
    double sisiMiringKanan = sc.nextDouble();

    System.out.println("Luas Soal2.Trapesium : " +  0.5 * (sisiatas + tinggi) * tinggi);
    System.out.println("Keliling Soal2.Trapesium : " + (sisiatas + sisibawah + sisiMiringKanan + sisiMiringKiri));
    System.out.println();
  }

  void layanglayang(){
    System.out.println("LAYANG LAYANG");
    System.out.print("Masukkan diagonal 1 : ");
    double d1 = sc.nextDouble();

    System.out.print("Masukkan diagonal 2 : ");
    double d2 = sc.nextDouble();

    System.out.print("Masukkan sisi A : ");
    double sisiA = sc.nextDouble();

    System.out.print("Masukkan sisi B : ");
    double sisiB = sc.nextDouble();

    System.out.println("Luas Layang layang : " +  (0.5 * d1 * d2));
    System.out.println("Keliling Layang layang : " + 2 * (sisiA + sisiB));
    System.out.println();
  }


  void belahKetupat(){
    System.out.println("BELAH KETUPAT");
    System.out.print("Masukkan diagonal 1 : ");
    double d1 = sc.nextDouble();

    System.out.print("Masukkan diagonal 2 : ");
    double d2 = sc.nextDouble();

    System.out.print("Masukkan sisi : ");
    double sisi = sc.nextDouble();

    System.out.println("Luas Layang layang : " +  0.5 * d1 * d2);
    System.out.println("Keliling Layang layang : " + 4 * sisi);
    System.out.println( );
  }

  void lingkaran(){
    System.out.println("LINGKARAN");
    System.out.print("Masukkan Jari jari : ");
    double jariJari = sc.nextDouble();

    System.out.printf("Luas Layang layang : %.2f\n" , ( Math.PI * jariJari * jariJari));
    System.out.printf("Keliling Layang layang : %.2f\n" , (2 * Math.PI * jariJari));
    System.out.println();
  }
}
