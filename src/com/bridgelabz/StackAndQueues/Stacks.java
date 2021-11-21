package com.bridgelabz.StackAndQueues;

public class Stacks {
    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println("Element Push: " + top.data);
    }

    public int peak() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return top.data;
    }

    public int pop() {
        int poped;

        if (isEmpty()) {
            System.out.println("Empty Stack.");
            return -1;
        }
        poped = top.data;
        top = top.next;

        return poped;
    }

    public int size(){
        int count = 0;
        Node temp = top;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }


}