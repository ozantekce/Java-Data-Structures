public class CircularlyLinkedList<E> {

    private Node head = null;
    private Node tail = null;
    private int size=0;

    public void addFirst(E data){
        Node temp = new Node(data, head);
        if(head==null)tail=temp;
        head=temp;
        size++;
    }

    public void addLast(E data){
        Node temp = new Node(data, head);
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

    public void shift() {

        if(head!=null){
            head = head.next;
            tail = tail.next;
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


    public E getData(int i){

        Node temp=head;

        for (int j = 0; j < i; j++) {
            temp=temp.next;
        }

        return (E)temp.data;
    }

    public int getSize() {
        return size;
    }

    public E getFirst() {
        return (E)head.data;
    }

    public E getLast() {
        return (E)tail.data;
    }


    public void printer(){

        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    private static class Node<E> {

        private E data;
        private CircularlyLinkedList.Node next;

        public Node(E e, CircularlyLinkedList.Node next) {
            data = e;
            this.next = next;
        }

    }

}
