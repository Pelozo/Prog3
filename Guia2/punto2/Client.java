package net.pelozo.punto2;

import java.util.UUID;

public class Client {

    private String id;
    private String name;
    private String email;
    private int discountPercentage;

    public Client(String name, String email, int discountPercentage) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.discountPercentage = discountPercentage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
