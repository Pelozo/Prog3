package net.pelozo.punto2;

abstract public class Person {

    protected String dni;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String address;

    public Person(String dni, String firstName, String lastName, String email, String address) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + firstName + '\'' +
                ", apellido='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dirección='" + address + '\'' +
                '}';
    }
}
