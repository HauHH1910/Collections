package com.hauhh.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Add object to the list
        list.add("Object 1");
        list.add("Object 2");
        list.add("Object 3");
        list.add("Object 4");
        list.add("Object 5");

        //Remove can be use index or object
        list.remove(2);

        list.remove("Object 2");

        //Access the element in the list
        String firstObject = list.get(0);

        //To get the size of the list
        int size = list.size();


        //How to iterate the list
        //The old way: Iterator

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

            Object next = iterator.next();

            System.out.println(next.toString());
        }

        //The second way: For-loop
        for (Object next : list) {
            System.out.println(next.toString());
        }

        //The last way: standard for-loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Empty the list3
        list.clear();
    }
}
