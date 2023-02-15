package com.example.CreatingFirstRestAPI.Controlller;

import com.example.CreatingFirstRestAPI.Model.Student;
import com.example.CreatingFirstRestAPI.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// adding student
@RestController
@RequestMapping("api/vi")
public class StudentController {
    // Request Param -> ?id=1
    // Path Variable -> httdds/id
    // RequestBody
    @Autowired
    StudentService studentService;
    @PostMapping("addStudent")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("getStudent")
    public Object getStudent(@RequestParam("id") int id) {
        return studentService.getStudent(id);
    }
}
