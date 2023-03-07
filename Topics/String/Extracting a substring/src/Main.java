import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int beginning = scanner.nextInt();
        int end = scanner.nextInt() + 1;

        System.out.println(word.substring(beginning, end));
    }
}