package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;

import java.util.List;


// implements or extends give me the inheritance
public class StudentServiceImpl implements  StudentService {   // abstraction

    StudentRepository studentRepositoryObject = new StudentRepository();



    // 6
    // now we inside StudentServiceImpl , and we got studentData as 1st parameter in our
    // below method
    @Override    // Polymorphism - overriding
    public void createStudent(Student studentData) {


        //7
        // now studentData reached in Service layer , now i want to pass it to repository layer
        // so saveStudentInsideList is non static
        // so create object of StudentRepository and call its method

        // now same studentData we can pass inside saveStudentInsideList
        studentRepositoryObject.saveStudentInsideList(studentData);

    }

    @Override
    public List<Student> getAllStudents() {

        List<Student>  listOfStudnetsGotFromRepository =studentRepositoryObject.gettingAllStudentsFromList();

        return listOfStudnetsGotFromRepository;

    }

    @Override
    public List<Student> updateStudent(String newUpdatedName) {

        return studentRepositoryObject.updateName( newUpdatedName );

    }

    @Override
    public List<Student> deleteStudent(int rollNumber) {


       return studentRepositoryObject.deleteStudent(rollNumber);

    }


}
