import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String userInput = input.nextLine();

        boolean passwordValid = true;

        if (!hasMinLength(userInput)) {
            System.out.println("Password must be at least 8 characters.");
            passwordValid = false;
        }
        if (!mustUppercase(userInput)) {
            System.out.println("Password must include an uppercase letter.");
            passwordValid = false;
        }
        if (!mustLowercase(userInput)) {
            System.out.println("Password must include a lowercase letter.");
            passwordValid = false;
        }
        if (!mustNumber(userInput)) {
            System.out.println("Password must include a number.");
            passwordValid = false;
        }
        if (!mustSymbol(userInput)) {
            System.out.println("Password must include a special character.");
            passwordValid = false;
        }

        if (passwordValid) {
            System.out.println("Your password is valid!");
        }

    }

    public static boolean hasMinLength(String text) {
        return text.length() >= 8;
    }

    public static boolean mustUppercase(String text) {
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean mustLowercase(String text) {
        for (char ch : text.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean mustNumber(String text) {
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean mustSymbol(String text) {
        for (char ch : text.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}
