package net.pelozo.punto1;

public class Circle {

    protected float radius;
    protected String color;
    protected final float PI = 3.14159f;

    public Circle(){
        radius = 1.0f;
        color = "rojo";
    }

    public Circle(float radius) {
        this.radius = radius;
        this.color = "rojo";
    }

    public Circle(String color, float radius) {
        this.color = color;
        this.radius = radius;
    }

    public float getArea(){
        return PI * (float)(Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
