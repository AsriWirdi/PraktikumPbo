package Soal5;

public class Main {
  public static void main(String[] args) {

    // Array ====================================================
    System.out.println("Stack Array");
    StackArray stackArray = new StackArray();
    stackArray.push(5);
    stackArray.push(6);
    stackArray.push(7);

    System.out.println(stackArray.pop());
    System.out.println(stackArray.peek());
    ;
    System.out.println(stackArray.empty());
    System.out.println(stackArray);

    // Vector ===================================================
    System.out.println("\nStack Vector");
    StackVector stackVector = new StackVector();
    stackVector.push(5);
    stackVector.push(6);
    stackVector.push(7);

    System.out.println(stackVector.pop());
    System.out.println(stackVector.peek());

    System.out.println(stackVector.empty());
    System.out.println(stackVector);


    // ArrayList ==============================================
    System.out.println("\nStack ArrayList");
    StackArrayList stackArrayList = new StackArrayList();
    stackArrayList.push(5);
    stackArrayList.push(6);
    stackArrayList.push(7);

    System.out.println(stackArrayList.pop());
    System.out.println(stackArrayList.peek());

    System.out.println(stackArrayList.empty());
    System.out.println(stackArrayList);


    // LinkedList ==============================================
    System.out.println("\nStack LinkedList");
    StackLinkedList stackLinkedList = new StackLinkedList();
    stackLinkedList.push(5);
    stackLinkedList.push(6);
    stackLinkedList.push(7);

    System.out.println(stackLinkedList.pop());
    System.out.println(stackLinkedList.peek());

    System.out.println(stackLinkedList.empty());
    System.out.println(stackLinkedList);
  }
}
