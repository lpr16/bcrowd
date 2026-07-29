package exercises.beginner.p1189;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char operation = scanner.next().charAt(0);
        double[][] M = new double[12][12];
        double sum = 0.0;
        int count = 0;
        
        // Read the matrix elements
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
                
                // Check if element is in the Left Area
                if (j < i && j < 11 - i) {
                    sum += M[i][j];
                    count++;
                }
            }
        }
        
        // Calculate average if requested
        if (operation == 'M') {
            sum /= count; // count will be 30
        }
        
        // Print result rounded to 1 decimal place
        System.out.printf("%.1f%n", sum);
        
        scanner.close();
    }
}
