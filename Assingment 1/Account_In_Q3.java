public class Account_In_Q3 {

    String accNumber;
    double balance;

    Account_In_Q3(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // display acc info..

    public void displayAccInfo() {
        System.out.println("Account Number : " + accNumber);
        System.out.println("Current balance : " + balance);
    }

    // for deposite

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite : " + amount);
        } else {

            System.out.println("Ammount must be positive..");
        }

    }
    // for withdraw

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdraw : " + amount);
            } else {
                System.out.println("Insufficient Ammount..");
            }

        } else {
            System.out.println("Must be positive");
        }
    }

}

class SavingAccount extends Account_In_Q3 {
    double interestRate;

    public SavingAccount(String accNumber, double balance, double interestRate) {
        super(accNumber, balance);
        this.interestRate = interestRate;
    }

    // Apply rate interest
    public void applyInterest() {

        double interest = balance * interestRate / 100;
        balance += interest;

        System.out.println("Applied Interest of $ " + interest + " New balance : " + balance);

    }

    // dispaly
    public void displayAccInfo() {
        super.displayAccInfo();
        System.out.println("InterestRate : " + interestRate + "%");
    }
}

// Define check method
class CheckingAccount extends Account_In_Q3 {

    double overDraftLimit;

    CheckingAccount(String accNumber, double balance, double overDraftLimit) {

        super(accNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    // overdraft withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal " + amount + " New balance " + balance);
        } else {
            System.out.println("exceed overdraft limit...");
        }
    }

    public void displayAccInfo() {
        super.displayAccInfo();
        System.out.println("OverDraft Limit : " + overDraftLimit);
    }

    public static void main(String[] args) {

        // create obj for savings

        SavingAccount savings = new SavingAccount("A1234", 1000, 2.5);
        savings.displayAccInfo();
        savings.deposite(200);
        // savings.withdraw(300);
        savings.applyInterest();

        System.out.println();

        // create obj for checking

        CheckingAccount checking = new CheckingAccount("cA128", 500, 300);
        checking.displayAccInfo();
        checking.withdraw(400);
        checking.withdraw(2000);

    }

}
