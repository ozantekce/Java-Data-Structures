public class LinkedList<E> {

    private Node<E> tail;
    private Node<E> head;

    private int size;

    public void addLast(E data){

        if(tail ==null){
            tail = new Node(data,null);
            head = tail;
            size++;
        }else{
            tail.next = new Node(data,null);
            tail = tail.next;
            size++;
        }

    }

    public void addFirst(E data){

        if(head == null){
            head = new Node(data,null);
            tail = head;
            size++;
        }else{
            head = new Node(data, head);
            size++;
        }

    }

    public E removeLast(){
        if(tail ==null)
            return null;
        E rtn = tail.data;
        Node current = head;
        while (current.next != tail){
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
        return rtn;
    }

    public E removeFirst(){
        if(head == null)
            return null;
        E rtn = head.data;
        head = head.next;
        size--;
        return rtn;
    }

    public boolean isEmpty(){return size==0;}
    public int size(){return size;}


    private StringBuilder stringBuilder = new StringBuilder();
    @Override
    public String toString() {
        stringBuilder.setLength(0);

        if(isEmpty())return "[]";
        stringBuilder.append("[");

        Node current = head;
        stringBuilder.append(head.data);
        current = current.next;
        while (current!=null){
            stringBuilder.append(", "+current.data);
            current = current.next;
        }
        stringBuilder.append("]");
        return  stringBuilder.toString();
    }


    private static class Node<E> {

        private E data;
        private Node<E> next;

        public Node(E e, Node<E> next) {
            data = e;
            this.next = next;
        }

    }

}
