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

    }

}
