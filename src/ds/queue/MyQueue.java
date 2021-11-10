package ds.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {

    List<T> list = new ArrayList<>();

    public void enQueue(T data) {

        list.add(data);

    }

    public T deQueue() {

        if(list.size()==0) {
            return null;
        }

        T result = list.get(0);

        list.remove(0);

        return result;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}
