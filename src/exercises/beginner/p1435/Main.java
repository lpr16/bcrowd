package exercises.beginner.p1435;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    int d1 = i;
                    int d2 = j;
                    int d3 = n - 1 - i;
                    int d4 = n - 1 - j;

                    int value = Math.min(Math.min(d1, d2), Math.min(d3, d4)) + 1;

                    out.append(String.format("%3d", value));
                    if (j < n - 1) out.append(" ");
                }
                out.append("\n");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}
