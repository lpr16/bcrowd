package exercises.beginner.p1190;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the operation ('S' or 'M')
        char O = sc.next().toUpperCase().charAt(0);

        double[][] M = new double[12][12];
        double sum = 0.0;
        int count = 0;

        // Read matrix elements and accumulate sum for the right area
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                M[row][col] = sc.nextDouble();

                // Condition for elements in the right area
                if (col > row && col > (11 - row)) {
                    sum += M[row][col];
                    count++;
                }
            }
        }

        // Output calculation
        if (O == 'M') {
            sum /= count; // average over 30 elements
        }

        // Print with exactly 1 decimal place
        System.out.printf("%.1f\n", sum);

        sc.close();
    }
}
