package week3.myList;

import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int size = 0;
    private static int defaultCapacity = 10;
    private int capacity;

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size >= capacity) {
            resize();
        }
        array[size++] = data;
    }

    public void resize() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
           newArray[i] = array[i];
        }
        array = newArray;
    }

    public MyList() {
        this.capacity= defaultCapacity;
        this.array = (T[]) new Object[defaultCapacity];
    }

    public MyList(int capacity) {
        this.capacity=capacity;
        this.array = (T[]) new Object[capacity];
    }

    public T get(int index) {
        return array[index];
    }

    public void remove(int index) {
        for (int i = index; i < size-1; i++) {
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
    }

    public void set(int index, T data) {
        array[index] = data;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size -1 ; i >= 0; i--) {
            if (array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;
        // Arrays.copyOf(array,size);
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i]= null;
        }
        size=0;
    }

    public MyList<T> subList(int start,int finish) {
        MyList<T> result = new MyList<>(finish-start);
        for (int i = start; i < finish; i++) {
            result.add(array[i]);
        }
        return result;
    }

    public boolean contains(T data){
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
