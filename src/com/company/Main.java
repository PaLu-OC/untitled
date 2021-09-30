package com.company;

public class Main {

    public static void main(String[] args) {
        String text = (args.length > 0 ? " " + String.join(" ", args) : "");
        System.out.println("Hello" + text);
    }
}
