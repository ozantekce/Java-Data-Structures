public class Queue <E>{

    private Node last;
    private Node first;
    private int size=0;

    public void enqueue(E e){

        if(size==0){
            last= new Node(null,null, e);
            first = last;
            size++;
            return;
        }

        Node temp = new Node(null,last, e);
        last.prev = temp;
        last = temp;
        size++;
    }

    public E dequeue(){

        E e = (E)first.data;
        first = first.prev;
        size--;
        return e;
    }


    private static class Node<E>{
        private Node prev;
        private Node next;
        private E data;

        public Node(Node prev,Node next, E data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }

    }


}
