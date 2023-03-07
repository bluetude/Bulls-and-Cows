package bullscows;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = new String();
        while (true) {
            System.out.println("Please, enter the secret code's length:");
            System.out.print("> ");
            String input = scanner.nextLine();
            if (secretCodeLength(input) == 0) {
                break;
            }
            int codeLength = secretCodeLength(input);
            System.out.println("Input the number of possible symbols in the code:");
            System.out.print("> ");
            input = scanner.nextLine();
            if (possibleSymbols(input, codeLength) == 0) {
                break;
            }
            int symbols = possibleSymbols(input, codeLength);
            System.out.println("Okay, let's start a game!");
            number = randomNumberGenerator(codeLength, symbols);
            //System.out.println(number);
            int turn = 1;
            while(true) {
                System.out.println("Turn " + turn + ":");
                System.out.print("> ");
                input = scanner.next();
                if (Grader(number, input)) {
                    System.out.println("Congratulations! You guessed the secret code.");
                    break;
                }
                turn++;
            }
            break;
        }

    }

    public static boolean Grader(String number, String input) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < number.length(); i++) {
            if (input.charAt(i) == number.charAt(i)) {
                bulls++;
            } else if (number.contains(input.substring(i, i+1))) {
                cows++;
            }
        }
        if (cows == 0 && bulls == 0) {
            System.out.println("Grade: None.");
        } else {
            System.out.println("Grade: " + bulls + " " + (bulls == 1 ? "bull" : "bulls") +
                    " and " + cows + " " + (cows == 1 ? "cow" : "cows") + ".");
        }
        return bulls == number.length();
    }

    public static String randomNumberGenerator(int codeLength, int symbols) {
        Random random = new Random();
        ArrayList<String> secretCode = new ArrayList<>();
        while (secretCode.size() != codeLength) {
            int number = random.nextInt(symbols);
            if (number > 9) {
                number = number + 87;
                char character = (char) number;
                if (!secretCode.contains(String.valueOf(character))) {
                    secretCode.add(String.valueOf(character));
                }
            } else if (!secretCode.contains(String.valueOf(number))) {
                secretCode.add(String.valueOf(number));
            }
        }
        System.out.print("The secret is prepared: ");
        for (int i = 0; i < codeLength; i++) {
            System.out.print("*");
        }
        if (symbols <= 10) {
            System.out.println(" (0-" + (symbols - 1) + ").");
        } else {
            char end = (char)(symbols + 86);
            System.out.println(" (0-9, a-" + end + ").");
        }
        return String.join("", secretCode);
    }

    public static int secretCodeLength(String input) {
        try {
            int length = Integer.valueOf(input);
            if (length > 36) {
                System.out.println("Error: code length cannot be longer than 36.");
                return 0;
            }
            if (length == 0) {
                System.out.println("Error: code length cannot be 0.");
                return 0;
            }
            return length;
        } catch (Exception e) {
            System.out.println("Error: \"" + input + "\" isn't a valid number.");
            return 0;
        }
    }

    public static int possibleSymbols(String input, int codeLength) {
        try {
            int numberOfSymbols = Integer.valueOf(input);
            if (numberOfSymbols > 36) {
                System.out.println("Error: maximum number of possible symbols in " +
                        "the code is 36 (0-9, a-z).");
                return 0;
            } else if (numberOfSymbols < codeLength) {
                System.out.println("Error: it's not possible to generate a code with a " +
                        "length of " + codeLength + " with " + numberOfSymbols +
                        " unique symbols.");
                return 0;
            }
            return numberOfSymbols;
        } catch (Exception e) {
            System.out.println("Error: \"" + input + "\" isn't a valid number.");
            return 0;
        }
    }
}

