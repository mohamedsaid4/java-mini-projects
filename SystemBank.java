import java.util.Scanner;

public class SystemBank {
    static double balance = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            chooseOption();
            choice = input.nextInt();

            if (choice == 1) {
                deposit();
            } else if (choice == 2) {
                withdraw();
            } else if (choice == 3) {
                checkBalance();
            } else if (choice == 4) {
                System.out.println("Exit. Thank you!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    public static void chooseOption() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Choose option (1-4): ");
    }

    public static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Try again.");
        }
    }

    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void checkBalance() {
        System.out.println("Your current balance is $" + balance);
    }
}
