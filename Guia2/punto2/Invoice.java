package net.pelozo.punto2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Invoice {

    private String id;
    private String date;
    private Client client;
    private List<ItemVenta> items;

    public Invoice(Client client) {

        //generate unique id
        this.id = UUID.randomUUID().toString();

        //generate date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/YYYY HH:mm:ss");

        //create empty list
        this.items = new ArrayList<>();
        this.date = formatter.format(LocalDateTime.now());
        this.client = client;
    }

    public void addItem(ItemVenta item){
       items.add(item);
    }

    public String getId() {
        return id;
    }
    public String getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + getAmount() +
                ", final amount=" + getFinalAmount() +
                ", client=" + client +
                '}';
    }

    public float getAmount(){
        float amount = 0;
        for(ItemVenta item : items){
            amount += item.getUnitPrice() * item.getQuantity();
        }
        return amount;
    }

    public float getFinalAmount(){
        float tempAmount = getAmount();
        return tempAmount -= tempAmount * client.getDiscountPercentage() / 100;
    }
}
