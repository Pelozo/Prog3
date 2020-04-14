package net.pelozo.punto1;

import java.util.ArrayList;
import java.util.List;

public class Book{

    private String title;
    private float price;
    private int stock;
    private List<Author> authors;

    public Book(String title, float price, int stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = new ArrayList<Author>();
        authors.add(author);
    }

    public void addAuthor(Author author){
        if(!authors.contains(author)){
            authors.add(author);
        }
    }

    public void removeAuthor(Author author){
        authors.remove(author);
    }

    public List<Author> getAuthors(){
        return authors;
    }

    private String getAuthorsNames(){
        StringBuilder str = new StringBuilder();

        for(Author author : authors){
            str.append(author.getFirstName() + " " + author.getLastName());
            str.append(", ");
        }

        return str.substring(0, str.length() - 2);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", authors=" + getAuthors() +
                '}';
    }

    public String getFormattedMessage(){
        return "El libro, " + title + " de " + getAuthorsNames() + " se vende a " + price + " pesos.";
    }
}
