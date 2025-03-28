package com.bridgelabz.ListInterface;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(20);
        newList.add(10);
        newList.add(20);
        newList.add(20);
        newList.add(30);
        newList.add(40);

        Set<Integer> newSet = new HashSet<>();

        for (int i=0;i<newList.size();i++ ){
            if(!newSet.contains(newList.get(i))){
                newSet.add(newList.get(i));
            }
            else{
                newList.remove(i);
                i--;
            }
        }

        System.out.println(newList);
    }
}
