package task4;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class NewStack<S> {
    private S[] elementsData;
    private int size;
    private static final int DEFAULT_CAPACITY = 14;

    public NewStack() {
        this.elementsData = (S[]) new Object[DEFAULT_CAPACITY];
    }
    public void push(S value){
        if (size == elementsData.length){
            resize();
        }
        elementsData[size] = value;
        size++;
    }
    public S remove(int index){
        Objects.checkIndex(index,size);
        S element = get(index);
        elementsData[index] = null;

        if (size >= 0) System.arraycopy(elementsData, 1, elementsData, 0, size);
        size--;
        return element;
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            elementsData[i] = null;
        }
        size = 0;
    }
    public int size(){
        return size;
    }
    public S peek(){
        if (size == 0) throw new EmptyStackException();
        return get(size-1);
    }
    public S pop(){
        if (size == 0) throw new EmptyStackException();
        return remove(size-1);
    }
    private void resize(){
        elementsData = Arrays.copyOf(elementsData,(size*3/2+1));
    }
    private S get(int index){
        Objects.checkIndex(index,size);
        return elementsData[index];
    }

    @Override
    public String toString() {
        return "NewStack{" +
                "elementsData=" + Arrays.toString(Arrays.copyOf(elementsData, size)) +
                ", size=" + size +
                '}';
    }
}
