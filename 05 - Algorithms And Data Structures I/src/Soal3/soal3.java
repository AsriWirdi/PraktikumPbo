package Soal3;

import java.util.*;

public class soal3 {
  public static void main(String[] args) {

    Vector<Double> data = new Vector();

    double[] dataList = {
            91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
            27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768
    };

    for (double d : dataList) {
      data.add(d);
    }

    double sum = 0;
    double average = 0;
    double jumlahData = 0;

    Collections.sort(data);
    double min = data.get(0);
    double max = data.get(data.size() - 1);

    for (int i = 0; i < data.size(); i++) {
      sum += data.get(i);
      jumlahData++;
      System.out.println(data.get(i));
    }
    System.out.println();

    average = sum / jumlahData;

    System.out.printf("Min : %.2f\n", min); // Min : 0,21
    System.out.printf("Max : %.2f\n", max); // Max : 7102,40
    System.out.printf("Sum : %.2f\n", sum); // Sum : 15247,92
    System.out.printf("Average : %.2f\n", average); // Average : 508,26


  }
}
