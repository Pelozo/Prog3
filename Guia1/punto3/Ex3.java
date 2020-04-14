/*
3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado.
 */
package net.pelozo.java.ex3;

public class Ex3 {

    public static void run(){

        //a. Inicialice el objeto con los atributos necesarios
        ItemVenta item = new ItemVenta("Alcohol en gel", 420, 66.6f);
        ItemVenta item2 = new ItemVenta("Papel higiénico", 999, 150);

        //b. Imprima por pantalla el objeto inicializado.
        System.out.println(item);
        System.out.println(item2);


    }


}
