package com.epam.atm;

/**
 * Create  and control threads of banking account
 */
public class Client extends Thread {
    private final Deposit deposit;
    private final int change;

    Client(Deposit deposit, int change) {
        super("Bank client");
        this.deposit = deposit;
        this.change = change;
    }

    public void run() {
        try {
            synchronized (deposit) {
                int balance = deposit.getBalance();
                if (balance < 0) {
                    System.out.println("Transaction is not available");
                    System.exit(-1);
                }
                System.out.println("Client: balance before transaction: " + balance);
                System.out.println("transaction... ");
                balance += change;
                deposit.setBalance(balance);
                System.out.println("Client: balance: " + balance);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupting client thread");
        }
    }
}