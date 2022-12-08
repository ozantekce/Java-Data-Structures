public class CircularQueue<E> {

    private Node head;
    private Node tail;
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

    public void printer(){

        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    private static class Node<E> {

        private E data;
        private Node next;

        public Node(E e, Node next) {
            data = e;
            this.next = next;
        }

    }
}
