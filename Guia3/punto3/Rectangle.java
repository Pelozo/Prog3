package net.pelozo.punto3;

public class Rectangle extends Shape{

    private float height;
    private float width;

    public Rectangle(float height, float width) {
        super(null);
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, float height, float width) {
        super(color);
        this.height = height;
        this.width = width;
    }


    @Override
    public float getArea() {
        return height * width;
    }

    @Override
    public float getPerimeter() {
        return 2 * (height + width);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ",altura=" + height +
                ", largo=" + width +
                '}';
    }
}
