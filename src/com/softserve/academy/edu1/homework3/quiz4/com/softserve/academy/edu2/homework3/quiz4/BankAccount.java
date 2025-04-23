package com.softserve.academy.edu2.homework3.quiz4;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }
    public void withdraw(double withdrawAmount) {
       if(this.balance >= withdrawAmount){
           this.balance = this.balance - withdrawAmount;
       }
    }
}
