import java.util.Arrays;

public class ArrayList<E> {

    private E[] array;
    private int size = 0;

    public ArrayList(){
        array = (E[]) new Object[10];
    }
    public ArrayList(int capacity){
        array = (E[]) new Object[capacity];
    }

    public void add(E e){
        if(size<array.length){
            array[size++] = e;
        }else{
            grow(array.length+1);
            array[size++] = e;
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        array = Arrays.copyOf(array, newCapacity);
    }

    public E get(int index){if(index>=size)return null; else return array[index];}

    public int indexOf(E e){
        for (int i = 0; i < size; i++) {if(array[i].equals(e))return i;}
        return -1;
    }

    public E remove(int index){
        if(index>=size||index<0)return null;
        E e = array[index];
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(array, index+1, array, index,
                    numMoved);
        array[--size] = null;
        return e;
    }

    public boolean remove(E e){ int index = indexOf(e); remove(index); return index!=-1;}

    public boolean isEmpty(){return size==0;}

    public void clear(){size = 0;}

    public boolean contains(E e){
        for (int i = 0; i < size(); i++) {
            if(array[i].equals(e))return true;
        }
        return false;
    }

    public int size(){return size;}

    @Override
    public String toString() {
        return  Arrays.toString(array) ;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(9);
        System.out.println(Arrays.toString(arrayList.array));
        System.out.println(arrayList.get(0));
        arrayList.remove(0);
        System.out.println(Arrays.toString(arrayList.array));
        System.out.println(arrayList.get(0));
        arrayList.remove(0);
        System.out.println(Arrays.toString(arrayList.array));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isEmpty());
        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }
        arrayList.remove(20);
        arrayList.remove(19);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.contains(30));
        System.out.println(arrayList.contains(15));
        arrayList.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


}
