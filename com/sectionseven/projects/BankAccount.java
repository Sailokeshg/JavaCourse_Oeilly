package com.sectionseven.projects;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public void deposit(int amount) {
        if ( amount > 0 ) {
            balance += amount;
        } else {
            System.out.println("Amount must be greater than Zero");
        }

    }

    public void withdraw(int amount) {
        if ( amount > 0 && amount <= balance ) {
            balance -= amount;
        } else {
            System.out.println("Amount must be greater than Zero and" +
                    "less than your balance " + balance);
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
