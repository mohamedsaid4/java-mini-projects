import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your sentence: ");
        String sentence = input.nextLine();

        int uppercaseCount = countUppercase(sentence);
        int lowercaseCount = countLowercase(sentence);
        int digitCount = countDigits(sentence);
        int specialCharCount = countSpecialChars(sentence);

        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }

    public static int countUppercase(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static int countLowercase(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        return count;
    }

    public static int countSpecialChars(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!(c >= 'a' && c <= 'z') &&
                    !(c >= 'A' && c <= 'Z') &&
                    !(c >= '0' && c <= '9')) {
                count++;
            }
        }
        return count;
    }
}
