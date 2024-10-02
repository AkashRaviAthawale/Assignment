
public class Bank_Class_Q4 {

    private String accountNumber;
    private String holderName;
    private double balance;

    // getters and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // balance = balance + amount
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Check the current balance
    public double checkBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        Bank_Class_Q4 account = new Bank_Class_Q4();
        account.setAccountNumber("35723682479");
        account.setHolderName("Akash Athawale");
        account.setBalance(500);

        // Displaying details
        account.displayAccountDetails();

        System.out.println();

        // Depositing money
        account.deposit(200.0);
        account.displayAccountDetails();

        System.out.println();

        // Withdrawing money
        account.withdraw(100.0);
        account.displayAccountDetails();

        System.out.println();

        // Withdraw more money than the balance
        account.withdraw(1200.0);
        account.displayAccountDetails();
    }

}
