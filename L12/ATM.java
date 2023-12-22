package ass4;

import java.util.Scanner;

class Account {
    private String bank;
    private int amount;

    // Constructor with two parameters
    public Account(String bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    // Getter methods
    public String getBank() {
        return bank;
    }

    public int getAmount() {
        return amount;
    }

    // Method to add (increase) the amount
    public void add(int plus) {
        amount += plus;
    }

    // Method to withdraw (decrease) the amount
    public void withdraw(int minus) {
        if (minus <= amount) {
            amount -= minus;
            System.out.println("Withdrawal successful. Remaining amount: " + amount);
        } else {
            System.out.println("Insufficient funds. Unable to withdraw.");
        }
    }

    // Method to clear the account
    public void clearAccount() {
        amount = 0;
        System.out.println("Account cleared. Remaining amount: " + amount);
    }
}

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object myAccount with initial values for bank and amount
        System.out.print("Enter the name of the bank: ");
        String bankName = scanner.nextLine();

        System.out.print("Enter the initial amount: ");
        int initialAmount = scanner.nextInt();

        Account myAccount = new Account(bankName, initialAmount);

        // Enable the user to operate using a menu while amount > 0
        while (myAccount.getAmount() > 0) {
            displayMenu();

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bank: " + myAccount.getBank());
                    break;
                case 2:
                    System.out.println("Current Amount: " + myAccount.getAmount());
                    break;
                case 3:
                    System.out.print("Enter amount to add: ");
                    int addAmount = scanner.nextInt();
                    myAccount.add(addAmount);
                    System.out.println("Amount added. New balance: " + myAccount.getAmount());
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 5:
                    myAccount.clearAccount();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        System.out.println("Account balance is zero. Exiting the ATM.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Bank");
        System.out.println("2. State");
        System.out.println("3. Add");
        System.out.println("4. Withdraw");
        System.out.println("5. Clear account");
        System.out.println("Enter your choice: ");
    }
}
