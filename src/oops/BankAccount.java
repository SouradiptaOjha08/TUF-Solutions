package oops;

import java.util.Scanner;

public class BankAccount {

    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.00;
            System.out.println("Insufficient funds!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit money
        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        // Withdraw money
        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        // Display account details
        account.displayDetails();

        sc.close(); // Close the scanner
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid input");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds!");
        } else {
            balance = balance - amount;
        }
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Balance : %.2f\n", balance);
    }
}
