//package com.csye6225.fall2018.courseservice.service;
//
//import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
//import com.csye6225.fall2018.courseservice.datamodel.Lecture;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by Sunyh on 2018/10/17.
// */
//public class LecturesService {
//
//    static HashMap<Long, Lecture> lect_map = InMemoryDatabase.getLectureDB();
//
//    public List<Lecture> getAllLectures() {
//        //Getting the list
//        ArrayList<Lecture> list = new ArrayList<>();
//        for (Lecture lect : lect_map.values()) {
//            list.add(lect);
//        }
//        return list ;
//    }
//
//    public void addLecture(String notes, String material) {
//        // Next Id
//        long nextAvailableId = lect_map.size() + 1;
//
//        //Create a Lecture Object
//        Lecture lect = new Lecture(nextAvailableId, notes, material);
//        lect_map.put(nextAvailableId, lect);
//    }
//
//    public Lecture addLecture(Lecture lect) {
//        long nextAvailableId = lect_map.size() + 1;
//        lect.setLectureId(nextAvailableId);
//        lect_map.put(nextAvailableId, lect);
//        return lect_map.get(nextAvailableId);
//    }
//
//    public Lecture getLecture(Long lectId) {
//        return lect_map.get(lectId);
//    }
//
//    public Lecture deleteLecture(Long lectId) {
//        Lecture deleteStudDetails = lect_map.get(lectId);
//        lect_map.remove(lectId);
//        return deleteStudDetails;
//    }
//
//    public Lecture updateLectureInformation(Long lectId, Lecture lect) {
//        Lecture oldStudObject = lect_map.get(lectId);
//        lectId = oldStudObject.getLectureId();
//        lect.setLectureId(lectId);
//        // Publishing New Values
//        lect_map.put(lectId, lect) ;
//
//        return lect;
//    }
//}
