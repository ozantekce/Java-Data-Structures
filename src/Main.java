public class Main {


    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(90);
        queue.enqueue(80);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("----------------------------------------------------------------");
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(90);
        stack.push(80);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("----------------------------------------------------------------");
        ArrayStack<Integer> arrayStack = new ArrayStack<>(99);

        arrayStack.push(10);
        arrayStack.push(15);
        arrayStack.push(20);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        arrayStack.push(90);
        arrayStack.push(80);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());




        System.out.println("----------------------------------------------------------------");
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(10);
        linkedList.printer();
        linkedList.addLast(20);
        linkedList.printer();
        linkedList.addLast(30);
        linkedList.printer();
        linkedList.addFirst(40);
        linkedList.printer();
        linkedList.addFirst(50);
        linkedList.printer();
        linkedList.removeLast();
        linkedList.printer();
        linkedList.removeLast();
        linkedList.printer();
        linkedList.removeFirst();
        linkedList.printer();
        linkedList.removeFirst();
        linkedList.printer();


        System.out.println("----------------------------------------------------------------");
        CircularlyLinkedList<Integer> circularlyLinkedList = new CircularlyLinkedList<>();

        circularlyLinkedList.addLast(10);
        circularlyLinkedList.printer();
        circularlyLinkedList.addLast(20);
        circularlyLinkedList.printer();
        circularlyLinkedList.addLast(30);
        circularlyLinkedList.printer();
        circularlyLinkedList.addFirst(40);
        circularlyLinkedList.printer();
        circularlyLinkedList.addFirst(50);
        circularlyLinkedList.printer();
        circularlyLinkedList.removeLast();
        circularlyLinkedList.printer();
        circularlyLinkedList.removeLast();
        circularlyLinkedList.printer();
        circularlyLinkedList.removeFirst();
        circularlyLinkedList.printer();
        circularlyLinkedList.removeFirst();
        circularlyLinkedList.printer();
        for (int i = 0; i < 10; i++) {
            circularlyLinkedList.addLast(i);
        }
        circularlyLinkedList.printer();
        circularlyLinkedList.shift();
        circularlyLinkedList.printer();
        circularlyLinkedList.shift();
        circularlyLinkedList.printer();

    }

}
