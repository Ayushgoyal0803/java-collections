package com.bridgelabz.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<String> myQueue = new LinkedList<>();
        LinkedList<String> myList = new LinkedList<>();
        System.out.print("Enter number till which you want binary number: ");
        int n = scn.nextInt();

        myQueue.add("1");

        for (int i=0;i<n;i++){
            String curr = myQueue.poll();
            myList.add(curr);

            myQueue.add(curr + "0");
            myQueue.add(curr + "1");
        }

        System.out.println(myList);

    }
}
