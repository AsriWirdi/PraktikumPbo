package test.LatihanIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Soal2 {
  public static void main(String[] args) {
    ArrayList<Integer> genap = new ArrayList<>();
    genap.add(2);
    genap.add(4);
    genap.add(6);

    ListIterator<Integer> iterator = genap.listIterator();
    while (iterator.hasNext()) {
      int element = iterator.next();
      if(element == 4){
        iterator.set(5);
      } else if(element == 6){
        iterator.add(8);
      }
    }

    System.out.println(genap);
  }
}
