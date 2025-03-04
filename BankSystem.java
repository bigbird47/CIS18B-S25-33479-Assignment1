package cis18b;

import java.util.Scanner;

public class BankSystem {
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    BankAccount account = null;
	    int choice;
	    System.out.println("Welcome to Simple Bank System");

	    // Display menu
	    do {
	      System.out.println("\n1. Create Account");
	      System.out.println("2. Deposit Money");
	      System.out.println("3. Withdraw Money");
	      System.out.println("4. Check Balance");
	      System.out.println("5. Exit");
	      System.out.print("\nEnter your choice: ");

	      while (!scanner.hasNextInt()) {
	        System.out.println("Invalid input");
	        scanner.next();
	      }
	      choice = scanner.nextInt();
	      scanner.nextLine();

	      switch (choice) {
	        case 1:
	          System.out.print("Enter account holder name: ");
	          String name = scanner.nextLine();
	          System.out.print("Enter initial deposit: ");
	          while (!scanner.hasNextDouble()) {
	            System.out.println("Invalid input");
	            scanner.next();
	          }
	          double initialDeposit = scanner.nextDouble();
	          scanner.nextLine();
	          account = new BankAccount(name, initialDeposit);
	          System.out.println("\nAccount created successfully!");
	          break;
	        case 2:
	          if (account == null) {
	            System.out.println("No account created yet");
	            break;
	          }
	          System.out.print("Enter deposit amount: ");
	          while (!scanner.hasNextDouble()) {
	            System.out.println("Invalid input");
	            scanner.next();
	          }
	          double depositAmount = scanner.nextDouble();
	          scanner.nextLine();
	          account.deposit(depositAmount);
	          break;
	        case 3:
	          if (account == null) {
	            System.out.println("No account created yet");
	            break;
	          }
	          System.out.print("Enter withdrawal amount: ");
	          while (!scanner.hasNextDouble()) {
	            System.out.println("Invalid input");
	            scanner.next();
	          }
	          double withdrawalAmount = scanner.nextDouble();
	          scanner.nextLine();
	          account.withdraw(withdrawalAmount);
	          break;
	        case 4:
	          if (account == null) {
	            System.out.println("No account created yet");
	          } else {
	            System.out.printf("Current balance: $%.0f%n", account.getBalance());
	          }
	          break;
	        case 5:
	          System.out.println("Thank you for using Simple Bank System!");
	          break;
	        default:
	          System.out.println("Invalid choice");
	      }
	    } while (choice != 5);
	    scanner.close();
	  }
	}