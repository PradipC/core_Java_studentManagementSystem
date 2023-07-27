package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;

import java.util.List;


public class StudentController {

      StudentService studentService = new StudentServiceImpl();


      //3
      // we got StudnetData inside StudentController now
      public void createStudent(Student studentData){

            // 4
            // now we want to pass this data to service layer
            // so createStudent is non static method
            // so again we created object of StudentService class
            // and called its createStudent method
            // now we calling createStudent method of service Impl
            studentService.createStudent(studentData);

      }




      public List<Student> getAllStudents(){

            List<Student>  listOfStudnetsReturnedFromService=studentService.getAllStudents();

            return listOfStudnetsReturnedFromService;

      }


      public List<Student>  updateStudent(String newUpdatedName){

          return studentService.updateStudent(newUpdatedName);

      }



      public List<Student> deleteStudent(int rollNumber){

          return  studentService.deleteStudent(rollNumber);

      }










}
