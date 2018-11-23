package com.epam.atm;

/**
 * Methods are used of ATM
 */
public class Deposit {
    private int balance;

    public Deposit(int startBalance) {
        balance = startBalance;
    }

    public void setBalance(int newBalance)
            throws InterruptedException {
        Thread.sleep(100);
        balance = newBalance;
    }

    public int getBalance() throws InterruptedException {
        Thread.sleep(100);
        return balance;
    }
}


                                                                    