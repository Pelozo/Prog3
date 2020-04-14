/*
4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.

Realice las siguientes operaciones:
1. Inicialice una cuenta con un monto inicial de 15000.
2. Realice una operación de crédito de 2500.
3. Realice una operación de compra de 1500.
4. Realice una operación de compra de 30000.
5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
correcto.


 */
package net.pelozo.java.ex4;

public class Ex4 {

    public static void run(){

        //1. Inicialice una cuenta con un monto inicial de 15000.
        BankAccount account = new BankAccount("Roberto", 15000);

        //2. Realice una operación de crédito de 2500.
        account.deposit(2500);


        try {
            //3. Realice una operación de compra de 1500.
            account.subtract(1500);
            //4. Realice una operación de compra de 30000.
            account.subtract(30000);
        } catch (BankAccount.NotEnoughBalanceException e) {
            System.out.println("No se pudo retirar, balance de $" + account.getBalance() + " insuficiente");
        }

        //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.
        System.out.println(account);


    }


}
