package org.example.repository;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {


      List<Student>  studnetsList = new ArrayList<>();


    // 8
        // now service layer sent studnetData reached to StudentRepository layer
         public void saveStudentInsideList(Student studentData){

             // now to store Student Data , we created 1 arrayList of Studnet type

             // and In that List , we added StudentData
             studnetsList.add(studentData);

             System.out.println("*** Student List is : "+studnetsList);


         }




         public List<Student> gettingAllStudentsFromList(){


             return studnetsList;

         }



         public List<Student> updateName(String newUpdatingName){


              for(Student studnetObject :   studnetsList  ){

                 // System.out.println("Read all studnet object is : "+studnetObject);

                  if(studnetObject.getFirstName().equals("suhas")){
                      studnetObject.setFirstName("Virendra");
                  }

              }


              return studnetsList;

         }






         public List<Student> deleteStudent(int rollNumber){


              for( Student studentObject :  studnetsList  ){

                    if(studentObject.getRollNumber() == rollNumber){

                        studnetsList.remove( studentObject );

                    }

              }

            return studnetsList;

         }









}
