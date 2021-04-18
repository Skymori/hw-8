package task1;


import java.util.Arrays;
import java.util.Objects;

public class NewArrayList <E>{
    private static final int DEFAULT_CAPACITY = 13;
    private E[] elementData;
    private int size;
//create Constructor
    public NewArrayList() {
        this.elementData = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
//create method add element on ArrayList
    public boolean add(E value){
        if(size == elementData.length){
            resize();
        }
        elementData[size] = value;
        size++;
        return true;
    }
//Method cheng size ArrayList
    private void resize(){
        elementData = (E[]) Arrays.copyOf(elementData, (size * 3/2+1));
    }
//Method chang element by index
    public E remove(int index){
        Objects.checkIndex(index, size);
        E element = get(index);
        elementData[index] = null;
        for (int i = 0; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        return element;
    }
//Method clear all element ArrayList
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }
//Method return size ArrayList
    public int size(){
        return size;
    }
//Method return element by index
    public E get(int index){
        Objects.checkIndex(index,size);
        return elementData[index];
    }

    @Override
    public String toString() {
        return "NewArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}
