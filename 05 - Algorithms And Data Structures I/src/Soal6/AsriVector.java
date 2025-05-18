package Soal6;

public class AsriVector<E> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public AsriVector() {
      data = new Object[DEFAULT_CAPACITY];
      size = 0;
    }

    // Menambahkan elemen ke akhir
    public synchronized void add(E e) {
      cekCapacity();
      data[size++] = e;
    }

    // Mengambil elemen berdasarkan index
    public synchronized E get(int index) {
      checkIndex(index);
      return (E) data[index];
    }

    // Menghapus elemen berdasarkan index
    public synchronized E remove(int index) {
      checkIndex(index);
      E removed = (E) data[index];
      for (int i = index; i < size - 1; i++) {
        data[i] = data[i + 1];
      }
      data[--size] = null;
      return removed;
    }

    // Mengganti elemen di index tertentu
    public synchronized E set(int index, E element) {
      checkIndex(index);
      E old = (E) data[index];
      data[index] = element;
      return old;
    }

    // Menghapus semua elemen
    public synchronized void clear() {
      for (int i = 0; i < size; i++) {
        data[i] = null;
      }
      size = 0;
    }

    // Cek apakah kosong
    public synchronized boolean isEmpty() {
      return size == 0;
    }

    // Mendapatkan jumlah elemen
    public synchronized int size() {
      return size;
    }

    // Representasi string dari data
    @Override
    public synchronized String toString() {
      if (size == 0) return "[]";
      StringBuilder sb = new StringBuilder("[");
      for (int i = 0; i < size; i++) {
        sb.append(data[i]);
        if (i < size - 1) sb.append(", ");
      }
      sb.append("]");
      return sb.toString();
    }

    // Memastikan kapasitas cukup
    private void cekCapacity() {
      if (size == data.length) {
        int newCapacity = data.length * 2;
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
      }
    }

    // Mengecek validitas index
    private void checkIndex(int index) {
      if (index < 0 || index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

}
