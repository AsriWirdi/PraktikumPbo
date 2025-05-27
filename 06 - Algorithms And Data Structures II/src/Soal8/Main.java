package Soal8;

public class Main {
  public static void main(String[] args) {
    Graph graph = new Graph(7);
    graph.addNode(new Node("V0"));
    graph.addNode(new Node("V1"));
    graph.addNode(new Node("V2"));
    graph.addNode(new Node("V3"));
    graph.addNode(new Node("V4"));
    graph.addNode(new Node("V5"));
    graph.addNode(new Node("V6"));



    graph.addEdge(0, 1,12);
    graph.addEdge(0, 3,8);
    graph.addEdge(0, 6,5);

    graph.addEdge(1, 2,16);
    graph.addEdge(1, 5,5);

    graph.addEdge(2, 4,4);

    graph.addEdge(3, 1,3);

    graph.addEdge(4, 1,6);
    graph.addEdge(4, 5,2);

    graph.addEdge(5, 0,16);

    graph.addEdge(6, 5,7);

    graph.print();
  }
}