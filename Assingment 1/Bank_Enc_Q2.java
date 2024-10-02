public class Bank_Enc_Q2 {

    private String accNumber;
    private double balance;
    private String ownerName;

    // getters and setters for accNumber and owenername

    public String getAccountNumber() {
        return accNumber;
    }

    public void setAccountNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // to check balance

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

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
                System.out.println("Deposite : " + amount);
            } else {
                System.out.println("Insufficient Ammount..");
            }

        } else {
            System.out.println("Must be positive");
        }
    }

    // display acc info..

    public void displayAccInfo() {
        System.out.println("Account Number : " + accNumber);
        System.out.println("Ownwer Name : " + ownerName);
        System.out.println("Current balance : " + balance);
    }

    public static void main(String[] args) {

        Bank_Enc_Q2 account = new Bank_Enc_Q2();
        account.setAccountNumber("62873928301");
        account.setOwnerName("Akash Athawale");
        account.setBalance(500);

        System.out.println(
                "accNumber : " + account.getAccountNumber() + " : " + account.getOwnerName() + ": "
                        + account.getBalance());

        account.displayAccInfo();

        account.displayAccInfo();

        System.out.println();

        // Depositing money
        account.deposite(200.0);
        account.displayAccInfo();

        System.out.println();

        // Withdrawing money
        account.withdraw(100.0);
        account.displayAccInfo();

        System.out.println();

        // Withdraw more money than the balance
        account.withdraw(1200.0);
        account.displayAccInfo();

    }

}
