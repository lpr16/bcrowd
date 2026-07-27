package workshop.ch2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        LinkedList<String> colors = new LinkedList<>();
        // add elements and insert at the beginning
        colors.add("red");
        colors.add(0,"green");
        colors.add(2, "blue");

        System.out.println(colors);
    }
}
