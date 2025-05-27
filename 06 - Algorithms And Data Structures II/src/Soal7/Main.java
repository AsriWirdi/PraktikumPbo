package Soal7;

public class Main {
  public static void main(String[] args) {
    Graph graph = new Graph(12);
    graph.addNode(new Node("V0"));
    graph.addNode(new Node("V1"));
    graph.addNode(new Node("V2"));
    graph.addNode(new Node("V3"));
    graph.addNode(new Node("V4"));
    graph.addNode(new Node("V5"));
    graph.addNode(new Node("V6"));
    graph.addNode(new Node("V7"));
    graph.addNode(new Node("V8"));
    graph.addNode(new Node("V9"));
    graph.addNode(new Node("V10"));
    graph.addNode(new Node("V11"));

    graph.addEdge(0, 1);
    graph.addEdge(0, 4);

    graph.addEdge(1, 2);
    graph.addEdge(1, 5);

    graph.addEdge(2, 3);
    graph.addEdge(2, 6);

    graph.addEdge(3, 7);

    graph.addEdge(4, 5);
    graph.addEdge(4, 8);

    graph.addEdge(5, 6);
    graph.addEdge(5, 9);

    graph.addEdge(6, 7);
    graph.addEdge(6, 10);

    graph.addEdge(7, 11);

    graph.addEdge(8, 9);

    graph.addEdge(9, 10);

    graph.addEdge(10, 11);

    graph.print();
  }
}