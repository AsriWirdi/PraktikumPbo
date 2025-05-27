//package Soal11;
//
//import java.util.Scanner;
//
//public class Main {
//  public static void main(String[] args) {
//    Tree tree = new Tree(1); // root
//
//    Node node2 = new Node(2);
//    Node node3 = new Node(3);
//    Node node4 = new Node(4);
//    Node node5 = new Node(5);
//    Node node6 = new Node(6);
//
//    tree.addChildNode(tree.getRoot(), node2);
//    tree.addChildNode(tree.getRoot(), node3);
//    tree.addChildNode(node2, node4);
//    tree.addChildNode(node2, node5);
//    tree.addChildNode(node3, node6);
//
//    // Print tree
//    System.out.println("Struktur Tree:");
//    System.out.println(tree);
//
//    // Search test
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Masukkan nilai yang dicari : ");
//    int searchValue = sc.nextInt();
//
//    Node result = tree.search(searchValue);
//    if (result != null) {
//      System.out.println("\nNode dengan nilai " + searchValue + " ditemukan pada level " + result.getLevel());
//    } else {
//      System.out.println("\nNode dengan nilai " + searchValue + " tidak ditemukan");
//    }
//
//  }
//}
