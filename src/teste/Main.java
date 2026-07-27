package teste;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        byte b = 121;
        int i = 0;
        double d = 3.14;
        char c = 'A';
        boolean bool = true;

        String s = "Hello";
        String s2 = new String("World");

        System.out.println(s + " " + s2 + "!");

        List<Integer> numbers = Arrays.asList(12, 2, 13, 4, 15, 6);

        numbers.sort((i1, i2) -> !i1.equals(i2) ? 0 : i2 - i1);

        System.out.println(numbers);
    }
}
