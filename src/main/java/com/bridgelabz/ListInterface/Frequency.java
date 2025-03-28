package com.bridgelabz.ListInterface;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("kiwi");
        list.add("banana");

        Map<String,Integer> newMap = new HashMap<>();

        for(int i=0;i<list.size();i++){
            newMap.put(list.get(i),newMap.getOrDefault(list.get(i),0)+1);
        }

        System.out.println(newMap);
    }
}
