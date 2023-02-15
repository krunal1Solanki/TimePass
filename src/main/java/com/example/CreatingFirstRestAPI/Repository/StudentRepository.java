package com.example.CreatingFirstRestAPI.Repository;

import com.example.CreatingFirstRestAPI.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class StudentRepository {
    HashMap<Integer, Student> studentDB = new HashMap<>();
    public String addStudent(Student student) {
        int id = student.getId();
        studentDB.put(id, student);
        return "Student Added Successfully";
    }

    public Object getStudent(int id) {
        if(!studentDB.containsKey(id)) {
            return "Student Not Found";
        }
        // string - > Object
        // student - > Object
        return studentDB.get(id);
    }
}
