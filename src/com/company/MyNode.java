package com.company;

public class MyNode<T> {
    public MyNode<T> next;
    public MyNode<T> prev;
    public T value;
    private Integer index;

    public MyNode(MyNode<T> next, MyNode<T> prev, T value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public boolean hasNext(){
        return next != null;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public MyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyNode<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
