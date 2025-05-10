import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Soal16 {
  Scanner sc = new Scanner(System.in);

  /*
  * Buatlah program Java yang dilengkapi dengan input Scanner untuk
    membuat semua pola (pattern) berikut (silahkan download lalu buka
    menggunakan notepad/notepad++ untuk melihat hasilnya):
    https://gist.github.com/FOSSALGO/c7a02f44b09fe96654da4f027e2b84af
  * */
  public static void main(String[] args) {
    System.out.println("--------------------------");
    System.out.println("PROGRAM SEMUA POLA (1 - 50)");
    System.out.println("--------------------------\n");
    Soal16 s = new Soal16();
    s.pola1();
    s.pola2();
    s.pola3();
    s.pola4();
    s.pola5();
    s.pola6();
    s.pola7();
    s.pola8();
    s.pola9();
    s.pola10();
    s.pola11();
    s.pola12();
    s.pola13();
    s.pola14();
    s.pola15();
    s.pola16();
    s.pola17();
    s.pola18();
    s.pola19();
    s.pola20();
    s.pola21();
    s.pola22();
    s.pola23();
    s.pola24();
    s.pola25();
    s.pola26();
    s.pola27();
    s.pola28();
    s.pola29();
    s.pola30();
    s.pola31();
    s.pola32();
    s.pola33();
    s.pola34();
    s.pola35();
    s.pola36();
    s.pola37();
    s.pola38();
    s.pola39();
    s.pola40();
    s.pola41();
    s.pola42();
    s.pola43();
    s.pola44();
    s.pola45();
    s.pola46();
    s.pola47();
    s.pola48();
    s.pola49();
    s.pola50();
    s.pola50();
    s.pola50();
    s.pola50();


  }

  void pola1() {
    /*
    * --------------------------
      POLA 01
      --------------------------
      6
      * * * * * *

    */


    System.out.println("--------------------------");
    System.out.println("POLA 01");
    System.out.println("--------------------------");
    int pilihan = sc.nextInt();

    for (int i = 1; i <= pilihan; i++) {
      System.out.print("* ");
    }
    System.out.println();
  }


  void pola2() {
    /*
    * --------------------------
      POLA 02
      --------------------------
      8
      *
      *
      *
      *
      *
      *
      *
      *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 02");
    System.out.println("--------------------------");
    int pilihan = sc.nextInt();

    for (int i = 1; i <= pilihan; i++) {
      System.out.println("* ");
    }
    System.out.println();
  }


  void pola3() {
    /*
    * --------------------------
      POLA 03
      --------------------------
      3
      5
      * * * * *
      * * * * *
      * * * * *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 03");
    System.out.println("--------------------------");
    int pilihan = sc.nextInt();
    int pilihan2 = sc.nextInt();

    for (int i = 1; i <= pilihan; i++) {
      for (int j = 1; j <= pilihan2; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola4() {
    /*
    --------------------------
    POLA 04
    --------------------------
    5
    *
    * *
    * * *
    * * * *
    * * * * *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 04");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = a; i >= 1; i--) {
      for (int j = i; j <= a; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola5() {
    /*
    * --------------------------
    POLA 05
    --------------------------
    7
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 05");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = i; j <= a; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola6() {
    /*
    --------------------------
    POLA 06
    --------------------------
    5
            *
          * *
        * * *
      * * * *
    * * * * *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 06");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = i; j < a; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }

  void pola7() {
    /*
    --------------------------
    POLA 07
    --------------------------
    7
    * * * * * * *
      * * * * * *
        * * * * *
          * * * *
            * * *
              * *
                *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 07");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < a - i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola8() {
    /*
    --------------------------
    POLA 08
    --------------------------
    4
       *
      * *
     * * *
    * * * *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 08");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = i; j < a; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }

  void pola9() {
    /*
    --------------------------
    POLA 09
    --------------------------
        5
    * * * * *
     * * * *
      * * *
       * *
        *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 09");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int s = 0; s < i; s++) {
        System.out.print(" ");
      }
      for (int j = 0; j < a - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola10() {
    /*
    --------------------------
    POLA 10
    --------------------------
    5
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 10");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = a - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola11() {
    /*
    --------------------------
    POLA 11
    --------------------------
    5
    * * * * *
    * * * *
    * * *
    * *
    *
    * *
    * * *
    * * * *
    * * * * *


     */
    System.out.println("--------------------------");
    System.out.println("POLA 11");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = a; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 2; i <= a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola12() {
    /*
    --------------------------
    POLA 12
    --------------------------
    5
            *
          * *
        * * *
      * * * *
    * * * * *
      * * * *
        * * *
          * *
            *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 12");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = i; j < a; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = a - 1; i >= 1; i--) {
      for (int j = i; j < a; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola13() {
    /*
    --------------------------
    POLA 13
    --------------------------
    5
    * * * * *
      * * * *
        * * *
          * *
            *
          * *
        * * *
      * * * *
    * * * * *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 13");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      for (int k = i; k < a; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = a - 2; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      for (int k = i; k < a; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola14() {
    /*
    --------------------------
    POLA 14
    --------------------------
    5
        *
       * *
      * * *
     * * * *
    * * * * *
     * * * *
      * * *
       * *
        *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 14");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = i; j < a; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = a - 1; i >= 1; i--) {
      for (int j = i; j < a; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola15() {
    /*
    --------------------------
    POLA 15
    --------------------------
     7
    *
      *
        *
          *
            *
              *
                *


     */
    System.out.println("--------------------------");
    System.out.println("POLA 15");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    System.out.println();
  }


  void pola16() {
    /*
    --------------------------
    POLA 16
    --------------------------
    7
                *
              *
            *
          *
        *
      *
    *



     */
    System.out.println("--------------------------");
    System.out.println("POLA 16");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = a - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    System.out.println();
  }


  void pola17() {
    /*
    --------------------------
    POLA 17
    --------------------------
    4
    *           *
      *       *
        *   *
          *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 17");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a * 2 - 1; j++) {
        if (j == i || j == (a * 2 - 2 - i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola18() {
    /*
    --------------------------
    POLA 18
    --------------------------
    4
          *
        *   *
      *       *
    *           *


     */
    System.out.println("--------------------------");
    System.out.println("POLA 18");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a * 2 - 1; j++) {
        if (j == a - 1 - i || j == a - 1 + i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  void pola19() {
    /*
    --------------------------
    POLA 19
    --------------------------
    4
    *           *
      *       *
        *   *
          *
        *   *
      *       *
    *           *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 19");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a * 2 - 1; j++) {
        if (j == i || j == (a * 2 - 2 - i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = a - 2; i >= 0; i--) {
      for (int j = 0; j < a * 2 - 1; j++) {
        if (j == i || j == (a * 2 - 2 - i)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola20() {
    /*
    --------------------------
    POLA 20
    --------------------------
     5
              *
            * *
          * * *
        * * * *
      * * * * *
      * * * *
      * * *
      * *
      *


     */
    System.out.println("--------------------------");
    System.out.println("POLA 20");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = i; j < a; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Bagian bawah (kiri rata)
    for (int i = a - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();
  }


  void pola21() {
    /*
    --------------------------
    POLA 21
    --------------------------
   5
    *
    * *
    * * *
    * * * *
    * * * * *
      * * * *
        * * *
          * *
            *

     */
    System.out.println("--------------------------");
    System.out.println("POLA 21");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // segitiga turun (kanan rata)
    for (int i = a - 1; i >= 1; i--) {
      for (int j = 0; j < a - i; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();
  }


  void pola22() {
    /*
    --------------------------
    POLA 22
    --------------------------
    5
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5


     */
    System.out.println("--------------------------");
    System.out.println("POLA 22");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola23() {
    /*
    --------------------------
    POLA 23
    --------------------------
    5
    + + + + +
    + + + + +
    + + + + +
    + + + + +
    + + + + +


     */
    System.out.println("--------------------------");
    System.out.println("POLA 23");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print("+ ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola24() {
    /*
    --------------------------
    POLA 24
    --------------------------
    5
    7
    + + + + + + +
    + + + + + + +
    + + + + + + +
    + + + + + + +
    + + + + + + +


     */
    System.out.println("--------------------------");
    System.out.println("POLA 24");
    System.out.println("--------------------------");
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print("+ ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola25() {
    /*
    --------------------------
    POLA 25
    --------------------------
    5
    7
    + = + = + = +
    + = + = + = +
    + = + = + = +
    + = + = + = +
    + = + = + = +

     */
    System.out.println("--------------------------");
    System.out.println("POLA 25");
    System.out.println("--------------------------");
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (j % 2 == 0)
          System.out.print("+ ");
        else
          System.out.print("= ");
      }
      System.out.println();
    }
    System.out.println();
  }

  void pola26() {
    /*
    --------------------------
    POLA 26
    --------------------------
    7
    8
    + + + + + + + +
    = = = = = = = =
    + + + + + + + +
    = = = = = = = =
    + + + + + + + +
    = = = = = = = =
    + + + + + + + +
     */
    System.out.println("--------------------------");
    System.out.println("POLA 26");
    System.out.println("--------------------------");
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < a; i++) {
      char symbol = (i % 2 == 0) ? '+' : '=';
      for (int j = 0; j < b; j++) {
        System.out.print(symbol + " ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola27() {
    /*
    --------------------------
    POLA 27
    --------------------------
    7
    8
    + = + = + = + =
    = + = + = + = +
    + = + = + = + =
    = + = + = + = +
    + = + = + = + =
    = + = + = + = +
    + = + = + = + =

     */
    System.out.println("--------------------------");
    System.out.println("POLA 27");
    System.out.println("--------------------------");
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if ((i + j) % 2 == 0)
          System.out.print("+ ");
        else
          System.out.print("= ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola28() {
    /*
    --------------------------
    POLA 28
    --------------------------
    7
    8
    + + + + + + + +
    + ~ ~ ~ ~ ~ ~ +
    + ~ ~ ~ ~ ~ ~ +
    + ~ ~ ~ ~ ~ ~ +
    + ~ ~ ~ ~ ~ ~ +
    + ~ ~ ~ ~ ~ ~ +
    + + + + + + + +


     */
    System.out.println("--------------------------");
    System.out.println("POLA 28");
    System.out.println("--------------------------");
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (i == 0 || i == a - 1 || j == 0 || j == b - 1)
          System.out.print("+ ");
        else
          System.out.print("~ ");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola29() {
    /*
    --------------------------
    POLA 29
    --------------------------
    Input:
    3 1

    Output:
    *
    *
    *

    Input:
    4 4

    Output:
    ****
    *..*
    *..*
    ****

    Input:
    2 5

    Output:
    *****
    *****

     */
    System.out.println("--------------------------");
    System.out.println("POLA 29");
    System.out.println("--------------------------");
    System.out.print("Input:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Output:");
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("Input:");
    int c = sc.nextInt();
    int d = sc.nextInt();
    System.out.println();

    System.out.println("Output:");
    for (int i = 0; i < c; i++) {
      if (i == 0 || i == c - 1) {
        // Baris pertama atau terakhir: semua *
        for (int j = 0; j < d; j++) {
          System.out.print("*");
        }
      } else {
        // Baris tengah: *..*
        System.out.print("*");
        for (int j = 1; j < d - 1; j++) {
          System.out.print(".");
        }
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Input:");
    int e = sc.nextInt();
    int f = sc.nextInt();

    System.out.println();
    System.out.println("Output:");
    for (int i = 0; i < e; i++) {
      for (int j = 0; j < f; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }


  void pola30() {
    /*
    --------------------------
    POLA 30
    --------------------------
    Input:
    3 1

    Output:
    +
    +
    +

    Input:
    4 4

    Output:
    ++++
    +--+
    +--+
    ++++

    Input:
    2 5

    Output:
    +++++
    +++++

     */
    System.out.println("--------------------------");
    System.out.println("POLA 30");
    System.out.println("--------------------------");
    System.out.println("Input:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println();

    System.out.println("Output:");
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print("+");
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Input:");
    int c = sc.nextInt();
    int d = sc.nextInt();
    System.out.println();

    System.out.println("Output:");
    for (int i = 0; i < c; i++) {
      if (i == 0 || i == c - 1 || d == 1) {
        // Baris pertama / terakhir / jika kolom hanya 1: semua +
        for (int j = 0; j < d; j++) {
          System.out.print("+");
        }
      } else {
        // Baris tengah: +--+
        System.out.print("+");
        for (int j = 1; j < d - 1; j++) {
          System.out.print("-");
        }
        System.out.print("+");
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Input:");
    int e = sc.nextInt();
    int f = sc.nextInt();

    System.out.println("Output:");
    for (int i = 0; i < e; i++) {
      for (int j = 0; j < f; j++) {
        System.out.print("+");
      }
      System.out.println();
    }
    System.out.println();
  }

  void pola31() {
    /*
    --------------------------
    POLA 31
    --------------------------
    4
    +---+---+---+---+
    |   |   |   |   |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 31");
    System.out.println("--------------------------");

    // Meminta input jumlah kolom (variabel 'a')
    int a = sc.nextInt();

    // Mencetak baris atas
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");

    // Mencetak baris isi kosong
    for (int i = 0; i < a; i++) {
      System.out.print("|   ");
    }
    System.out.println("|");

    // Mencetak baris bawah
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola32() {
    /*
    --------------------------
    POLA 32
    --------------------------
    4
    +---+---+---+---+
    | x | x | x | x |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 32");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    // Baris atas
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");

    // Baris isi
    for (int i = 0; i < a; i++) {
      System.out.print("| x ");
    }
    System.out.println("|");

    // Baris bawah
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola33() {
    /*
    --------------------------
    POLA 33
    --------------------------
     4
    +---+---+---+---+
    | x | o | x | o |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 33");
    System.out.println("--------------------------");
    int a = sc.nextInt();

    // Baris atas
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");

    // Baris isi
    for (int i = 0; i < a; i++) {
      if (i % 2 == 0) {
        System.out.print("| x ");
      } else {
        System.out.print("| o ");
      }
    }
    System.out.println("|");

    // Baris bawah
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }

  void pola34() {
    /*
    --------------------------
    POLA 34
    --------------------------
    1001011
    +---+---+---+---+---+---+---+
    | x | o | o | x | o | x | x |
    +---+---+---+---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 34");
    System.out.println("--------------------------");

    String input = sc.next();
    int a = input.length();   // jumlah kolom dari panjang string

    // Baris atas
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");

    // Baris isi
    for (int i = 0; i < a; i++) {
      char bit = input.charAt(i);
      if (bit == '1') {
        System.out.print("| x ");
      } else {
        System.out.print("| o ");
      }
    }
    System.out.println("|");

    // Baris bawah
    for (int i = 0; i < a; i++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola35() {
    /*
    --------------------------
    POLA 35
    --------------------------
    3
    4
    +---+---+---+---+
    |   |   |   |   |
    +---+---+---+---+
    |   |   |   |   |
    +---+---+---+---+
    |   |   |   |   |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 35");
    System.out.println("--------------------------");
    int baris = sc.nextInt();
    int kolom = sc.nextInt();

    for (int i = 0; i < baris; i++) {
      // Baris atas setiap baris isi
      for (int j = 0; j < kolom; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Baris isi kosong
      for (int j = 0; j < kolom; j++) {
        System.out.print("|   ");
      }
      System.out.println("|");
    }

    // Baris bawah terakhir
    for (int j = 0; j < kolom; j++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola36() {
    /*
    --------------------------
    POLA 36
    --------------------------
    3
    4
    +---+---+---+---+
    | x | x | x | x |
    +---+---+---+---+
    | x | x | x | x |
    +---+---+---+---+
    | x | x | x | x |
    +---+---+---+---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 36");
    System.out.println("--------------------------");
    int baris = sc.nextInt();
    int kolom = sc.nextInt();

    for (int i = 0; i < baris; i++) {
      // Baris garis atas
      for (int j = 0; j < kolom; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Baris isi huruf x
      for (int j = 0; j < kolom; j++) {
        System.out.print("| x ");
      }
      System.out.println("|");
    }

    // Baris bawah terakhir
    for (int j = 0; j < kolom; j++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola37() {
    /*
    --------------------------
    POLA 37
    --------------------------
    3
    4
    +---+---+---+---+
    | x | o | x | o |
    +---+---+---+---+
    | x | o | x | o |
    +---+---+---+---+
    | x | o | x | o |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 37");
    System.out.println("--------------------------");
    int baris = sc.nextInt();
    int kolom = sc.nextInt();

    for (int i = 0; i < baris; i++) {
      // Baris atas
      for (int j = 0; j < kolom; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Baris isi selang-seling x dan o
      for (int j = 0; j < kolom; j++) {
        if (j % 2 == 0) {
          System.out.print("| x ");
        } else {
          System.out.print("| o ");
        }
      }
      System.out.println("|");
    }

    // Garis bawah terakhir
    for (int j = 0; j < kolom; j++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola38() {
    /*
    --------------------------
    POLA 38
    --------------------------
    4
    4
    +---+---+---+---+
    | x | x | x | x |
    +---+---+---+---+
    | o | o | o | o |
    +---+---+---+---+
    | x | x | x | x |
    +---+---+---+---+
    | o | o | o | o |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 38");
    System.out.println("--------------------------");
    int baris = sc.nextInt();
    int kolom = sc.nextInt();

    for (int i = 0; i < baris; i++) {
      // Baris atas
      for (int j = 0; j < kolom; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Baris isi x atau o sesuai dengan barisnya
      if (i % 2 == 0) {
        // Isi baris dengan x
        for (int j = 0; j < kolom; j++) {
          System.out.print("| x ");
        }
      } else {
        // Isi baris dengan o
        for (int j = 0; j < kolom; j++) {
          System.out.print("| o ");
        }
      }
      System.out.println("|");
    }

    // Baris bawah terakhir
    for (int j = 0; j < kolom; j++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola39() {
    /*
    --------------------------
    POLA 39
    --------------------------
    3
    4
    +---+---+---+---+
    | x | o | x | o |
    +---+---+---+---+
    | o | x | o | x |
    +---+---+---+---+
    | x | o | x | o |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 39");
    System.out.println("--------------------------");
    int baris = sc.nextInt();
    int kolom = sc.nextInt();

    for (int i = 0; i < baris; i++) {
      // Baris atas
      for (int j = 0; j < kolom; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Baris isi dengan selang-seling x dan o
      for (int j = 0; j < kolom; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("| x ");
        } else {
          System.out.print("| o ");
        }
      }
      System.out.println("|");
    }

    // Baris bawah terakhir
    for (int j = 0; j < kolom; j++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }


  void pola40() {
    /*
    --------------------------
    POLA 40
    --------------------------
    rows: 3
    cols: 4
    1011
    0101
    1001

    +---+---+---+---+
    | x | o | x | x |
    +---+---+---+---+
    | o | x | o | x |
    +---+---+---+---+
    | x | o | o | x |
    +---+---+---+---+


     */
    System.out.println("--------------------------");
    System.out.println("POLA 40");
    System.out.println("--------------------------");

    // Input jumlah baris dan kolom
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    // Input biner untuk setiap baris
    String[] input = new String[rows];
    sc.nextLine();  // Untuk mengkonsumsi newline setelah nextInt()

    for (int i = 0; i < rows; i++) {
      input[i] = sc.nextLine();
    }

    // Mencetak pola kotak
    for (int i = 0; i < rows; i++) {
      // Baris atas
      for (int j = 0; j < cols; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Baris isi
      for (int j = 0; j < cols; j++) {
        char bit = input[i].charAt(j);
        if (bit == '1') {
          System.out.print("| x ");
        } else {
          System.out.print("| o ");
        }
      }
      System.out.println("|");
    }

    // Baris bawah terakhir
    for (int j = 0; j < cols; j++) {
      System.out.print("+---");
    }
    System.out.println("+");
  }

  void pola41() {
    /*
    --------------------------
    POLA 41
    --------------------------
    3
    +---+
    |   |
    +---+---+
    |   |   |
    +---+---+---+
    |   |   |   |
    +---+---+---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 41");
    System.out.println("--------------------------");
    // Input jumlah baris
    int rows = sc.nextInt();

    if (rows > 0) {
      // Mencetak pola bertahap
      for (int i = 1; i <= rows; i++) {
        // Baris atas
        for (int j = 0; j < i; j++) {
          System.out.print("+---");
        }
        System.out.println("+");

        // Baris isi kosong
        for (int j = 0; j < i; j++) {
          System.out.print("|   ");
        }
        System.out.println("|");
      }

      // Baris bawah terakhir
      for (int i = 0; i < rows; i++) {
        System.out.print("+---");
      }
      System.out.println("+");
    }
  }


  void pola42() {
    /*
    --------------------------
    POLA 42
    --------------------------
    rows:4
    2
    5
    1
    7
    +---+---+
    |   |   |
    +---+---+---+---+---+
    |   |   |   |   |   |
    +---+---+---+---+---+
    |   |
    +---+---+---+---+---+---+---+
    |   |   |   |   |   |   |   |
    +---+---+---+---+---+---+---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 42");
    System.out.println("--------------------------");
    // Input jumlah baris
    System.out.print("rows: ");
    int rows = sc.nextInt();
    if (rows > 0) {
      int[] cols = new int[rows];

      // Input jumlah kolom tiap baris
      for (int i = 0; i < rows; i++) {
        cols[i] = sc.nextInt();
      }

      // bagian atas
      for (int i = 0; i < cols[0]; i++) {
        System.out.print("+---");
      }
      System.out.println("+");

      int tampung = 0;
      // Loop per baris
      for (int i = 0; i < rows; i++) {
        tampung = cols[i];

        // bagian atas
//
        if (i != 0 && i < cols.length && cols[i] <= cols[i - 1]) {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i - 1]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");
          }
        } else {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");

          }
        }


        // Isi baris
        for (int j = 0; j < cols[i]; j++) {
          System.out.print("|   ");
        }
        System.out.println("|");

        // bagian bawah

        if (i < cols.length - 1 && cols[i] < cols[i + 1]) {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i + 1]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");
          }
        } else {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");

          }

        }
      }

      if (rows % 2 == 1) {
        // bagian atas
        for (int i = 0; i < cols[cols.length - 1]; i++) {
          System.out.print("+---");
        }
        System.out.println("+");

      }
    }
  }


  void pola43() {
    /*
    --------------------------
    POLA 43
    --------------------------
    4
    +---+---+---+---+
    |   |   |   |   |
    +---+---+---+---+
    |   |   |   |
    +---+---+---+
    |   |   |
    +---+---+
    |   |
    +---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 43");
    System.out.println("--------------------------");

    // Input jumlah kolom
    int cols = sc.nextInt();

    if (cols > 0) {
      // Garis Awal
      for (int j = 0; j < cols; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Loop untuk mencetak kotak
      for (int i = 0; i < cols; i++) {
        // Isi baris
        for (int j = 0; j < cols - i; j++) {
          System.out.print("|   ");
        }
        System.out.println("|");

        // Garis atas (sebelum isi)
        for (int j = 0; j < cols - i; j++) {
          System.out.print("+---");
        }
        System.out.println("+");
      }
      System.out.println();
    }
  }


  void pola44() {
    /*
    --------------------------
    POLA 44
    --------------------------
    3
            +---+
            |   |
        +---+---+
        |   |   |
    +---+---+---+
    |   |   |   |
    +---+---+---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 44");
    System.out.println("--------------------------");

    // Input jumlah baris (dan kolom maksimal)
    int n = sc.nextInt();

    if (n > 0){
      for (int i = 1; i <= n; i++) {
        int space = n - i;

        // Cetak spasi sebelum +---+
        for (int j = 0; j < space; j++) {
          System.out.print("    "); // 4 spasi per kolom
        }

        // Cetak garis atas +---+
        for (int j = 0; j < i; j++) {
          System.out.print("+---");
        }
        System.out.println("+");

        // Cetak spasi sebelum |   |
        for (int j = 0; j < space; j++) {
          System.out.print("    ");
        }

        // Cetak garis isi |   |
        for (int j = 0; j < i; j++) {
          System.out.print("|   ");
        }
        System.out.println("|");
      }

      // Cetak garis penutup paling bawah
      for (int j = 0; j < n; j++) {
        System.out.print("+---");
      }
      System.out.println("+");
      System.out.println();
    }
  }

  void pola45() {
    /*
    --------------------------
    POLA 45
    --------------------------
    4
    +---+---+---+---+
    |   |   |   |   |
    +---+---+---+---+
        |   |   |   |
        +---+---+---+
            |   |   |
            +---+---+
                |   |
                +---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 45");
    System.out.println("--------------------------");
    int rows = sc.nextInt();  // Jumlah baris

    if (rows > 0) {
      // Garis Awal
      for (int j = 0; j < rows; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Mencetak pola dengan jumlah kolom yang bertambah dan indentasi per baris
      for (int i = 0; i < rows; i++) {
        // Menentukan jumlah kolom pada baris ini
        int kolom = rows - i;

        // Memberikan indentasi untuk setiap baris setelah baris pertama
        for (int j = 1; j < i; j++) {
          System.out.print("    ");
        }

        // Mencetak baris atas dengan jumlah kolom yang sesuai

        if (i != 0) {
          for (int j = 0; j <= kolom; j++) {
            System.out.print("+---");
          }
          System.out.println("+");
        }

        // Memberikan indentasi untuk setiap baris setelah baris pertama
        for (int j = 0; j < i; j++) {
          System.out.print("    ");
        }

        // Mencetak baris isi kosong
        for (int j = 0; j < kolom; j++) {
          System.out.print("|   ");
        }
        System.out.println("|");
      }

      // Mencetak baris bawah terakhir dengan indentasi
      for (int i = 0; i < rows - 1; i++) {
        System.out.print("    ");
      }
      for (int i = 0; i < 1; i++) {
        System.out.print("+---");
      }
      System.out.println("+");
    }
  }


  void pola46() {
    /*
    --------------------------
    POLA 46
    --------------------------
    rows: 5
    10111
    010
    1001
    10
    100100

    +---+---+---+---+---+
    | x | o | x | x | x |
    +---+---+---+---+---+
    | o | x | o |
    +---+---+---+---+
    | x | o | o | x |
    +---+---+---+---+
    | x | o |
    +---+---+---+---+---+---+
    | x | o | o | x | o | o |
    +---+---+---+---+---+---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 46");
    System.out.println("--------------------------");

    // Input jumlah baris
    System.out.print("rows: ");
    int rows = sc.nextInt();

    String[] binner = new String[rows];


    if (rows > 0) {
      int[] cols = new int[rows];

      // input binner
      for (int i = 0; i < rows; i++) {
        binner[i] = sc.next();
      }

      // Input jumlah kolom tiap baris
      for (int i = 0; i < rows; i++) {
        cols[i] = binner[i].length();
      }

      // bagian atas
      for (int i = 0; i < cols[0]; i++) {
        System.out.print("+---");
      }
      System.out.println("+");

      int tampung = 0;
      // Loop per baris
      for (int i = 0; i < rows; i++) {
        tampung = cols[i];

        // bagian atas
        if (i != 0 && i < cols.length && cols[i] <= cols[i - 1]) {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i - 1]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");
          }
        } else {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");

          }
        }


        char[] s = binner[i].toCharArray();


        // isi
        for (int j = 0; j < s.length; j++) {
          char c = s[j];
          System.out.print("| ");
          if (c == '1') {
            System.out.print("x ");
          } else {
            System.out.print("o ");
          }
        }
        System.out.println("|");

        // bagian bawah

        if (i < cols.length - 1 && cols[i] < cols[i + 1]) {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i + 1]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");
          }
        } else {
          if (i % 2 == 1) {
            for (int j = 0; j < cols[i]; j++) {
              System.out.print("+---");
            }
            System.out.println("+");

          }

        }
      }

      if (rows % 2 == 1) {
        // bagian atas
        for (int i = 0; i < cols[cols.length - 1]; i++) {
          System.out.print("+---");
        }
        System.out.println("+");

      }
    }
  }


  void pola47() {
    /*
    --------------------------
    POLA 47
    --------------------------
    5
    +---+---+---+---+---+
    |                   |
    +                   +
    |                   |
    +                   +
    |                   |
    +                   +
    |                   |
    +                   +
    |                   |
    +---+---+---+---+---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 47");
    System.out.println("--------------------------");

    int n = sc.nextInt();

    if (n > 0) {

      int lebar = n * 4 - 1; // total spasi di tengah

      // Garis paling atas
      for (int i = 0; i < n; i++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Baris isi dan tengah
      for (int i = 0; i < n - 1; i++) {
        // Baris dengan |
        System.out.print("|");
        for (int j = 0; j < lebar; j++) {
          System.out.print(" ");
        }
        System.out.println("|");

        // Baris dengan +
        System.out.print("+");
        for (int j = 0; j < lebar; j++) {
          System.out.print(" ");
        }
        System.out.println("+");
      }

      // Baris terakhir dengan |
      System.out.print("|");
      for (int j = 0; j < lebar; j++) {
        System.out.print(" ");
      }
      System.out.println("|");

      // Garis paling bawah
      for (int i = 0; i < n; i++) {
        System.out.print("+---");
      }
      System.out.println("+");
    }
  }




  void pola48() {
    /*
    --------------------------
    POLA 48
    --------------------------
    3
    4
    +---+---+---+---+
    |               |
    +               +
    |               |
    +               +
    |               |
    +---+---+---+---+

     */
    System.out.println("--------------------------");
    System.out.println("POLA 48");
    System.out.println("--------------------------");

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    if( rows > 0 && cols > 0 ) {
      // Garis atas
      for (int i = 0; i < cols; i++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // Isi kotak
      for (int i = 0; i < rows; i++) {
        System.out.print("|");
        for (int j = 0; j < cols * 4 - 1; j++) {
          System.out.print(" ");
        }
        System.out.println("|");

        if (i < rows - 1) {
          System.out.print("+");
          for (int j = 0; j < cols * 4 - 1; j++) {
            System.out.print(" ");
          }
          System.out.println("+");
        }
      }

      // Garis bawah
      for (int i = 0; i < cols; i++) {
        System.out.print("+---");
      }
      System.out.println("+");
    }
  }


  void pola49() {
    /*
    --------------------------
    POLA 49
    --------------------------
    3
    4
    /\/\/\/\
    \/\/\/\/
    /\/\/\/\
    \/\/\/\/
    /\/\/\/\
    \/\/\/\/

     */
    System.out.println("--------------------------");
    System.out.println("POLA 49");
    System.out.println("--------------------------");

    int tinggi = sc.nextInt(); // misalnya 3

    int lebar = sc.nextInt(); // misalnya 4

    if (tinggi > 0 && lebar > 0) {
      for (int i = 0; i < tinggi; i++) {
        // Baris 1: /\
        for (int j = 0; j < lebar; j++) {
          System.out.print("/\\");
        }
        System.out.println();
        // Baris 2: \/
        for (int j = 0; j < lebar; j++) {
          System.out.print("\\/");
        }
        System.out.println();

      }
      System.out.println();
    }
  }

  void pola50() {
    /*
    --------------------------
    POLA 50
    --------------------------
    3
      /\
     /  \
    /    \
    \    /
     \  /
      \/

    1
    /\
    \/

    2
      /\
     /  \
     \  /
      \/

    7
          /\
         /  \
        /    \
       /      \
      /        \
     /          \
    /            \
    \            /
     \          /
      \        /
       \      /
        \    /
         \  /
          \/

     */
    System.out.println("--------------------------");
    System.out.println("POLA 50");
    System.out.println("--------------------------");
    // Minta input jumlah baris
    int n = sc.nextInt();

    // Mencetak pola segitiga
    if (n == 1) {
      System.out.println("/\\");
      System.out.println("\\/");
    } else if (n == 2) {
      System.out.println("  /\\");
      System.out.println(" /  \\");
      System.out.println(" \\  /");
      System.out.println("  \\/");
    } else if (n == 3) {
      System.out.println("  /\\");
      System.out.println(" /  \\");
      System.out.println("/    \\");
      System.out.println("\\    /");
      System.out.println(" \\  /");
      System.out.println("  \\/");
    } else {
      // Bagian atas: /
      for (int i = 0; i < n; i++) {
        // Spasi
        for (int j = 0; j < n - i - 1; j++) {
          System.out.print(" ");
        }
        // Kiri dan kanan garis
        System.out.print("/");
        for (int j = 0; j < i * 2; j++) {
          System.out.print(" ");
        }
        System.out.println("\\");
      }

      // Bagian bawah: \
      for (int i = n - 1; i >= 0; i--) {
        // Spasi
        for (int j = 0; j < n - i - 1; j++) {
          System.out.print(" ");
        }
        // Kiri dan kanan garis
        System.out.print("\\");
        for (int j = 0; j < i * 2; j++) {
          System.out.print(" ");
        }
        System.out.println("/");
      }
    }
    System.out.println();
  }

}













