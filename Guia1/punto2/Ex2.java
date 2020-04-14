/*
2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
anual. A su vez se requiere otro método que permita aumentar el salario
dependiendo del porcentaje que se le pase por parámetro. Considere crear un
método que facilite imprimir por pantalla las características del objeto de la
siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.

*/

package net.pelozo.java.ex2;

public class Ex2 {

    public static void run(){

        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
        Employee employee1 = new Employee("23456345", "Carlos", "Gutiérrez", 25000);

        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        Employee employee2 = new Employee("34234123", "Ana", "Sánchez", 27500);

        //c. Imprima ambos objetos por pantalla
        System.out.println(employee1);
        System.out.println(employee2);

        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
        employee1.raiseSalary(15);
        System.out.println("Salario anual: " + employee1.getAnnualSalary());

    }


}
