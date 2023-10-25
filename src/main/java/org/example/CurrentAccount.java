package org.example;

public class CurrentAccount extends BankAccount{

    private double maximumWithdraw;
    public CurrentAccount(double minimumBalance, String accountHolderName, double maximumWithdraw) {
        super(minimumBalance, accountHolderName);
        this.maximumWithdraw = maximumWithdraw;
    }

    public double getMaximumWithdraw() {
        return maximumWithdraw;
    }

    public void setMaximumWithdraw(double maximumWithdraw) {
        this.maximumWithdraw = maximumWithdraw;
    }

    @Override
    public boolean withdraw(double amount){
        if(amount <= maximumWithdraw && amount<=getBalance()){
            return super.withdraw(amount);
        }else{
            return false;
        }

    }


    @Override
    public String toString(){
        return super.toString() + "\n max withdraw: " + maximumWithdraw;
    }

}
