package Soal6;

public class QueueArray {
  private Object[] data = new Object[10];
  private int front = 0;
  private int rear = 0;

  public QueueArray(int capacity) {
    data = new Object[capacity];
  }

  public QueueArray() {
  }

  public void offer(Object value) {
    if (rear == data.length) {
      throw new RuntimeException("Queue penuh");
    }
    data[rear] = value;
    rear++;
  }

  public Object peek() {
    if (isEmpty()) {
      throw new RuntimeException("Queue kosong");
    }
    return data[front];
  }

  public Object poll() {
    if (isEmpty()) {
      throw new RuntimeException("Queue kosong");
    }
    Object value = data[front];
    front++;
    return value;
  }

  public boolean isEmpty() {
    return front == rear;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = front; i < rear; i++) {
      sb.append(data[i]);
      if (i < rear - 1) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }
}
