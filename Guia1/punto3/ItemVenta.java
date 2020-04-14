package net.pelozo.java.ex3;

import java.util.concurrent.atomic.AtomicInteger;

public class ItemVenta {

    private static final AtomicInteger idCount = new AtomicInteger(0);
    private int id;
    private String description;
    private int quantity;
    private float unitPrice;

    public ItemVenta(String description, int quantity, float unitPrice) {
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

        //increment id and assign.
        id = idCount.incrementAndGet();
    }

    public float getTotal(){
        return unitPrice * quantity;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "ItemVenta[" +
                "id=" + id +
                ", descripción='" + description + '\'' +
                ", cantidad=" + quantity +
                ", pUnitario=" + unitPrice +
                ", pTotal=" + getTotal() +
                ']';
    }
}
