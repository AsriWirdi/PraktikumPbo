package Soal10;

public class Soal10 {
  public static void main(String[] args) {
    double[] dataList = {
            91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11,
            27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768
    };

    bubbleSort(dataList);

//    for( double d : dataList ){
//      System.out.println(d);
//    }
//    System.out.println();

    // tampilkan nilai 5 terbesar
    for(int i = dataList.length-5; i < dataList.length; i++){
      System.out.println(dataList[i]);
    }
  }

  public static void bubbleSort(double[] arr) {
    int n = arr.length;
    boolean swapped;

    // lakukan iterasi sebanyak n-1 kali
    for (int i = 0; i < n; i++) {
      swapped = false;
      // melakukan perbandingan dan penukaran elemen berdekatan
      for (int j = 0; j < n - i - 1; j++) {
        if(arr[j] > arr[j + 1]){
          // menukar elemen jika urutannya salah
          double temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j+1] = temp;

          swapped = true;
        }
      }

      // jika tidak ada elemen yang ditukar, maka array sudah terurut
      if(!swapped) break;
    }
  }
}
