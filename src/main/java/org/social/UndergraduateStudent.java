package org.social;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, double gpa, String studentCard) {
        super(name, age, gpa, studentCard);
    }

    @Override
    public String getStudentType() {
        return "Undergraduate";
    }
}
