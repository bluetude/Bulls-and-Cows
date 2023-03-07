import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int seed = A;
        int minimumValue = K;
        for (int i = A; i < B + 1; i++) {
            Random random = new Random(i);
            int maximumValue = 0;
            for (int j = 0; j < N; j++) {
                int value = random.nextInt(K);
                if (value > maximumValue) maximumValue = value;
            }
            if (minimumValue > maximumValue) {
                minimumValue = maximumValue;
                seed = i;
            }
        }
        System.out.println(seed);
        System.out.println(minimumValue);
    }
}