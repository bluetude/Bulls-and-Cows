import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        StringBuilder upper = new StringBuilder();
        upper.append(message);
        for (int i = 0; i < upper.length(); i += 2) {
            upper.setCharAt(i, Character.toUpperCase(upper.charAt(i)));
        }
        return upper.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}