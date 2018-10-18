package com.csye6225.fall2018.courseservice.datamodel;

import java.util.List;

/**
 * Created by Sunyh on 2018/10/17.
 */
public class Program {
    private long programId;
    private List<Course> courses;

    public Program() {
    }

    public Program(long programId, List<Course> courses) {
        this.programId = programId;
        this.courses = courses;
    }

    public long getProgramId() {
        return programId;
    }

    public void setProgramId(long programId) {
        this.programId = programId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
