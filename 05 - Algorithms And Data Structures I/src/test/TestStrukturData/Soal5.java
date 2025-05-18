package test.TestStrukturData;

public class Soal5 {
  public static void main(String[] args) {
    MyList<Integer> data = new MyList<>();
    data.add(0);
    data.add(1);
    data.add(2);
    data.clear();
    data.remove(1);
//    System.out.println(data.isEmpty());

    System.out.println(data);
    System.out.println(data.size());

  }

}
