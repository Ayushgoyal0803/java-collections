package com.bridgelabz.QueueInterface;

import java.util.*;

class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q1.offer(x);
    }

    // Removes and returns the top element of the stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Move elements from q1 to q2 except the last one
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Last element in q1 is the top element of stack
        int topElement = q1.poll();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Get the top element without removing it
    public int top() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Move elements from q1 to q2 except the last one
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Last element in q1 is the top element of stack
        int topElement = q1.poll();
        q2.offer(topElement); // Reinsert it into q2

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.top()); // Output: 2
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
    }
}
