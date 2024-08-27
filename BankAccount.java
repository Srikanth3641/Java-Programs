//abstract class
import java.util.Scanner;
abstract class Bank {
    protected long accountNumber;
    protected double balance;
    protected String bankName;

    protected Bank(long accountNumber, double balance, String bankName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }

    protected abstract void withdraw(double amount);

    protected abstract void deposit(double amount);

    public double currentBalance() {
        return balance;
    }
}

//child class


class SavingAccount extends Bank {
    public SavingAccount(long accountNumber, double balance, String bankName) {
        super(accountNumber, balance, bankName);
    }

    
    protected void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("After withdraw, balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    protected void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("After deposit, balance: " + balance);
        }
    }
}


class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input account details
        System.out.println("Enter your account number: ");
        long accountNumber = sc.nextLong();
        System.out.println("Enter your bank name: ");
        String bankName = sc.next();
        System.out.println("Enter your initial balance: ");
        double balance = sc.nextDouble();

        // Create SavingAccount object
        SavingAccount sa = new SavingAccount(accountNumber, balance, bankName);

        // Withdrawal
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        sa.withdraw(withdrawAmount);

        // Deposit
        System.out.println("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        sa.deposit(depositAmount);

        sc.close();
    }
}
