package net.pelozo.punto3;

public abstract class Shape {

    protected String color;

    public abstract float getArea();
    public abstract float getPerimeter();

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", area=" + getArea() +
                ", perimetro=" + getPerimeter() +
                '}';
    }
}

