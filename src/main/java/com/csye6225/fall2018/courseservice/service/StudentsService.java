package com.csye6225.fall2018.courseservice.service;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sunyh on 2018/10/16.
 */
public class StudentsService {
    static HashMap<Long, Student> stud_Map = InMemoryDatabase.getStudentDB();

    // Getting a list of all student
    // GET "..webapi/students"
    public List<Student> getAllStudents() {
        //Getting the list
        ArrayList<Student> list = new ArrayList<>();
        for (Student stud : stud_Map.values()) {
            list.add(stud);
        }
        return list ;
    }

    // Adding a student
    public void addStudent(String name, String image, String coursesEnrolled, String programName) {
        // Next Id
        long nextAvailableId = stud_Map.size() + 1;

        //Create a Student Object
        Student stud = new Student(nextAvailableId, name , image, coursesEnrolled, programName);
        stud_Map.put(nextAvailableId, stud);
    }

    public Student addStudent(Student stud) {
        long nextAvailableId = stud_Map.size() + 1;
        stud.setStudentId(nextAvailableId);
        stud_Map.put(nextAvailableId, stud);
        return stud_Map.get(nextAvailableId);
    }

    // Getting One Student
    public Student getStudent(Long studId) {
        return stud_Map.get(studId);
    }

    // Deleting a Student
    public Student deleteStudent(Long studId) {
        Student deleteStudDetails = stud_Map.get(studId);
        stud_Map.remove(studId);
        return deleteStudDetails;
    }

    // Updating Student Info
    public Student updateStudentInformation(Long studId, Student stud) {
        Student oldStudObject = stud_Map.get(studId);
        studId = oldStudObject.getStudentId();
        stud.setStudentId(studId);
        // Publishing New Values
        stud_Map.put(studId, stud) ;

        return stud;
    }

}
