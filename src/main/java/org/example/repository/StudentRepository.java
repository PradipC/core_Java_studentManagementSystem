package org.example.repository;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {


         public void saveStudentInsideList(Student studentData){

             List<Student>  studnetsList = new ArrayList<>();
             studnetsList.add(studentData);

             System.out.println("*** Student List is : "+studnetsList);


         }





}
