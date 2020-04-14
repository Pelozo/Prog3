package net.pelozo.punto3;

import java.util.UUID;

public class Account {


    class NotEnoughBalanceException extends Exception {
        public NotEnoughBalanceException(String errorMessage) {
            super(errorMessage);
        }
    }

    private final int MAX_OPERATIONS = 10;

    private String id;
    private float balance;
    private Client client;
    private String[] historial;
    private int operations;

    public Account(float balance, Client client) {
        this.id = UUID.randomUUID().toString();
        this.balance = balance;
        this.client = client;
        this.historial = new String[MAX_OPERATIONS];
        this.operations = 0;
    }

    public String getHistorial(){
        String tmpHistorial = "";
        for(int i=0; i < operations;i++){
            tmpHistorial += this.historial[i];
        }
        return tmpHistorial;
    }

    private void rearrangeHistorial(){
        for(int i=1; i < operations;i++){
            this.historial[i - 1] = this.historial[i];
        }
        operations--;
    }

    public float deposit(float value){

        if(value < 0){
            throw new IllegalArgumentException ("Amount to deposit needs to be a positive number, it was " + value);
        }

        if(operations >= MAX_OPERATIONS){
            rearrangeHistorial();
        }

        historial[operations] = "Déposito: El " + client.getName() + " depositó " + value + "\n";
        operations++;

        return balance += value;

    }

    public float subtract(float value) throws NotEnoughBalanceException{

        if(balance - value < -2000){
            throw new NotEnoughBalanceException("Couldn't subtract $" + value + ", current balance is $" + balance);
        }else{
            balance -= value;

            if(operations >= MAX_OPERATIONS){
                rearrangeHistorial();
            }
            historial[operations] = "Extracción: El " + client.getName() + " retiró " + value + "\n";
            operations++;
        }

        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}
