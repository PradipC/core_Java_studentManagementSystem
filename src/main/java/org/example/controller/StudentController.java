package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;


public class StudentController {



      public void createStudent(Student studentData){

            StudentService studentService = new StudentServiceImpl();
            studentService.createStudent(studentData);

      }





}
