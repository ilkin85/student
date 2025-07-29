package org.social;

public class Student {
    private String name;
    private int age;
    private double gpa;
    private String studentCard;

    public Student(String name, int age, double gpa, String studentCard) {
        setName(name);
        setAge(age);
        setGpa(gpa);
        setStudentCard(studentCard);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be >= 0");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 5.0) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 5.0");
        }
    }

    public String getStudentCard() {
        // Return format like 1234****6789
        if (studentCard.length() == 16) {
            return studentCard.substring(0, 4) + "****" + studentCard.substring(12);
        }
        return "Invalid Card";
    }

    public void setStudentCard(String studentCard) {
        if (studentCard != null && studentCard.length() == 16) {
            this.studentCard = studentCard;
        } else {
            throw new IllegalArgumentException("Student card must be 16 characters long");
        }
    }

    public String getStudentType() {
        return "General Student";
    }
}
