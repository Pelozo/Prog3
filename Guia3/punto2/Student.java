package net.pelozo.punto2;

public class Student extends Person {

    private int admissionYear;
    private float monthlyFee;
    private String career;

    public Student(String dni, String firstName, String lastName, String email, String address, int admissionYear, float monthlyFee, String career) {
        super(dni, firstName, lastName, email, address);
        this.admissionYear = admissionYear;
        this.monthlyFee = monthlyFee;
        this.career = career;

    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                super.toString() +
                ", ano de ingreso=" + admissionYear +
                ", cuota mensual=" + monthlyFee +
                ", carrera='" + career + '\'' +
                '}';
    }
}
