package net.pelozo.java.ex1;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double widht, double height){
        this.width = widht;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return (2 * width) + (2 * height);
    }

    @Override
    public String toString() {
        return "Rectangulo (" +
                "ancho: " + width +
                ", alto: " + height +
                ')';
    }
}
