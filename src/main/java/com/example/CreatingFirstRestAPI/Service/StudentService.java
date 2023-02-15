package com.example.CreatingFirstRestAPI.Service;

import com.example.CreatingFirstRestAPI.Model.Student;
import com.example.CreatingFirstRestAPI.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    //LOGIC HANDLING
    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public Object getStudent(int id) {
        return studentRepository.getStudent(id);
    }
}
