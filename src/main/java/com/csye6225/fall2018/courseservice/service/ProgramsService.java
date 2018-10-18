package com.csye6225.fall2018.courseservice.service;

import com.csye6225.fall2018.courseservice.datamodel.Course;
import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sunyh on 2018/10/17.
 */
public class ProgramsService {
    static HashMap<Long, Program> program_map = InMemoryDatabase.getProgramDB();

    public List<Program> getAllPrograms() {
        //Getting the list
        ArrayList<Program> list = new ArrayList<>();
        for (Program program : program_map.values()) {
            list.add(program);
        }
        return list ;
    }

    public void addProgram(List<Course> courses) {
        // Next Id
        long nextAvailableId = program_map.size() + 1;

        //Create a Program Object
        Program program = new Program(nextAvailableId, courses);
        program_map.put(nextAvailableId, program);
    }

    public Program addProgram(Program program) {
        long nextAvailableId = program_map.size() + 1;
        program.setProgramId(nextAvailableId);
        program_map.put(nextAvailableId, program);
        return program_map.get(nextAvailableId);
    }

    public Program getProgram(Long programId) {
        return program_map.get(programId);
    }

    public Program deleteProgram(Long programId) {
        Program deleteStudDetails = program_map.get(programId);
        program_map.remove(programId);
        return deleteStudDetails;
    }

    public Program updateProgramInformation(Long programId, Program program) {
        Program oldStudObject = program_map.get(programId);
        programId = oldStudObject.getProgramId();
        program.setProgramId(programId);
        // Publishing New Values
        program_map.put(programId, program) ;

        return program;
    }
}
