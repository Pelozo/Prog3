/*
1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
siguientes pruebas:
    a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
    b. Imprimir por pantalla el alto y ancho.
    c. Imprimir por pantalla el área y perímetro.
    d. Modificar el alto y el ancho de la instancia.
    e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
    f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.

*/
package net.pelozo.java.ex1;


public class Ex1 {

    public static void run(){

        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        Rectangle rectangle = new Rectangle(20., 54.3);

        //b. Imprimir por pantalla el alto y ancho.
        System.out.println(rectangle);

        //c. Imprimir por pantalla el área y perímetro.
        System.out.println("Area: " + rectangle.getArea() +
                ", perimentro: " + rectangle.getPerimeter());

        //d. Modificar el alto y el ancho de la instancia.
        rectangle.setWidth(3);
        rectangle.setHeight(2);

        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        System.out.println("Area: " + rectangle.getArea() +
                ", perimentro: " + rectangle.getPerimeter());

        //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
        System.out.println(new Rectangle());


    }


}
