package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;

public class StudentServiceImpl implements  StudentService {


    @Override
    public void createStudent(Student studentData) {


        StudentRepository studentRepositoryObject = new StudentRepository();
        studentRepositoryObject.saveStudentInsideList(studentData);

    }


}
