package net.pelozo.java.ex4;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {

    class NotEnoughBalanceException extends Exception {
        public NotEnoughBalanceException(String errorMessage) {
            super(errorMessage);
        }
    }

    private static final AtomicInteger idCount = new AtomicInteger(0);
    private int id;
    private String name;
    private float balance;


    public BankAccount(String name){
        this.name = name;
        this.balance = 0;

        //increment id and assign.
        id = idCount.incrementAndGet();
    }

    public BankAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;

        //increment id and assign.
        id = idCount.incrementAndGet();
    }


    public float deposit(float value){

        if(value < 0){
            throw new IllegalArgumentException ("Amount to deposit needs to be a positive number, it was " + value);
        }

        return balance += value;

    }

    public float subtract(float value) throws NotEnoughBalanceException{

        if(balance - value < 0){
            throw new NotEnoughBalanceException("Couldn't subtract $" + value + ", current balance is $" + balance);
        }else{
            balance -= value;
        }

        return balance;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    //TODO remove?
    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount (" +
                "id: " + id +
                ", nombre: " + name +
                ", balance: $" + balance +
                ')';
    }
}
