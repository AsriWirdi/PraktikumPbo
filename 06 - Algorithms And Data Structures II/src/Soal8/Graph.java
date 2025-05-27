package Soal8;

import java.util.ArrayList;

public class Graph {
  ArrayList<Node> nodeList = new ArrayList<>();
  int[][] adjMatrix;

  public Graph(int size) {
    adjMatrix = new int[size][size];
  }

  public void addNode(Node node) {
    nodeList.add(node);
  }

  public void addEdge(int src, int dst, int weight) {
    adjMatrix[src][dst] = weight;  // Hanya satu arah (directed)
  }

//  public boolean checkEdge(int src, int dst) {
//    return adjMatrix[src][dst] != 0;
//  }

  public void print() {
    System.out.print("    ");
    for (Node node : nodeList) {
      System.out.print(node.label + " ");
    }
    System.out.println();

    for (int i = 0; i < adjMatrix.length; i++) {
      System.out.print(nodeList.get(i).label + "   ");
      for (int j = 0; j < adjMatrix[i].length; j++) {
        System.out.print(adjMatrix[i][j] + "  ");
      }
      System.out.println();
    }
  }
}
