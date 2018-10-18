package com.csye6225.fall2018.courseservice.resources;

import com.csye6225.fall2018.courseservice.datamodel.Course;
import com.csye6225.fall2018.courseservice.datamodel.Program;
import com.csye6225.fall2018.courseservice.service.ProgramsService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Sunyh on 2018/10/17.
 */
@Path("programs")
public class ProgramsResource {
    ProgramsService programsService = new ProgramsService();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Program> getPrograms() {
        return programsService.getAllPrograms();
    }

    @GET
    @Path("/{programId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Program getProgram(@PathParam("programId") long progId) {
        return programsService.getProgram(progId);
    }

    @DELETE
    @Path("/{programId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Program deleteProgram(@PathParam("programId") long progId) {
        return programsService.deleteProgram(progId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Program addProgram(Program lect) {
        return programsService.addProgram(lect);
    }

    @PUT
    @Path("/{programId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Program updateProgram(@PathParam("programId") long progId,
                                 Program program) {
        return programsService.updateProgramInformation(progId, program);
    }

    public void addCourse(List<Course> courses) {
        programsService.addProgram(courses);
    }
}
