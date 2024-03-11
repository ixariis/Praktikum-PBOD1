/*
    Nama    : Surya Fajar
    Nim	    : 24060122140107
    Desc	: class BankAccount.java
    file	: BankAccount.java
*/

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; //Jumlah Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    public double getBalance() {
        return balance;
    }
}