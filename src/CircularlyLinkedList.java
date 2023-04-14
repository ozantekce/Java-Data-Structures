public class CircularlyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size=0;

    public void addFirst(E data){
        Node<E> temp = new Node(data, head);
        if(head==null)tail=temp;
        head=temp;
        size++;
    }

    public void addLast(E data){
        Node<E> temp = new Node(data, head);
        if(tail==null){
            tail=temp;
            head=tail;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    public void shiftLeft() {
        if(head!=null){
            head = head.next;
            tail = tail.next;
        }
    }
    public void shiftRight(){
        if(head!=null){
            //head = head.next;
            //tail = tail.next;
            Node temp = head;
            while (temp.next!=tail) {
                temp = temp.next;
            }
            head = tail;
            tail = temp;
        }
    }

    public void removeFirst(){
        if(size==0)return;
        tail.next = head.next;
        head=head.next;
        size--;
    }

    public void removeLast(){
        if(size==0)return;
        Node temp = head;
        while (temp.next!=tail) {
            temp = temp.next;
        }
        temp.next=head;
        tail=temp;
        size--;
    }

    public E get(int i){

        Node<E> temp=head;

        for (int j = 0; j < i; j++) {
            temp=temp.next;
        }

        return temp.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){return size==0;}

    public E getFirst() {
        return head.data;
    }

    public E getLast() {
        return tail.data;
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
        int i =1;
        while (i<size){
            stringBuilder.append(", "+current.data);
            current = current.next;
            i++;
        }
        stringBuilder.append("]");
        return  stringBuilder.toString();
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
