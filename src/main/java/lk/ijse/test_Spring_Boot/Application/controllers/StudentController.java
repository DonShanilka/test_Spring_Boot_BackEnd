package lk.ijse.test_Spring_Boot.Application.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student") // commen patern
public class StudentController {

    @GetMapping("/list")
    public String getStudent(){
        return "Student List";
    }

    @PostMapping("/add")
    public String addStudent(){
        return "Student Add";
    }
}
