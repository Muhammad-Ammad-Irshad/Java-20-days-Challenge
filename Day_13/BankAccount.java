/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_13;

/**
 *
 * @author DELL 5410
 */
public class BankAccount {
    private String accountholder;
    private String accountNo;
    private double balance;
    
    public BankAccount(String accountholder, String accountNo){
        this.accountholder = accountholder;
        this.accountNo = accountNo;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: "+amount);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds");
        }else if(amount <= 0){
            System.out.println("Invalid withdrawal amount");
        }else{
            balance -= amount;
            System.out.println("Withdrawn: "+amount);
        }
    }
    public void checkBalance(){
        System.out.println("Current Balance: "+balance);
    }
    public String toFileString(){
        return accountholder+","+accountNo+","+balance;
    }
    public static BankAccount fromFileString(String line){
        String[] parts = line.split(",");
        BankAccount acc = new BankAccount(parts[0], parts[1]);
        acc.balance = Double.parseDouble(parts[2]);
        return acc;
    }
    public String getAccountNumber(){
        return accountNo;
    }
}
