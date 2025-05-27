package Soal11;

public class TreeTest {
  private Node root;

  public TreeTest(Node rootData) {
    this.root = rootData;
  }

  public Node getRoot() {
    return root;
  }

  public void addChildNode(Node parent, Node child) {
    parent.addChild(child);
  }

  public Node search(int value) {
    return searchRecursive(root, value);
  }

  private Node searchRecursive(Node current, int value) {
    if (current.getData() == value) {
      return current;
    }

    Node found = searchRecursive(current, value);
    for (Node child : current.getChildren()) {
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return root.toString();
  }

}
