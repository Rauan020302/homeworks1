package com.company;

import java.util.AbstractList;
import java.util.NoSuchElementException;

public class MyLinkedList<T> extends AbstractList<T> {
    private MyNode<T> first;
    private MyNode<T> last;
    private MyNode<T> current;
    private Integer size;

    public void print(){
        current = first;
        while (current.hasNext()){
            System.out.println(current + " ");
            current = current.getNext();
        }
    }
    public int size(){
        size = 0;
        current = first;
        while (current.hasNext()){
            size++;
            current = current.getNext();
        }
        return size;
    }
    public T get (int index){
        current = first;
        while (current.hasNext()){
            if (current.getIndex().equals(index)) return current.getValue();
            current = current.getNext();
        }
        throw new IndexOutOfBoundsException();
    }


    public T getFirst(){
        final MyNode<T> node = first;
        if (node == null)
            throw new NoSuchElementException();
        return node.value;
    }
    public T getLast(){
        final MyNode<T> node = last;
        if (node == null)
            throw new NoSuchElementException();
        return node.value;
    }

    public void linkLast(T t){
        final MyNode<T> l = last;
        final MyNode<T> newNode = new MyNode<>(null,l,t);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;

    }
    public boolean add(T t){
        linkLast(t);
        return true;
    }
    public void add(int index,T elem){
        if (index == size){
            linkLast(elem);
        }else{
            throw new NoSuchElementException();
        }

    }



}

