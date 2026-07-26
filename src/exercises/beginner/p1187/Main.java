import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char operation = scanner.next().charAt(0);
        double[][] M = new double[12][12];

        // Reading the matrix elements
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }

        double sum = 0.0;
        int count = 0;

        // Sum elements strictly inside the top region
        for (int i = 0; i <= 4; i++) {
            for (int j = i + 1; j <= 10 - i; j++) {
                sum += M[i][j];
                count++;
            }
        }

        // Print output formatted to 1 decimal place
        if (operation == 'S') {
            System.out.printf("%.1f%n", sum);
        } else if (operation == 'M') {
            System.out.printf("%.1f%n", sum / count);
        }

        scanner.close();
    }
}