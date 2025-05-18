package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorTest {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");

    ListIterator<String> itrList = list.listIterator();

    while (itrList.hasNext()) {
      String element = itrList.next();
      System.out.println(element);
      if (element.equals("C")) {
//      itrList.set("C update");
        itrList.remove();
      }
    }

    while (itrList.hasPrevious()) {
      System.out.println(itrList.previous());
    }
  }
}
