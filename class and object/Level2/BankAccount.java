import java.util.Scanner;

// BankAccount class definition
class BankAccount {
    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input bank account details
        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String number = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        // Create BankAccount object
        BankAccount account = new BankAccount(holder, number, initialBalance);

        // Menu-driven ATM simulation
        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
