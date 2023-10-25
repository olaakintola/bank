package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAccountTest {

    private CurrentAccount currentAccount;

    @BeforeEach
    public void setUp(){
       currentAccount = new CurrentAccount(100,"Testing team",200);
       currentAccount.deposit(140);
    }

    @Test
    public void withdrawAboveMaximum(){
        boolean expected  = false;
        boolean actual = currentAccount.withdraw(300);

        assertEquals(expected,actual);
    }

    @Test
    public void withdrawBellowMaximum(){
        boolean expected  = true;
        boolean actual = currentAccount.withdraw(120);

        assertEquals(expected,actual);
    }

    @Test
    public void withdrawMoreThanCurrentBalance(){
        boolean expected  = false;
        boolean actual = currentAccount.withdraw(150);

        assertEquals(expected,actual);
    }

}
