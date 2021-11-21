package com.bridgelabz.StackAndQueues;

public class Main {

    public static void main(String[] args) {
        System.out.println("STACK AND QUEUES DEMONSTRATION");

        Stacks stack = new Stacks();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.display();

        System.out.println(stack.peak());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();

    }
}
