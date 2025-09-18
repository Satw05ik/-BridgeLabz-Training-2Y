// Base class: BankAccount
class BankAccount {
    public String accountNumber;      // Public: accessible everywhere
    protected String accountHolder;   // Protected: accessible in same package + subclass
    private double balance;           // Private: only inside BankAccount

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance (optional, usually avoided in real banking systems)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (private via getter): " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to demonstrate access to public and protected members
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Number (public): " + accountNumber);   // Public accessible
        System.out.println("Savings Account Holder (protected): " + accountHolder); // Protected accessible
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Driver class
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount acc1 = new BankAccount("123456", "Akshay", 5000.0);
        acc1.displayAccountDetails();

        acc1.deposit(2000);
        acc1.withdraw(1500);
        System.out.println("Final Balance: " + acc1.getBalance());

        System.out.println("-----------------------------");

        // Create SavingsAccount object
        SavingsAccount sa1 = new SavingsAccount("789012", "Rahul", 10000.0, 4.5);
        sa1.displayAccountDetails();       // From parent class
        sa1.displaySavingsAccountDetails(); // From subclass
    }
}
