package Soal5;

public class AsriList<E> {

    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public AsriList() {
      data = new Object[DEFAULT_CAPACITY];
      size = 0;
    }

    public void add(E e) {
      cekCapacity();
      data[size++] = e;
    }

    public E get(int index) {
      checkIndex(index);
      return (E) data[index];
    }

    public E remove(int index) {
      checkIndex(index);
      E removed = (E) data[index];
      for (int i = index; i < size - 1; i++) {
        data[i] = data[i + 1];
      }
      data[--size] = null; // Bersihkan sisa referensi
      return removed;
    }

    public E set(int index, E element) {
      checkIndex(index);
      E old = (E) data[index];
      data[index] = element;
      return old;
    }

    public void clear() {
      for (int i = 0; i < size; i++) {
        data[i] = null;
      }
      size = 0;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public int size() {
      return size;
    }

    private void cekCapacity() {
      if (size == data.length) {
        int newCapacity = data.length * 2;
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
      }
    }

    private void checkIndex(int index) {
      if (index < 0 || index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public String toString() {
      if (size == 0) return "[]";
      StringBuilder sb = new StringBuilder("[");
      for (int i = 0; i < size; i++) {
        sb.append(data[i]);
        if (i < size - 1) sb.append(", ");
      }
      sb.append("]");
      return sb.toString();
    }
  }

