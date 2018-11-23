package com.epam.atm;
/**
 * ATM for working payment system
 */
public class Main {
    public static void main(String[] args) {
        Deposit deposit = new Deposit(300);
        Client client = new Client(deposit, -100);
        Client bank = new Client(deposit, 1000);
        bank.start();
        client.start();
        try {
            bank.join();
            client.join();
            int balance = deposit.getBalance();
            System.out.println("Balance at termination: " + balance);
        } catch (InterruptedException e) {
            System.out.println("Unexpected");
        }
    }
}