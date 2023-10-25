package org.example;

public class SavingsAccount extends BankAccount{
    private final static double interestRate = 0.1;

    public SavingsAccount(double minimumBalance, String accountHolderName){
        super(minimumBalance, accountHolderName);
    }


    public double calculateInterest(double amount){

        // help!!!!!!!!!!!!
        // should interest rate be applied on the amount deposited or current balance?
        return amount + (amount*interestRate);

        // can we calculate the interest rate separate and then deposit it??

        // this should work now

    }


    @Override
    public String toString(){
        return super.toString() + "\n interest rate: " + interestRate;
    }


}
