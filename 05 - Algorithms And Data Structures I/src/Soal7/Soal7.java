package Soal7;

import java.util.HashSet;

public class Soal7 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();

    set.add("D0224325");
    set.add("D0224025");
    set.add("D0224022");
    set.add("D0224007");

    for (String s : set) {
      System.out.println(s);
    }
  }
}
