package com.csye6225.fall2018.courseservice.datamodel;

/**
 * Created by Sunyh on 2018/10/17.
 */
public class Lecture {
    private long lectureId;
    private String name;
    private String notes;
    private String material;

    public Lecture() {

    }

    public Lecture(long lectureId, String notes, String material) {
        this.lectureId = lectureId;
        this.notes = notes;
        this.material = material;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public long getLectureId() {
        return lectureId;
    }

    public void setLectureId(long lectureId) {
        this.lectureId = lectureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
