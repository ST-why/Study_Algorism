package com.mc.algorism.sec04.list;

public class Node<E> {

    private E data;
    private Node<E> next;

    public Node(E data) {
        this.data = data;
    }

    public Node(){};

    public Node<E> next() {
        return next;
    }

    public void next(Node<E> next) {
        this.next = next;
    }

    public void data(E data) {
        this.data = data;
    }

    public E data() {
        return this.data;
    }

    @Override
    public String toString() {
        return data.toString();
    }


}
