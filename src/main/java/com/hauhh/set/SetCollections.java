package com.hauhh.set;

import java.util.*;
import java.util.stream.Stream;

public class SetCollections {
    /**
     * Java Set interface represents an unordered collection of unique elements
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //Add element to Set collection
        set.add("Item 1");
        set.add("Item 2");
        set.add("Item 3");
        set.add("Item 4");

        //Create Set using Set.of()
        Set<String> set2 = Set.of("Hello", "World");

        //How to iterate the Set
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        //For
        for (String value : set) {
            System.out.println(value);
        }

        //Java Stream API
        Stream<String> stream = set.stream();

        stream.forEach(System.out::println);

        //Remove the element
        boolean remove = set.remove("Item 3");
        boolean remove1 = set.remove("Iteam 4");


        //To clear all the element in the set
        set.clear();

        set.addAll(Set.of("1", "2", "3", "Item 3"));

        //Remove all element from the set
        set.removeAll(Set.of("1", "2", "3"));

        //Retain all element from the set
        set.retainAll(Set.of("1", "2", "3"));

        //Size of the set
        int size = set.size();

        //Check if the set is empty
        boolean empty = set.isEmpty();

        //To check if the element contains in the set
        boolean contains = set.contains("Item 1");

        //How to convert from Set to List
        List<String> list = new ArrayList<>();
        list.addAll(set);
    }
}
