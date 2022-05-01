package com.example.domain.data_structures.linkedlist;

public class SinglyLinkedList<T> {
    private Node head;

    private static class Node<T> {
        private Node next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public void append(T data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    private Node tail() {
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }


    private Node reverseRecursively(Node node) {

        Node newHead;

        if ((node.next == null)) {
            return node;
        }
        newHead = reverseRecursively(node.next);

        return newHead;
    }

    public void reverseIteratively() {
        Node current = head;
        Node previous = null;
        Node forward = null;

        while (current.next != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        head = current;
        head.next = previous;
    }

}


