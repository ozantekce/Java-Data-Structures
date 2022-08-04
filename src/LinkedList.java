public class LinkedList<E> {

    private LinkedList.Node tail;
    private LinkedList.Node head;

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

        if(head ==null){
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
        E rtn = (E) tail.data;
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

        if(head ==null)
            return null;
        E rtn = (E) head.data;
        Node current = head.next;
        head = current;
        size--;
        return rtn;
    }


    public void printer(){

        Node current = head;
        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();

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
