package org.social;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, double gpa, String studentCard) {
        super(name, age, gpa, studentCard);
    }

    @Override
    public String getStudentType() {
        return "Graduate";
    }
}
