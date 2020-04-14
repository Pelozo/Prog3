/*
5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
Tenga en cuenta el rango de valores aceptados para cada uno de estos.
a. Hora: 0 … 23
b. Minuto: 0 … 59
c. Segundo: 0 … 59
Considere el siguiente comportamiento:
1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
usando zero a la izquierda ejemplo 13:04:22 .
2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
4. Instanciar el objeto y probar los métodos creados.
 */
package net.pelozo.java.ex5;

public class Ex5 {

    public static void run(){

        Time time = new Time();
        System.out.println(time);

        System.out.println(time.addSecond());
        System.out.println(time.discountSecond());
        /*

        for (int i = 0; i < 500; i++) {
            System.out.println(time.addSecond());
        }

        System.out.println("-----");

        for (int i = 0; i < 510; i++) {
            System.out.println(time.discountSecond());
        }

        */

    }


}
