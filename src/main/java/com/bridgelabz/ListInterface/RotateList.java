package com.bridgelabz.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class RotateList{
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(20);
        newList.add(25);
        newList.add(30);
        newList.add(40);
        int position = 2;
        reverseList(newList,0,position-1);
        reverseList(newList,position,newList.size()-1);
        reverseList(newList,0,newList.size()-1);

        System.out.println(newList);
    }

    public static void reverseList(ArrayList<Integer> arr, int start, int end){
        while (start < end ){
            int temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
