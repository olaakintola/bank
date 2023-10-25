package org.example;

public class Main {

    public static void main(String[] args) {
         SavingsAccount ola = new SavingsAccount(100, "Ola");
            CurrentAccount stella = new CurrentAccount(50, "Stella", 500);
            CurrentAccount sam = new CurrentAccount(20, "Sam", 300);
            BankAccount bankAccount = new BankAccount(200, "Testing");

            BankAccount[] accountHolders = {ola, stella, sam, bankAccount};

        for (BankAccount accountHolder: accountHolders) {
            System.out.println(accountHolder);

        }

    }





}
