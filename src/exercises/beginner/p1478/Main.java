package exercises.beginner.p1478;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);
            if (N == 0) break;

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int value = Math.abs(i - j) + 1;

                    // manual 3‑width formatting
                    if (value < 10) sb.append("  ").append(value);
                    else if (value < 100) sb.append(" ").append(value);
                    else sb.append(value);

                    if (j < N - 1) sb.append(" ");
                }
                sb.append("\n");
            }

            sb.append("\n");
            System.out.print(sb);
        }
    }
}

