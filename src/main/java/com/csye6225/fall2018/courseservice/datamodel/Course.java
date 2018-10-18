package com.csye6225.fall2018.courseservice.datamodel;

import java.util.List;

/**
 * Created by Sunyh on 2018/10/17.
 */
public class Course {
    private long courseId;
    private List<Lecture>    lectures;
    private String board;
    private String roster;
    private List<Long>    students;
    private long professor;
    private long studentTA;

    public Course(){

    }

    public Course(long courseId, List<Lecture> lectures, String board, String roster, List<Long> students, long professor, long studentTA) {
        this.courseId = courseId;
        this.lectures = lectures;
        this.board = board;
        this.roster = roster;
        this.students = students;
        this.professor = professor;
        this.studentTA = studentTA;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getRoster() {
        return roster;
    }

    public void setRoster(String roster) {
        this.roster = roster;
    }

    public List<Long> getStudents() {
        return students;
    }

    public void setStudents(List<Long> students) {
        this.students = students;
    }

    public long getProfessor() {
        return professor;
    }

    public void setProfessor(long professor) {
        this.professor = professor;
    }

    public long getStudentTA() {
        return studentTA;
    }

    public void setStudentTA(long studentTA) {
        this.studentTA = studentTA;
    }
}
