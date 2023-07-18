package org.example;

import org.example.controller.StudentController;
import org.example.entity.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Student studentData = new Student();
        System.out.println("studnet data is : "+studentData);
        studentData.setRollNumber(101);
        studentData.setFirstName("suhas");
        studentData.setLastName("kumar");
        studentData.setAddress("Banglore");
        System.out.println("studnet data is : "+studentData);


        StudentController studentController = new StudentController();
        studentController.createStudent(studentData);




    }
}