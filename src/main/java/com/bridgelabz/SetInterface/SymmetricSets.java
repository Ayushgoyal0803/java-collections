package com.bridgelabz.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricSets {
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
        Set<Integer> symmetricSet = new HashSet<>(set1);
        symmetricSet.addAll(set2);

        // Intersection: Keep only common elements
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        symmetricSet.removeAll(intersectionSet);

        System.out.println("Symmetric : " + symmetricSet);
    }
}
