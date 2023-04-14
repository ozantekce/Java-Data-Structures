public class Main {


    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println(queue.dequeue());    //20
        System.out.println(queue.dequeue());    //15
        queue.enqueue(90);
        queue.enqueue(80);
        System.out.println(queue.dequeue());    //10
        System.out.println(queue.dequeue());    //90
        System.out.println(queue.dequeue());    //80

        System.out.println("----------------------------------------------------------------");
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println(stack.pop());    //20
        System.out.println(stack.pop());    //15
        stack.push(90);
        stack.push(80);
        System.out.println(stack.pop());    //80
        System.out.println(stack.pop());    //90
        System.out.println(stack.pop());    //10

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
        System.out.println(linkedList);
        linkedList.addLast(20);
        System.out.println(linkedList);
        linkedList.addLast(30);
        System.out.println(linkedList);
        linkedList.addFirst(40);
        System.out.println(linkedList);
        linkedList.addFirst(50);
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);


        System.out.println("----------------------------------------------------------------");
        CircularlyLinkedList<Integer> circularlyLinkedList = new CircularlyLinkedList<>();

        circularlyLinkedList.addLast(10);
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.addLast(20);
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.addLast(30);
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.addFirst(40);
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.addFirst(50);
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.removeLast();
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.removeLast();
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.removeFirst();
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.removeFirst();
        System.out.println(circularlyLinkedList);
        for (int i = 0; i < 10; i++) {
            circularlyLinkedList.addLast(i);
        }
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.shiftLeft();
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.shiftLeft();
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.shiftRight();
        System.out.println(circularlyLinkedList);
        circularlyLinkedList.shiftRight();
        System.out.println(circularlyLinkedList);

/*
        BinarySearchTree binaryTree = new BinarySearchTree();
        for (int i = 0; i < 16; i++) {
            binaryTree.add((int) (Math.random()*16));
        }
        binaryTree.printBinaryTree();
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < 16; i++) {
            binaryTree.remove(i);
        }
        binaryTree.printBinaryTree();*/
    }

}
