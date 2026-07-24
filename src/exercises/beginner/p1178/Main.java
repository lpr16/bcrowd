package exercises.beginner.p1178;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double[] vet = new double[100];

        vet[0] = d;
        
        for (int i = 1; i < 100; i++) {
            vet[i] = vet[i - 1] / 2;        
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f%n", i, vet[i]);
        }

        sc.close();
    }
}
