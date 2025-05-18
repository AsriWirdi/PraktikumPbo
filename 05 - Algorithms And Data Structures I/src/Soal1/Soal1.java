package Soal1;

public class Soal1 {
  public static void main(String[] args) {

    double[][] data = {
            {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
            {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
            {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}
    };

    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    double sum = 0;
    double average = 0;
    double jumlahData = 0;


    int i = 0;
    while (i < data.length) {
      int j = 0;
      while (j < data[i].length) {
        if (data[i][j] < min) {
          min = data[i][j];
        } else if (data[i][j] > max) {
          max = data[i][j];
        }

        System.out.println(data[i][j] + " ");
        jumlahData++;
        sum += data[i][j];
        j++;
      }
      i++;
    }

//    for (int i = 0; i < data.length; i++) {
//      for (int j = 0; j < data[i].length; j++) {
//        if (data[i][j] < min) {
//          min = data[i][j];
//        } else if (data[i][j] > max) {
//          max = data[i][j];
//        }
//
//        System.out.print(data[i][j] + " ");
//
//        sum += data[i][j];
//        jumlahData++;
//      }
//      System.out.println();
//    }
    average += sum / jumlahData;


    System.out.printf("\nMin : %.2f\n", min);
    System.out.printf("Max : %.2f\n", max);
    System.out.printf("Sum : %.2f\n", sum);
    System.out.printf("Average : %.2f\n", average);

  }
}
