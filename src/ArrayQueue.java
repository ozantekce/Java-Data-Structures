public class ArrayQueue<E> implements IQueue<E> {

    private E data[];
    private int CAPACITY;
    private final boolean FIXED_CAPACITY;

    private int headIndex;  // write here
    private int tailIndex;  // read here
    private int size = 0;

    public ArrayQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.FIXED_CAPACITY = true;
        headIndex = 0;
        tailIndex = 0;
        data = (E[]) new Object[this.CAPACITY];
    }

    public ArrayQueue() {
        this.CAPACITY = 10;
        this.FIXED_CAPACITY = false;
        headIndex = 0;
        tailIndex = 0;
        data = (E[]) new Object[this.CAPACITY];
    }

    public void enqueue(E e){
        if(size==CAPACITY){
            if(FIXED_CAPACITY)throw new RuntimeException("Queue is full");
            else grow(CAPACITY+1);
        }
        size++;
        int currentHeadIndex = headIndex;
        headIndex = normalizeIndex(headIndex+1);
        data[currentHeadIndex] = e;
    }

    public E dequeue(){
        if(size==0)throw new RuntimeException("Queue is empty");
        size--;
        int currentTailIndex = tailIndex;
        tailIndex = normalizeIndex(tailIndex+1);
        return data[currentTailIndex];
    }

    @Override
    public E peek() {if(isEmpty())return null; else return data[tailIndex];}

    public int size(){return size;}
    public boolean isEmpty(){return size==0;}

    private int normalizeIndex(int index){
        if(index>=0&&index<CAPACITY)return index;
        else return index%CAPACITY;
    }

    private void grow(int minCapacity) {
        int oldCapacity = data.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)newCapacity = minCapacity;

        E[] tempData = (E[]) new Object[newCapacity];
        int i = 0;
        while (!this.isEmpty())tempData[i++] = this.dequeue();
        data = tempData;

        tailIndex = 0;
        CAPACITY = newCapacity;
        headIndex = normalizeIndex(tailIndex+oldCapacity);
        size = oldCapacity;
    }


}
