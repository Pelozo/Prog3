package net.pelozo.punto2;

public class Staff extends Person {

    enum Shift{
        MORNING,
        NIGHT
    }

    private float salary;
    private Shift shift;

    public Staff(String dni, String firstName, String lastName, String email, String address, float salary, Shift shift) {
        super(dni, firstName, lastName, email, address);
        this.salary = salary;
        this.shift = shift;
    }

    public float getAnnualSalary(){
        return salary * 12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                ", salario=" + salary +
                ", salario anual=" + getAnnualSalary() +
                ", turno=" + (shift == Shift.NIGHT? "noche" : "mañana") +
                '}';
    }
}
