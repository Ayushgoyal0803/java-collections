package com.bridgelabz.QueueInterface;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        System.out.println(myQueue);

        Stack<Integer> myStack = new Stack<>();

        while (!myQueue.isEmpty()){
            myStack.add(myQueue.poll());
        }

        while (!myStack.isEmpty()){
            myQueue.add(myStack.pop());
        }

        System.out.println(myQueue);



    }
}
