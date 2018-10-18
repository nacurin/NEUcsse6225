//package com.csye6225.fall2018.courseservice.service;
//
//import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
//import com.csye6225.fall2018.courseservice.datamodel.Course;
//import com.csye6225.fall2018.courseservice.datamodel.Lecture;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by Sunyh on 2018/10/17.
// */
//public class CoursesService {
//    static HashMap<Long, Course> course_map = InMemoryDatabase.getCourseDB();
//
//    public List<Course> getAllCourses() {
//        //Getting the list
//        ArrayList<Course> list = new ArrayList<>();
//        for (Course course : course_map.values()) {
//            list.add(course);
//        }
//        return list ;
//    }
//
//    public void addCourse(List<Lecture> lectures, String board, String roster, List<Long> students, long prof, long studentTA) {
//        // Next Id
//        long nextAvailableId = course_map.size() + 1;
//
//        //Create a Course Object
//        Course course = new Course(nextAvailableId, lectures, board, roster, students, prof, studentTA);
//        course_map.put(nextAvailableId, course);
//    }
//
//    public Course addCourse(Course course) {
//        long nextAvailableId = course_map.size() + 1;
//        course.setCourseId(nextAvailableId);
//        course_map.put(nextAvailableId, course);
//        return course_map.get(nextAvailableId);
//    }
//
//    public Course getCourse(Long courseId) {
//        return course_map.get(courseId);
//    }
//
//    public Course deleteCourse(Long courseId) {
//        Course deleteStudDetails = course_map.get(courseId);
//        course_map.remove(courseId);
//        return deleteStudDetails;
//    }
//
//    public Course updateCourseInformation(Long courseId, Course course) {
//        Course oldStudObject = course_map.get(courseId);
//        courseId = oldStudObject.getCourseId();
//        course.setCourseId(courseId);
//        // Publishing New Values
//        course_map.put(courseId, course) ;
//
//        return course;
//    }
//}
