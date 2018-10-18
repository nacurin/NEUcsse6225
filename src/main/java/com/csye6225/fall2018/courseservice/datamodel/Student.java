package com.csye6225.fall2018.courseservice.datamodel;

/**
 * Created by Sunyh on 2018/10/16.
 */
public class Student {
    private String name;
    private long studentId;
    private String image;
    private String coursesEnrolled;
    private String programName;

    public Student() {

    }

    public Student (long studentId, String name, String image, String coursesEnrolled, String programName) {
        this.name = name;
        this.studentId = studentId;
        this.image = image;
        this.coursesEnrolled = coursesEnrolled;
        this.programName = programName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(String coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
