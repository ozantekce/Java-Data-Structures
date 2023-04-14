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
        if (numMoved > 0)System.arraycopy(array, index+1, array, index, numMoved);
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

    private StringBuilder stringBuilder = new StringBuilder();
    @Override
    public String toString() {
        stringBuilder.setLength(0);
        if(isEmpty())return "[]";
        stringBuilder.append("[");
        stringBuilder.append(array[0]);
        for (int i = 1; i < size; i++) {
            stringBuilder.append(", "+array[i]);
        }
        stringBuilder.append("]");
        return  stringBuilder.toString();
    }


}
