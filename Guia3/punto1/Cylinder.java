package net.pelozo.punto1;

public class Cylinder extends Circle {

    private float height;

    public Cylinder() {
        super();
        this.height = 1.0f;
    }

    public Cylinder(float height, float radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, float height, float radius) {
        super(color, radius);
        this.height = height;
    }

    public float getVolume(){
        return super.getArea() * height;
    }


    @Override
    public float getArea() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " +
                super.toString() +
                ", altura=" + height +
                ", volume=" + getVolume();
    }

}
