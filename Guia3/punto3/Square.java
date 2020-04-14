package net.pelozo.punto3;

public class Square  extends Shape{

    private float sideSize;

    public Square(float sideSize) {
        super(null);
        this.sideSize = sideSize;
    }

    public Square(String color, float sideSize) {
        super(color);
        this.sideSize = sideSize;
    }

    public float getSideSize() {
        return sideSize;
    }

    public void setSideSize(float sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public float getArea() {
        return (float)Math.pow(sideSize,2);
    }

    @Override
    public float getPerimeter() {
        return 4 * sideSize;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", tamano de lado=" + sideSize +
                '}';
    }
}
