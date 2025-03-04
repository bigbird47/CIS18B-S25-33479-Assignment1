package cis18b;

import java.util.Scanner;

//Create a class named BankAccount
public class BankAccount {

// Instance variables for accountHolderName, accountNumber, and balance.
private String accountHolderName;
private int accountNumber;
private double balance;

// A constructor to initialize the account with a name and starting balance.
public BankAccount(String accountHolderName, double initialBalance) {
 this.accountHolderName = accountHolderName;
 this.balance = initialBalance; 
}

// Method for deposit
public void deposit(double amount) {
 if (amount > 0) {
   balance += amount;
   System.out.printf("Deposit successful! New balance: $%.0f%n", balance);
 } else {
   System.out.println("Invalid input");
 }
}

// Method for withdraw
public void withdraw(double amount) {
 if (amount > 0 && amount <= balance) {
   balance -= amount;
   System.out.printf("Withdrawal successful! New balance: $%.0f%n", balance);
 } else if (amount > balance) {
   System.out.println("Insufficient funds!");
 } else {
   System.out.println("Invalid input");
 }
}

// Method for getBalance
public double getBalance() {
 return balance;
}
}