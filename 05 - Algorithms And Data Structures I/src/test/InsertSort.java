package test;

public class InsertSort {

  public static void main(String[] args) {
    int [] arr = {12,11,13,5,6};

    System.out.println("Array Before Insertion Sort : ");
    for (int num : arr){
      System.out.print(num + " ");
    }

    System.out.println();

    for (int i = 1; i < arr.length; i++){
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }

    System.out.println("Array After Insertion Sort : ");
    for (int num : arr){
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
