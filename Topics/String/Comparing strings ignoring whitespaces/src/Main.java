import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        first = first.replaceAll("\\s", "");
        second = second.replaceAll("\\s", "");

        System.out.println(first.equals(second));
    }
}