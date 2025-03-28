package com.bridgelabz.ListInterface;

import java.util.*;

public class NthElement {
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(10);
        newList.add(20);
        newList.add(10);
        newList.add(20);
        newList.add(20);
        newList.add(30);
        newList.add(40);

        int pos = 2;
        ListIterator<Integer> first = newList.listIterator();
        ListIterator<Integer> second = newList.listIterator();

        for(int i=0;i<pos;i++){
            if(!first.hasNext()){
                System.out.println("Position is greater than size.");
                return;
            }
            first.next();
        }

        while (first.hasNext()){
            first.next();
            second.next();
        }

        Integer ele = second.next();
        System.out.println(ele);
    }
}
