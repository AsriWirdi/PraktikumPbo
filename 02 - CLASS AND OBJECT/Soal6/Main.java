package Soal6;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main f = new Main();

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan n: ");
    int n = sc.nextInt();

    if (n > 0) {
      for (int i = 1; i <= n; i++) {
        System.out.print(f.fibonacci(i) + " ");
      }
      System.out.println();

      System.out.println("Bilangan fibonacci ke-" + n + " adalah: " + f.fibonacci(n));
    }
  }

  public int fibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
