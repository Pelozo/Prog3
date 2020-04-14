package net.pelozo.punto3;

import java.util.UUID;

public class Client {

    private String id;
    private String name;
    private char gender;

    public Client(String name, char gender){
        this.id = UUID.randomUUID().toString();
        this.gender = gender;
        this.name = name;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", genre=" + gender +
                '}';
    }
}
