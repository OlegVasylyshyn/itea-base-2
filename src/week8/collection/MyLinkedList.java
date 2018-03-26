package week8.collection;

import java.util.List;

public class MyLinkedList<T>  {

    private Node<T> head;
    private Node<T> tail;

    private int size;


    public void add(T value) {
        size++;

        if(head == null) {
            head = new Node<>(value, null, null);
            tail = head;
            return;
        }

        Node<T> newNode = new Node<>(value, tail, null);
        tail.tail = newNode;
        tail = newNode;
    }

    // O(n)
    // in array it will be O(1)
    public T get(int index) {
        Node<T> tmp = head;
        if(tmp == null) return null;

        int i = 0;
        while (tmp != null) {
            if(i == index) return tmp.value;
            i++;
            tmp = tmp.tail;
        }
        return null;
    }

    public boolean remove(int index){
        return false;
    }

    public boolean remove(T value) {
        return false;
    }

    public int size(){
        return size;
    }

    private String getStringR(Node head){
        return
        head != null ? head.value + "," + getStringR(head.tail) : "";
    }

    private String getString(Node head){
        if(head == null) return "";

        StringBuilder sb = new StringBuilder();
        while (head.tail != null) {
            sb.append(head.value).append(",");
            head = head.tail;
        }
        return sb.toString();
    }

    public String toString(){
        return getStringR(head);
    }







    static class Node<T> {

        T value;
        Node<T> head;
        Node<T> tail;

        Node(T value, Node<T> head, Node<T> tail) {
            this.value = value;
            this.head = head;
            this.tail = tail;
        }
    }

}
