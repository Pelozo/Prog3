package net.pelozo.punto3;

public class Circle extends Shape{

    protected float radius;
    protected  final float PI = 3.14159f;

    public Circle(float radius) {
        super(null);
        this.radius = radius;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea(){
        return PI * (float)(Math.pow(radius, 2));
    }

    @Override
    public float getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", radio=" + radius +
                '}';
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
