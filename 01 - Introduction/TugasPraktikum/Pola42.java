import java.util.Scanner;

public class Pola42 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    pola47();
  }

  static void pola47(){
    System.out.print("Masukkan jumlah kolom: ");
    int n = sc.nextInt();

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

  static void pola46() {
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
    // Minta input jumlah baris
    System.out.print("rows: ");
    System.out.print("rows: ");
    int rows = sc.nextInt();
    sc.nextLine(); // consume newline

    String[] baris = new String[rows];

    // Input string per baris
    for (int i = 0; i < rows; i++) {
      baris[i] = sc.nextLine().trim(); // misalnya "10111"
    }

    // Proses setiap baris
    for (int i = 0; i < rows; i++) {
      String s = baris[i];
      int len = s.length();

      // bagian atas
      for (int j = 0; j < len; j++) {
        System.out.print("+---");
      }
      System.out.println("+");

      // isi
      for (int j = 0; j < len; j++) {
        char c = s.charAt(j);
        System.out.print("| ");
        if (c == '1') {
          System.out.print("x ");
        } else {
          System.out.print("o ");
        }
      }
      System.out.println("|");

      // bagian bawah
      for (int j = 0; j < len; j++) {
        System.out.print("+---");
      }
      System.out.println("+");
    }

    System.out.println();
  }

  public static void pola42() {
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
}



