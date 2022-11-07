package com.syntax.class24;

import java.util.ArrayList;

public class HomeWork {
    /*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {


        ArrayList<String> name = new ArrayList<>();
        name.add("Adrian");
        name.add("Silvia");
        name.add("Alexandru");
        name.add("Vladimir");
        name.add("Lia");
        name.add("Oxana");

        System.out.println("Is ArrayList is empty? "+name.isEmpty());
        System.out.println("Is the name Lia is present in the ArrayList? "+name.contains("Lia"));
        System.out.println("The size of my ArrayList is "+name.size());
        System.out.println("All the names of my ArrayList are "+name);
        System.out.println(name.add("Radu"));
        System.out.println("My new ArrayList with one more name "+name);
        System.out.println(name.get(5));
        System.out.println(name.clone());



    }
}