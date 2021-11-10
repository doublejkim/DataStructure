package run.main;

import ds.queue.MyQueue;

public class QueueMain {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.enQueue(3);
        queue.enQueue(10);
        queue.enQueue(12);

        Integer a = queue.deQueue();
        System.out.println("a : " + a);

        a = queue.deQueue();
        System.out.println("a : " + a);

        /*
        a = queue.deQueue();
        System.out.println("a : " + a);

        a = queue.deQueue();
        System.out.println("a : " + a);

         */

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

    }
}
