package com.evan.springboot.study.jdk7hashmap;

public class Node {
    private Object item;
    private Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public static void main(String[] args) {
        Node header = new Node(new Object(), null);
        header = new Node(new Object(), header);
    }
}
