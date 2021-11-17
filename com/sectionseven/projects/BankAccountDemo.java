package com.sectionseven.projects;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("John doe", 5000);
        BankAccount accountTwo = new BankAccount("John doe", 5000);

        accountOne.deposit(500);
        System.out.println("Owner: "+accountOne.getOwner());
        System.out.println("Balance "+accountOne.getBalance());

        accountOne.withdraw(50000);
        System.out.println("Owner: "+accountOne.getOwner());
        System.out.println("Balance "+accountOne.getBalance());
        System.out.println("\n");
    }
}
