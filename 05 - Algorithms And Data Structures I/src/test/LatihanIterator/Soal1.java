package test.LatihanIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Soal1 {
  public static void main(String[] args) {
    ArrayList<String> buah = new ArrayList<>();
    buah.add("Apel");
    buah.add("Durian");
    buah.add("Mangga");

    Iterator<String> iterator = buah.iterator();
    while (iterator.hasNext()) {
      if(iterator.next().equals("Durian")){
        iterator.remove();
      }
    }

    System.out.println(buah);
  }
}
