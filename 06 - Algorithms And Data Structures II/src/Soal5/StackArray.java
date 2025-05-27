package Soal5;

class StackArray {
  private int top = -1;
  private int capacity = 10;
  private Object[] data = new Object[this.capacity];

  public StackArray(int capacity) {
    this.capacity = capacity;
  }

  public StackArray() {

  }

  public void push(Object item) {
    if (top == capacity - 1) {
      throw new RuntimeException("Stack penuh");
    }
    data[++top] = item;
  }

  public Object pop() {
    if (empty()) {
      throw new RuntimeException("Stack kosong");
    }
    return data[top--];
  }

  public Object peek() {
    if (empty()) {
      throw new RuntimeException("Stack kosong");
    }
    return data[top];
  }

  public boolean empty() {
    return top == -1;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = top; i >= 0; i--) {
      sb.append(data[i]);
      if (i != 0) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }
}
