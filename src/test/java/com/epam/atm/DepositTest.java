package com.epam.atm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepositTest {

    @Test
    public void testGetBalance() throws InterruptedException {
        Deposit deposit = new Deposit(0);
        int balance = (int) deposit.getBalance();
        assertEquals(balance, 0);
    }
}