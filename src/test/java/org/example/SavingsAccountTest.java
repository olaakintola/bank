package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {

    private SavingsAccount savingsAccount;

    @BeforeEach
    public void setUp(){
        savingsAccount = new SavingsAccount(200, "Testing");

    }

    @Test
    public void depositAmount(){
        double expected = 220;
        double amountToDeposit = savingsAccount.calculateInterest(200);
        savingsAccount.deposit(amountToDeposit);
        double actual = savingsAccount.getBalance();
        assertEquals(expected,actual);

    }
    
}
