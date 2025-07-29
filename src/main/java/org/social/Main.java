package org.social;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new UndergraduateStudent("Amin", 19, 4.2, "1234567812345678");
        students[1] = new GraduateStudent("Leyla", 25, 4.8, "9876543212345678");
        students[2] = new UndergraduateStudent("Murad", 21, 3.7, "1111222233334444");
        students[3] = new GraduateStudent("Nigar", 27, 5.0, "5555666677778888");
        students[4] = new UndergraduateStudent("Rashid", 22, 3.5, "9999000011112222");

        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Type: " + student.getStudentType());
            System.out.println("GPA : " + student.getGpa());
            System.out.println("Card: " + student.getStudentCard());
            System.out.println("-----------");
        }


    }
}