public class Stack<E> implements IStack<E> {

    private Node<E> top;
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
        return top.getData();
    }

    public E pop(){
        if(isEmpty()){
            return null;
        }
        Node<E> temp = top;
        top = top.next;
        size--;
        return temp.getData();
    }


    private static class Node<E>{

        private Node<E> next;
        private E data;

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }



    }

}
