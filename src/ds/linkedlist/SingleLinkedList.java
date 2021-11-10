package ds.linkedlist;

public class SingleLinkedList<T> {

    class Node<T> {

        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> head = null;

    int size = 0;

    public void add(T data) {

        if(head==null) {
            head = new Node<T>(data);
            size++;

        } else {

            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
            size++;
        }

    }

    public void insert(Integer pos, T data) {

        if(pos > size) {
            System.out.println("Can't insert data. List size : " + size);
        } else if(pos == size){
            System.out.println("You should addNode() if you want add data last. List size : " + size);
        } else {

            if(pos == 0) {
                Node<T> tmp = new Node<T>(data);
                tmp.next = this.head;
                this.head = tmp;
            } else {

                Node<T> node = this.head;

                int cnt = 0;

                while(node.next != null) {

                    if(cnt+1==pos) {

                        Node<T> tmp = new Node<T>(data);
                        tmp.next = node.next;
                        node.next = tmp;

                        break;
                    }

                    cnt++;
                    node = node.next;

                }
            }
        }
    }

    public T get(int pos) {
        if(this.head == null) {
            return null;
        } else {

            if(pos >= size) {
                System.out.println("Can't get the data. list size : " + size);
                return null;
            }

            Node<T> node = this.head;
            int cnt = 0;

            do{
                if(cnt == pos) {
                    return node.data;
                }

                cnt++;
                node = node.next;

            }while(node != null);

            System.out.println("Can't find the data");
            return null;

        }
    }

    public boolean delete(int pos) {

        if(this.head == null) {
            return false;
        } else {

            if(pos >= size) {
                System.out.println("Can't delete the data. list size : " + size);
                return false;
            }


            Node<T> node = this.head;
            int cnt = 0;

            if(pos == 0) {
                this.head = node.next;
                return true;
            }

            do{
                if(cnt+1 == pos) {

                    //Node<T> tmp = node.next;
                    node.next = node.next.next;

                    return true;
                }

                cnt++;
                node = node.next;

            }while(node != null);

            System.out.println("Can't find the data");
            return false;

        }
    }

    public int size() {
        return this.size;
    }


    public void printAll() {
        if(head != null) {

            Node<T> node = this.head;
            System.out.println(node.data);

            while(node.next != null) {

                node = node.next;
                System.out.println(node.data);
            }
        }
    }

}
