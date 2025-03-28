package com.bridgelabz.ListInterface;

import java.util.*;

public class ReverseList {
    public static void reverseLinkedList(LinkedList<Integer> list){
        int start = 0;
        int end = list.size()-1;

        while (start < end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
    public static void reverseArrayList(ArrayList<Integer> arr){
        int n= arr.size();
        int start =0;
        int end = n-1;

        while (start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(10);
        arrList.add(1);
        arrList.add(15);
        arrList.add(12);

        reverseArrayList(arrList);
        System.out.println(arrList);

        LinkedList<Integer> linkList = new LinkedList<>(arrList);

        reverseLinkedList(linkList);
        System.out.println(linkList);


    }

}
