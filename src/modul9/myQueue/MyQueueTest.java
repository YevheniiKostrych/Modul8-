package modul9.myQueue;

import java.util.Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue=new MyQueue<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue);
    }
}
