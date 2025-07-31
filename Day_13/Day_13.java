/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_13;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL 5410
 */
public class Day_13 {
    private static final String FILE_NAME = "bankData.txt";
    private static List<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        loadAccounts();
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n---Bank Menu---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> createAccount(scanner);
                case 2 -> deposit(scanner);
                case 3 -> withdraw(scanner);
                case 4 -> checkBalance(scanner);
                case 5 -> saveAccounts();
                default -> System.out.println("Invalid choice");
            }
        }while(choice != 5);
    }
    private static void createAccount(Scanner scanner){
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        accounts.add(new BankAccount(name, accNum));
        System.out.println("Account created.");
    }
    private static BankAccount findAccount(String accNum){
        for(BankAccount acc : accounts){
            if(acc.getAccountNumber().equals(accNum)){
                return acc;
            }
        }
        return null;
    }
    private static void deposit(Scanner scanner){
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        BankAccount acc = findAccount(accNum);
        if(acc != null){
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            acc.deposit(amount);
        }else{
            System.out.println("Account not found");
        }
    }
    private static void withdraw(Scanner scanner){
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        BankAccount acc = findAccount(accNum);
        if(acc != null){
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            acc.withdraw(amount);
        }else{
            System.out.println("Account not found");
        }
    }
    private static void checkBalance(Scanner scanner){
        System.out.println("Enter account number: ");
        String accNum = scanner.nextLine();
        BankAccount acc = findAccount(accNum);
        if(acc != null){
        acc.checkBalance();
        }else{
                System.out.println("Account not found");
            }
    }
    private static void loadAccounts(){
        File file = new File(FILE_NAME);
        if(!file.exists())return;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                accounts.add(BankAccount.fromFileString(line));
            }
        }catch(IOException e){
            System.out.println("Error loading accounts: "+e.getMessage());
        }
    }
    private static void saveAccounts(){
        try(PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))){
            for(BankAccount acc : accounts){
                writer.println(acc.toFileString());
            }
            System.out.println("Accounts saved");
        }catch(IOException e){
            System.out.println("Error saving accounts: "+e.getMessage());
        }
    }
}
