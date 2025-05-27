package Soal7;

import java.util.ArrayList;

public class Graph {
  ArrayList<Node> nodeList;
  int[][] adjMatrix;

  public Graph(int size) {
    nodeList = new ArrayList<Node>();
    adjMatrix = new int[size][size];
  }

  public void addNode(Node node) {
    nodeList.add(node);
  }

  public void addEdge(int src, int dst) {
    adjMatrix[src][dst] = 1;
    adjMatrix[dst][src] = 1;
  }

//  public boolean checkEdge(int src, int dst) {
//    return adjMatrix[src][dst] == 1 || adjMatrix[dst][src] == 1;
//  }

  public void print() {
    System.out.print("    ");
    for (Node node : nodeList) {
      System.out.print(node.label + " ");
    }
    System.out.println("\n");

    for (int i = 0; i < adjMatrix.length; i++) {
      System.out.print(nodeList.get(i).label + "   ");
      for (int j = 0; j < adjMatrix[i].length; j++) {
        System.out.print(adjMatrix[i][j] + "  ");
      }
      System.out.println();
    }
  }
}
