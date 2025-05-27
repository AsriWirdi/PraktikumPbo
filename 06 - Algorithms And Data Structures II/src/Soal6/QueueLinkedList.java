package Soal6;

import java.util.LinkedList;

public class QueueLinkedList {
  private LinkedList<Object> data = new LinkedList<>();

  public void offer(Object value) {
    data.add(value);
  }

  public Object peek() {
    if (isEmpty()) {
      throw new RuntimeException("Queue kosong");
    }
    return data.get(0);
  }

  public Object poll() {
    if (isEmpty()) {
      throw new RuntimeException("Queue kosong");
    }
    return data.remove(0);
  }

  public boolean isEmpty() {
    return data.isEmpty();
  }

  @Override
  public String toString() {
    return data.toString();
  }
}
