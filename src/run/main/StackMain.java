package run.main;

import ds.stack.MyStack;

public class StackMain {

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);

        Integer a = stack.put();

        System.out.println("-----------------------");
        System.out.println("a : " + a);
        System.out.println("size : " + stack.size());
        System.out.println("isEmpty : " + stack.isEmpty());

        stack.push(30);

        System.out.println("-----------------------");
        System.out.println("size : " + stack.size());
        System.out.println("isEmpty : " + stack.isEmpty());

        a = stack.put();
        System.out.println("-----------------------");
        System.out.println("a : " + a);

        a = stack.put();
        System.out.println("-----------------------");
        System.out.println("a : " + a);

        a = stack.put();
        System.out.println("-----------------------");
        System.out.println("a : " + a);
        System.out.println("size : " + stack.size());
        System.out.println("isEmpty : " + stack.isEmpty());





    }

}
