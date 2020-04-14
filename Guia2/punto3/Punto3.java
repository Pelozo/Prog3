/*Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de
un Cliente. Para esto identificamos los atributos id, nombre y género (M o F) para el
Cliente. Por otro lado tenemos el tipo Cuenta que también posee un identificador,
un balance y un Cliente que es el dueño de la cuenta. La Cuenta debe exponer los
métodos depositar y extraer que modifican el balance de la misma. Algo a tener en
cuenta es que el método extraer no puede extraer dinero si el balance total no lo
permite, si esto sucede se debe imprimir un mensaje por pantalla que indique que
la cuenta no posee saldo suficiente.
a. Crear un Cliente e imprimirlo en pantalla.
b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
10000.
c. Realizar operaciones de depósito y extracción para probar esa
funcionalidad.
d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,
de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un
balance negativo con un máximo de - 2000. Realice los cambios y pruebas
necesarias.
e. Analice cómo implementaría con las herramientas conocidas hasta el
momento, llevar un registro de como máximo 10 operaciones de depósito y
extracción que se realizaron en la cuenta. En donde se almacene en
memoria de alguna forma la siguiente cadena de texto:
i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}
*/
package net.pelozo.punto3;

public class Punto3 {

    public static void run(){

        //a. Crear un Cliente e imprimirlo en pantalla.
        Client client = new Client("Batman", 'm');
        System.out.println(client);

        //b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
        //10000.
        Account account = new Account(10000, client);

        //c. Realizar operaciones de depósito y extracción para probar esa
        //funcionalidad.
        System.out.println(account);

        try {
            account.subtract(90000);
        } catch (Account.NotEnoughBalanceException e) {
            System.out.println("La cuenta no posee el balance suficiente");
        }
        System.out.println(account);

        account.deposit(1);
        account.deposit(2);
        account.deposit(3);
        account.deposit(4);
        account.deposit(5);
        account.deposit(6);
        account.deposit(7);
        account.deposit(8);
        account.deposit(9);
        account.deposit(10);
        try {
            account.subtract(50);
        } catch (Account.NotEnoughBalanceException e) {
            System.out.println("La cuenta no posee el balance suficiente");
        }
        account.deposit(11);
        account.deposit(12);
        System.out.println(account);


        System.out.println(account.getHistorial());
    }
}
