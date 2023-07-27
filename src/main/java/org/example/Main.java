package org.example;

import org.example.controller.StudentController;
import org.example.entity.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //1
        //Studnet controller need Studnet Object
        // so we creating studnet object here
        Student studentData = new Student();
        System.out.println("studnet data is : "+studentData);
        studentData.setRollNumber(101);
        studentData.setFirstName("suhas");
        studentData.setLastName("kumar");
        studentData.setAddress("Banglore");
        System.out.println("studnet data is : "+studentData);


        //2
        // I want to call createStudent of StudnetController Object
        // But that method is non static , so I created StudentController object first
        StudentController studentController = new StudentController();
        // and I am passing studentData as a parameter in createStudent method
        studentController.createStudent(studentData);







        Student studentData2 = new Student();
        System.out.println("studnet data 2 is : "+studentData2);
        studentData2.setRollNumber(102);
        studentData2.setFirstName("Mahendra");
        studentData2.setLastName("dhoni");
        studentData2.setAddress("ranchi");

        studentController.createStudent(studentData2);


       System.out.println("**********************************************************");


        List<Student> listOfStudnetsGotFromController =studentController.getAllStudents();


        System.out.println("getting all students are : "+listOfStudnetsGotFromController);


        System.out.println("**********************************************************");


       List<Student> updatedStudnetList = studentController.updateStudent("Virendra");

       System.out.println("updatedStudnetList is : "+updatedStudnetList);

        System.out.println("**********************************************************");


        List<Student> deletedList = studentController.deleteStudent(101);
        System.out.println("deletedList is : "+deletedList);

        System.out.println("**********************************************************");



    }


/*


    public void passM1DataToM2(Long id,String country , Student studentObject){

        m2(country , studentObject);

    }

    private void m2(String country,Student studentObject) {


        passM2DataToM3Method(studentObject,country);

    }

    private void passM2DataToM3Method(Student studentObject,String country) {

        System.out.println(studentObject);
        System.out.println(country);

    }
*/


}