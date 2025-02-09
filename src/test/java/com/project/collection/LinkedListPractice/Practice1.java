package com.project.collection.LinkedListPractice;

import java.util.LinkedList;

public class Practice1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("coffee");
        list.add("water");
        list.add("sugar");

        System.out.println(list.contains("coffee"));
        System.out.println(list.size());

        list.removeLast();

        list.forEach(x-> System.out.println(x + "->"));
        //method reference
        //list.forEach(System.out::println);

        //item at middle index
        System.out.println(list.get(list.size() / 2));
    }
}
