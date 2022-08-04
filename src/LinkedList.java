public class LinkedList<E> {

    private LinkedList.Node first;
    private LinkedList.Node last;

    private int size;

    public void addFirst(E data){

        if(first==null){
            first = new Node(data,null);
            last = first;
            size++;
        }else{
            first.next = new Node(data,null);
            first = first.next;
            size++;
        }

    }

    public void addLast(E data){

        if(last==null){
            last = new Node(data,null);
            first = last;
            size++;
        }else{
            last = new Node(data,last);
            size++;
        }

    }

    public E removeFirst(){

        if(first==null)
            return null;
        E rtn = (E)first.data;
        Node current = last;
        while (current.next !=first){
            current = current.next;
        }
        first = current;
        first.next = null;
        size--;
        return rtn;
    }

    public E removeLast(){

        if(last==null)
            return null;
        E rtn = (E)last.data;
        Node current = last.next;
        last = current;
        size--;
        return rtn;
    }


    public void printer(){

        Node current = last;
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
