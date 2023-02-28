package com.student.studentManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
public class StudentController {
    Map<Integer,Student> db=new HashMap<>();// storing admnNo. of student
    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admnNo)
    {
        return db.get(admnNo);

    }
    @PostMapping("/add")

        String  getAdd(@RequestBody Student student)
    {
         db.put(student.getAdmnNo(),student);
        return "student has been succesfully added";
    }

}
