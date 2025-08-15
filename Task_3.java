import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance can't be negative. Setting to 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
}


class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("✅ Withdrawal successful! Current balance: ₹" + account.getBalance());
        } else {
            System.out.println("❌ Withdrawal failed! Either insufficient balance or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.println("✅ Deposit successful! Current balance: ₹" + account.getBalance());
        } else {
            System.out.println("❌ Deposit failed! Please enter a valid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Your current balance: ₹" + account.getBalance());
    }
}

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // Starting balance
        ATM atm = new ATM(account);

        boolean running = true;

        System.out.println("🏦 Welcome to Java ATM!");

        while (running) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number between 1 and 4.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            double amount;

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = sc.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = sc.nextDouble();
                    atm.deposit(amount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    running = false;
                    System.out.println("👋 Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Please select 1-4.");
            }
        }

        sc.close();
    }
}