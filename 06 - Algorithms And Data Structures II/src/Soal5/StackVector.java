package Soal5;

import java.util.Vector;

public class StackVector {
  private Vector<Object> stack = new Vector<>();

  public void push(Object o) {
    stack.add(o);
  }

  public Object pop() {
    if (empty()) {
      throw new RuntimeException("Stack kosong");
    }
    return stack.remove(stack.size() - 1);
  }

  public Object peek() {
    if (empty()) {
      throw new RuntimeException("Stack kosong");
    }
    return stack.get(stack.size() - 1);
  }

  public boolean empty() {
    return stack.isEmpty();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    if (stack.isEmpty()) {
      return sb.append("]").toString();
    }
    for (int i = stack.size() - 1; i >= 0; i--) {
      sb.append(stack.get(i));
      if (i != 0) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }
}
