package Soal9;

import java.util.ArrayList;
import java.util.Iterator;

public class Soal9 {
  public static void main(String[] args) {
    ArrayList<Double> data = new ArrayList<>();

    double[] dataList = {
            91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
            27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768
    };

    for (double d : dataList) {
      data.add(d);
    }

    Iterator<Double> itrData = data.iterator();

    while (itrData.hasNext()) {
      System.out.println(itrData.next());
    }
  }
}
