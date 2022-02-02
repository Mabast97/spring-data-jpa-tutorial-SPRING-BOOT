package com.dailycodebuffer.spring.data.jpa.tutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// This class is for having all the resources for our API
@RestController
@RequestMapping(path= "api/v1/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    // post used when we want to add new items
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {// in order to map it into student, and take the parameter from client
        studentService.addNewStudent(student);
    }
    // by using @RequestBody, we will take the request body and from json or the client, and then we map it into student

    @DeleteMapping(path = "{studentId}")  // for passing the studentId
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ) {
        studentService.updateStudent(studentId, name, email);
    }

}
