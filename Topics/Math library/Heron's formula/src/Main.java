import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double p = 1.0 * (a + b + c) / 2;
        System.out.println(Math.sqrt((p * (p - a) * (p - b) * (p - c))));
    }
}