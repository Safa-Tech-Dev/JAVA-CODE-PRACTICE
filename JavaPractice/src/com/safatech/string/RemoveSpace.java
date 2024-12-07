package com.safatech.string;

/*
Write a program to remove all space from string
*/
public class RemoveSpace {

    public static void main(String[] args) {

        String input = "Onespace twospace threespace fourspace";
        String removedSpace = input.replaceAll("\\s", "");
        System.out.println(removedSpace);
    }
}
