package com.bridgelabz.SetInterface;

import  java.util.*;

public class EqualSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(5);

        System.out.println("Is both sets are equal? :  " + set1.equals(set2));
    }

}
