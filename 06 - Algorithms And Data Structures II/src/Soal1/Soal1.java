package Soal1;

import java.util.LinkedList;

public class Soal1 {
  public static void main(String[] args) {

    LinkedList<Double> list = new LinkedList<>();

    double[] data = {
            91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
            27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768
    };

    for(double d : data){
      list.add(d);
    }

    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    double sum = 0;
    double average = 0;
    double jumlahData = 0;


    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < min) {
        min = list.get(i);
      } else if (list.get(i) > max) {
        max = list.get(i);
      }

      System.out.print(list.get(i) + " ");

      sum += list.get(i);
      jumlahData++;

    }
    average += sum / jumlahData;


    System.out.printf("\nMin : %.2f\n", min);
    System.out.printf("Max : %.2f\n", max);
    System.out.printf("Sum : %.2f\n", sum);
    System.out.printf("Average : %.2f\n", average);

  }
}