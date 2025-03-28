package com.bridgelabz.SetInterface;
import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Union: Combine both sets
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Intersection: Keep only common elements
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
