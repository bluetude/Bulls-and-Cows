import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int desks = firstGroup / 2 + firstGroup % 2;
        desks += secondGroup / 2 + secondGroup % 2;
        desks += thirdGroup / 2 + thirdGroup % 2;
        System.out.println(desks);
    }
}