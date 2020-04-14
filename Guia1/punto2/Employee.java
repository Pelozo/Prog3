package net.pelozo.java.ex2;

public class Employee {

    private String dni;
    private String firstName;
    private String lastName;
    private float salary;


    public Employee(String dni, String firstName, String lastName, float salary) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    float getAnnualSalary(){
        return salary * 12;
    }

    float raiseSalary(float percentage) throws IllegalArgumentException  {

        if(percentage < 0){
            //nope
            throw new IllegalArgumentException ("Percentage needs to be a positive number, it was " + percentage);
        }

        return salary += (salary * percentage) / 100;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empleado (" +
                "DNI: '" + dni +
                ", nombre: " + firstName +
                ", apellido: " + lastName +
                ", salario: " + salary +
                ')';
    }
}
