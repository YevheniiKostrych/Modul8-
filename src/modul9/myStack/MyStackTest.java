package modul9.myStack;

import modul9.myQueue.MyQueue;

public class MyStackTest {
  public static void main(String[] args) {
    MyStack<String> queue=new MyStack<>();

    queue.push("A");
    queue.push("B");
    queue.push("C");
    queue.push("D");
    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.pop());
    System.out.println(queue);
    System.out.println(queue.size());
    queue.remove(2);
    System.out.println(queue);
    System.out.println(queue.size());
}
}