/*
2. Vamos a diseñar un programa que nos permita gestionar el personal que concurre
a un colegio. Para no hacerlo muy extenso vamos a limitarnos a estudiantes y
miembros de staff que a diferencia de los estudiantes, estos perciben una
remuneración. Ambos tipos comparten la característica de Persona que posee los
atributos de dni, nombre, apellido, email y direccion.
Por otro lado tenemos al Estudiante que posee las características de
Persona y las de un estudiante, que en este caso son, año de ingreso, cuota
mensual y carrera.
Y finalmente tenemos al miembro de Staff que también es una Persona pero
con características propias de alguien que trabaja para una institución, por ejemplo
salario y turno, este puede ser mañana o noche.
Diagramar el UML identificando superclase y subclases, crear constructores
necesarios, getters y setters, métodos de ayuda como salario anual y toString para
facilitar la impresión.
● Inicializar 4 estudiantes diferentes.
● Inicializar 4 miembros de staff con características diferentes.
● Crear un array que permita almacenar juntos los tipos anteriores y
almacenar las 8 instancias creadas anteriormente.
● Investigar el uso de la palabra reservada instanceof.
● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
la cantidad de miembros de staff.
● Recorrer el array y sumar el total de ingresos que percibe la
institución por parte de la cuota de estudiantes.
*/
package net.pelozo.punto2;

public class Punto2 {

    public static void run(){

        //● Inicializar 4 estudiantes diferentes.
        Student estudiante1 = new Student("123", "Cosme", "Fulanito", "cosme@fulanito.net", "idk", 2013, 2000f, "TUP");
        Student estudiante2 = new Student("124", "Roberto", "Fulanito", "roberto@fulanito.net", "idk", 2013, 2005f, "TUP");
        Student estudiante3 = new Student("125", "Commander", "Shepard", "admin@normandy.net", "Normandy", 2450, 2300f, "TSP");
        Student estudiante4 = new Student("126", "Garrus", "Valkarian", "garrus@normandy.net", "Normandy", 2450, 8000f, "TUSI");

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println(estudiante4);

        //● Inicializar 4 miembros de staff con características diferentes.
        Staff staff1 = new Staff("321", "Liara", "Tsoni", "Liara@normandy.net", "normandy", 100000, Staff.Shift.MORNING);
        Staff staff2 = new Staff("322", "Urdnot", "Wrex", "U@normandy.net", "normandy", 9, Staff.Shift.NIGHT);
        Staff staff3 = new Staff("323", "Mordin", "Solus", "m@normandy.net", "normandy", 50000, Staff.Shift.NIGHT);
        Staff staff4 = new Staff("324", "Tali", "Zorah", "t@normandy.net", "normandy", 80000, Staff.Shift.MORNING);

        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);
        System.out.println(staff4);

        //● Crear un array que permita almacenar juntos los tipos anteriores y
        //almacenar las 8 instancias creadas anteriormente.
        Person people[] = {estudiante1, estudiante2, estudiante3, estudiante4, staff1, staff2, staff3, staff4};

        //● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
        //la cantidad de miembros de staff.
        int studentNumber = 0;
        int staffNumber = 0;
        //● Recorrer el array y sumar el total de ingresos que percibe la
        //institución por parte de la cuota de estudiantes.
        float moneeeeey = 0;

        for(int i=0; i < people.length; i++){
            if(people[i] instanceof Student){
                studentNumber++;
                moneeeeey += ((Student)people[i]).getMonthlyFee();
            }else if(people[i] instanceof Staff){
                staffNumber++;
            }
        }
        System.out.println("Número de estudiantes: " + studentNumber + ", número de staff: " + staffNumber);
        System.out.println("Moneeeeey: " + moneeeeey);

    }
}

