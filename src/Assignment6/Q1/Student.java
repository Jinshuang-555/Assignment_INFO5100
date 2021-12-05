package Assignment6.Q1;

import java.util.Date;

public class Student {

    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }
}
