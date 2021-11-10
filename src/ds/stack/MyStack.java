package ds.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

    List<T> list = new ArrayList<>();
    int top = -1;

    // put
    public void push(T data) {

        list.add(data);
        top++;
    }

    // push
    public T put() {

        if(list.isEmpty()) {
            return null;
        }

        T result = list.get(top);
        list.remove(top);
        top--;

        return result;
    }

    // size
    public int size() {
        return list.size();
    }

    // isEmpty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
