public class CircularQueue<E> implements IQueue<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void enqueue(E e) {

        Node temp = new Node(e, head);

        if(head==null){
            head = temp;
            tail = temp;
            head.next = tail;
            size++;
            return;
        }
        tail.next = temp;
        tail = tail.next;
        tail.next = head;
        size++;

    }

    public E dequeue() {

        E e = (E) head.data;
        head = head.next;
        tail.next = head;
        size--;
        return e;
    }

    public E peek(){
        return (E)head.data;
    }

    public void shift() {

        if(head!=null){
            head = head.next;
            tail = tail.next;
        }

    }


    private StringBuilder stringBuilder = new StringBuilder();
    @Override
    public String toString() {
        stringBuilder.setLength(0);

        if(isEmpty())return "[]";
        stringBuilder.append("[");

        Node current = head;
        stringBuilder.append(head.data);
        current = current.next;
        int i = 1;
        while (i<size){
            stringBuilder.append(", "+current.data);
            current = current.next;
            i++;
        }
        stringBuilder.append("]");
        return  stringBuilder.toString();
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    private static class Node<E> {

        private E data;
        private Node<E> next;

        public Node(E e, Node next) {
            data = e;
            this.next = next;
        }

    }
}
