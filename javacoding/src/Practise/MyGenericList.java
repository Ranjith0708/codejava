package Practise;

import java.util.Iterator;

public class MyGenericList<T> implements Iterable<T> {
    private T[] elements;
    private int size;
    public MyGenericList(){
        this.size=0;
        this.elements=(T[])new Object[100];
    }
    public int getSize(){
        return this.size;
    }

    public boolean add(T element) throws IndexOutOfBoundsException{
        if(this.elements.length>size){
            this.elements[size]=element;
            this.size++;
            return true;
        }
        return false;
    }

    public T get(int index){
        if(index>size-1){
            throw new IndexOutOfBoundsException("Index value is more than actual size of "+size);
        }
        return this.elements[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new MyGenericListIterator(this);
    }

    private class MyGenericListIterator implements Iterator<T>{
        private MyGenericList<T> myGenericList;
        private int index;

        public MyGenericListIterator(MyGenericList<T> list){
            this.myGenericList= list;
        }

        @Override
        public boolean hasNext() {
            return index<myGenericList.getSize();
        }

        @Override
        public T next() {
            T element = myGenericList.get(index);
            index++;
            return element;
        }
    }
}
