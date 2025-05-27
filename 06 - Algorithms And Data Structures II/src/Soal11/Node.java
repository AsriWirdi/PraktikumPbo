package Soal11;

import java.util.ArrayList;

public class Node {
  private int data;
  private int level = 0;
  private ArrayList<Node> children= new ArrayList<>();

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void addChild(Node child) {
    child.setLevel(this.level + 1);
    this.children.add(child);
  }

  public ArrayList<Node> getChildren() {
    return children;
  }

  @Override
  public String toString() {
    return toString("", true);
  }

  public String toString(String prefix, boolean isTail) {
    StringBuilder sb = new StringBuilder();
    sb.append(prefix).append(isTail ? "└── " : "├── ").append(data).append("\n");
    for (int i = 0; i < children.size(); i++) {
      boolean isLast = (i == children.size() - 1);
      sb.append(children.get(i).toString(prefix + (isTail ? "    " : "│   "), isLast));
    }
    return sb.toString();
  }


}
