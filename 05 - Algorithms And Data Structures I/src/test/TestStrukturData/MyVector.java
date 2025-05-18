package test.TestStrukturData;

public class MyVector <E>{
  private Object[] data;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  public MyVector(){
    data = new Object[DEFAULT_CAPACITY];
    size = 0;
  }

  private void cekKapasitas(){
    if(size == data.length){
      Object[] dataBaru = new Object[size * 2];
      System.arraycopy(data, 0 , dataBaru, 0, size);
      data = dataBaru;
    }
  }

  private void cekIndex(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
  }

  public synchronized void add(E e){
    cekKapasitas();
    data[size++] = e;
  }

  public synchronized E get(int index){
    cekIndex(index);
    return (E) data[index];
  }

  public synchronized int size(){
    return size;
  }

  public synchronized  void set(int index, E e){
    cekIndex(index);
    data[index] = e;
  }

  public synchronized  void clear(){
    for(int i = 0; i < size; i++){
      data[i] = null;
    }
    size = 0;
  }

  public synchronized  boolean isEmpty(){
    return size == 0;
  }



  public synchronized void remove(int index){
    cekIndex(index);
    for(int i = index; i < size - 1; i++){
      data[i] = data[i+1];
    }
    data[--size] = null;
  }

  @Override
  public synchronized String toString(){
    if(size == 0){
      return "[]";
    }
    StringBuilder sb = new StringBuilder("[");
    for(int i = 0; i < size; i++){
      sb.append(data[i]);
      if(i < size - 1){
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

}
