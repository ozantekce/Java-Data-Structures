public class Stack<E> {

    private Node top;
    private int size;


    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return top==null;
    }


    public void push(E e){
        if(isEmpty()){
            Node temp = new Node(null, e);
            top = temp;
        }
        else{
            Node temp = new Node(top, e);
            top = temp;
        }
        size++;
    }

    public E top(){
        if(isEmpty())return null;
        return (E)top.getData();
    }

    public E pop(){
        if(isEmpty()){
            return null;
        }
        Node temp = top;
        top = top.next;
        size--;
        return (E)temp.getData();

    }


    private static class Node<E>{

        private Node next;
        private E data;

        public Node(Node next, E data) {
            this.next = next;
            this.data = data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }



    }

}
