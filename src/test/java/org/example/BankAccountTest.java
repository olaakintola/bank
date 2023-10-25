package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount(100.00, "John Doe");
    }

    @Test
    public void testDeposit(){
        double expectedValue = 1000.00;
        bankAccount.deposit(1000);
        double currentBalance = bankAccount.getBalance();
        assertEquals(expectedValue, currentBalance);

    }

    @Test
    public void testWithdraw(){
        double expectedValue = 500.00;
        bankAccount.deposit(2000);
        bankAccount.withdraw(1500);
        double currentBalance = bankAccount.getBalance();
        assertEquals(expectedValue, currentBalance);
    }
}
