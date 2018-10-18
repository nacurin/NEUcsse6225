package com.csye6225.fall2018.courseservice.resources;

import com.csye6225.fall2018.courseservice.datamodel.Student;
import com.csye6225.fall2018.courseservice.service.StudentsService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Sunyh on 2018/10/16.
 */
@Path("students")
public class StudentsResource {

    StudentsService studentsService = new StudentsService();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getProfessorsByDeparment() {
        return studentsService.getAllStudents();
    }

    @GET
    @Path("/{studendId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("studendId") long studId) {
        return studentsService.getStudent(studId);
    }

    @DELETE
    @Path("/{studendId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student deleteStudent(@PathParam("studendId") long profId) {
        return studentsService.deleteStudent(profId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Student addStudent(Student stud) {
        return studentsService.addStudent(stud);
    }

    @PUT
    @Path("/{studendId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Student updateStudent(@PathParam("studendId") long studId,
                                     Student stud) {
        return studentsService.updateStudentInformation(studId, stud);
    }

    public void addStudent(String name, String image, String coursesEnrolled, String programName) {
        studentsService.addStudent(name, image, coursesEnrolled, programName);
    }
}
