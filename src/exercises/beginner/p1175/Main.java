package exercises.beginner.p1175;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[20];
        int[] vet2 = new int[20];

        for (int i = 0; i < 20; i++) {
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            vet2[i] = vet[19 - i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + vet2[i]);
        }

        sc.close();
    }
}
