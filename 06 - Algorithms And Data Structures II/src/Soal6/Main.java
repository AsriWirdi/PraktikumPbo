package Soal6;

public class Main {
  public static void main(String[] args) {
    // Array ====================================================
    System.out.println("Queue Array");
    QueueArray queueArray = new QueueArray(10);
    queueArray.offer(5);
    queueArray.offer(6);
    queueArray.offer(7);

    System.out.println(queueArray.poll());
    System.out.println(queueArray.peek());
    ;
    System.out.println(queueArray.isEmpty());
    System.out.println(queueArray);

    // Vector ===================================================
    System.out.println("\nQueue Vector");
    QueueVector queueVector = new QueueVector();
    queueVector.offer(5);
    queueVector.offer(6);
    queueVector.offer(7);

    System.out.println(queueVector.poll());
    System.out.println(queueVector.peek());

    System.out.println(queueVector.isEmpty());
    System.out.println(queueVector);


    // ArrayList ==============================================
    System.out.println("\nQueue ArrayList");
    QueueArrayList queueArrayList = new QueueArrayList();
    queueArrayList.offer(5);
    queueArrayList.offer(6);
    queueArrayList.offer(7);

    System.out.println(queueArrayList.poll());
    System.out.println(queueArrayList.peek());

    System.out.println(queueArrayList.isEmpty());
    System.out.println(queueArrayList);


    // LinkedList ==============================================
    System.out.println("\nQueue LinkedList");
    QueueLinkedList queueLinkedList = new QueueLinkedList();
    queueLinkedList.offer(5);
    queueLinkedList.offer(6);
    queueLinkedList.offer(7);

    System.out.println(queueLinkedList.poll());
    System.out.println(queueLinkedList.peek());

    System.out.println(queueLinkedList.isEmpty());
    System.out.println(queueLinkedList);
  }
}
