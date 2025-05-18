package test.TestStrukturData;

public class ContohVector {
  public static void main(String[] args) {
    MyVector<Integer> myVector = new MyVector();

    myVector.add(1);
    myVector.add(2);
    myVector.set(0,10);
    myVector.remove(1);
    myVector.clear();
    System.out.println(myVector.isEmpty());

    System.out.println(myVector);
  }
}
