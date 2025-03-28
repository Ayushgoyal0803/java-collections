package com.bridgelabz.SetInterface;

import java.util.*;

public class SortedList {
    public static void main(String[] args) {
        Set<Integer> newSet = new HashSet<>();
        newSet.add(5);
        newSet.add(10);
        newSet.add(1);
        newSet.add(3);
        newSet.add(6);

        List<Integer> newList = new ArrayList<>(newSet);

        Collections.sort(newList);

        System.out.println(newList);
    }
}
