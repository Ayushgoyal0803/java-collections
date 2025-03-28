package com.bridgelabz.MapInterface;

import java.util.*;

public class MergeMaps {
    public static Map<String, Integer> mergeTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1); // Copy map1

        // Merge map2 into result
        map2.forEach((key, value) -> result.merge(key, value, Integer::sum));

        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = mergeTwoMaps(map1, map2);
        System.out.println(mergedMap);
    }
}

