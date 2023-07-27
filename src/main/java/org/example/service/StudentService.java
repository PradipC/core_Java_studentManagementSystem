package org.example.service;

import org.example.entity.Student;

import java.util.List;

public interface StudentService {

     // Abstraction - In this Interface , we just declaring the method and we hidding main logic behind it Inside
        // implemenettaion class




        default void name(){
                System.out.println("My name is Lenovo");
        }




        // we are calling createStudent of StudentService
        // and at runtime it will execute from its Impl - Abstraction

        // 5
        // Controller passed data to here ,
        // so here we taking benefit of Abstraction
        // and it will runtime calling its implementation class
        public void createStudent(Student student);


        public List<Student> getAllStudents();

        public List<Student> updateStudent(String newUpdatedName);

        public List<Student>  deleteStudent(int rollNumber);



}
