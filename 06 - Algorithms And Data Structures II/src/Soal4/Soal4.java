package Soal4;

import java.util.Scanner;
import java.util.Stack;

public class Soal4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("masukkan String: ");
    String str = sc.nextLine();

    String[] hurufStr = str.split("");

    Stack<String> stack = new Stack<>();

    for(String s : hurufStr){
      stack.push(s);
    }

    for (int i = 0; i < hurufStr.length; i++) {
      System.out.print(stack.pop());
    }
  }
}
