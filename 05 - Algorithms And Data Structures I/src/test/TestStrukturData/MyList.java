package test.TestStrukturData;

public class MyList<E> {
  private Object[] data;
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;

  public MyList() {
    data = new Object[DEFAULT_CAPACITY];
    size = 0;
  }

  private void cekKapasitas() {
    if (size == data.length) {
      Object[] dataBaru = new Object[data.length * 2];
      System.arraycopy(data, 0, dataBaru, 0, size);
      data = dataBaru;
    }
  }

  private void cekIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
    }
  }

  public E get(int index) {
    cekIndex(index);
    return (E) data[index];
  }


  public void add(E e) {
    // cek Kapasitas
    cekKapasitas();
    data[size++] = e;
  }

  public void set(int index, E e) {
    cekIndex(index);
    data[index] = e;
  }


  public void remove(int index) {
    cekIndex(index);
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i + 1];
    }
    data[--size] = null;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    for (int i = 0; i < size; i++) {
      data[i] = null;
    }
    size = 0;
  }

  @Override
  public String toString() {
    if (size == 0)
      return "[]";

    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
      sb.append(data[i]);
      if (i < size - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }


}
