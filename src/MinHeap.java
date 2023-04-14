public class MinHeap {

    private int [] heap;
    private final int CAPACITY;
    private int size;

    public MinHeap(int capacity) {
        this.CAPACITY = capacity;
        heap = new int[capacity];
    }

    public void insert(int val){

        if(size<CAPACITY){
            heap[size] = val;
            int current = size;
            size++;

            while (heap[current] < heap[getParentIndex(current)]) {
                swap(heap,current,getParentIndex(current));
                current = getParentIndex(current);
            }
        }else{
            throw new RuntimeException("Heap is full");
        }
    }

    public int remove(){

        if(size!=0){
            size--;
            return extractMin(heap,size);
        }else{
            throw new RuntimeException("Heap is empty");
        }

    }

    private int extractMin(int[] heap, int n) {

        int min = heap[0];
        heap[0] = heap[n];
        n = n-1;
        heapify(heap,0,n);
        return min;
    }

    private void heapify(int[] heap, int i, int n) {

        int smallest = i;

        if(getLeftChildIndex(i) <= n && heap[getLeftChildIndex(i)]<heap[smallest]){
            smallest = getLeftChildIndex(i);
        }

        if(getRightChildIndex(i)  <= n && heap[getRightChildIndex(i)]<heap[smallest]){
            smallest = getRightChildIndex(i) ;
        }

        if(smallest!=i){
            swap(heap,i,smallest);
            heapify(heap,smallest,n);
        }

    }

    private int getLeftChildIndex(int index){return  index*2+1;}
    private int getRightChildIndex(int index){return  index*2+2;}
    private int getParentIndex(int index){return (int) ((index/2.0)-0.5);}

    private void swap(int heap[], int i1 , int i2){
        int holder = heap[i1];
        heap[i1] = heap[i2];
        heap[i2] = holder;
    }

    public boolean isEmpty(){return size==0;}

    public void printer(){

        for(int i=0;i<size;i++){
            for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<10;j++){
                System.out.print(heap[j+(int)Math.pow(2,i)-1]+" ");

            }
            System.out.println();
        }

    }

}
