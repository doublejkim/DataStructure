package run.main;

import ds.linkedlist.SingleLinkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        SingleLinkedList<Integer> list = new SingleLinkedList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(10);


        /*System.out.println("-----------------------------");
        list.printAll();

        list.insert(3, 7);

        System.out.println("-----------------------------");
        list.printAll();

        Integer result = list.get(-1);
        System.out.println("result : " + result);*/

        boolean bResult = list.delete(0);
        System.out.println("-----------------------------");
        list.printAll();
        System.out.println("delete result : " + bResult + ", size after delete : " + list.size());

    }
}
