package org.example;

public class BankAccount {

    private double balance = 0;

    private double minimumBalance;

    private String accountHolderName;

    public BankAccount(double minimumBalance, String accountHolderName) {
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean deposit(double amount){
         balance += amount;
         return true;
    }

    public boolean withdraw(double amount) {
        balance -= amount;
        return true;
    }

    @Override
    public String toString(){
        return "account holder: "+ accountHolderName + "\n balance: "+ balance + "\n minimum balance: " + minimumBalance;
    }
}
