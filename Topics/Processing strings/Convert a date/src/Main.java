import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] parts = date.split("-");
        System.out.println(parts[1] + "/" + parts[2] + "/" + parts[0]);
    }
}