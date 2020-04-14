/*
1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
precio, stock y Autor, este último posee las características de nombre, apellido,
email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
único autor. Ejecute las siguientes instrucciones:
a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
b. Imprima por pantalla al autor previamente instanciado.
c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
pesos con una cantidad de 150 copias.
d. Imprima por pantalla el libro instanciado.
e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
cantidad en 50 copias.
f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
Libro “Effective Java”.
g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
siguiente mensaje:
“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
cambios necesarios en el método del punto g, para imprimir un nuevo
mensaje que liste los autores que contribuyeron a ese libro.
 */
package net.pelozo.punto1;

public class Punto1 {

    public static void run(){


        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        Author author = new Author("Joshua", "Bloch", "joshua@email.com", 'm');

        //b. Imprima por pantalla al autor previamente instanciado.
        System.out.println(author);

        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        //pesos con una cantidad de 150 copias.
        Book book = new Book("Effective Java", 450,150, author);

        //d. Imprima por pantalla el libro instanciado.
        System.out.println(book);

        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.
        book.setPrice(500);
        book.setStock(50);

        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        //Libro “Effective Java”.
        System.out.println(book.getAuthors());

        //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje:
        System.out.println(book.getFormattedMessage());

        //h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        //cambios necesarios en el método del punto g, para imprimir un nuevo
        //mensaje que liste los autores que contribuyeron a ese libro.
        book.addAuthor(new Author("Cosme", "Fulanito", "CFul@aol.com", 'm'));
        System.out.println(book.getFormattedMessage());

    }
}
