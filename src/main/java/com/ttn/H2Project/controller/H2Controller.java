package com.ttn.H2Project.controller;


import com.ttn.H2Project.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class H2Controller {


    @GetMapping
    public String getMessage(){
        return "Hello World";
    }

    @PostMapping("/save-json")
    public String saveEmployeeJson(@RequestBody Employee employee) {
        return "Saved (JSON): ID = " + employee.getId() + ", Name = " + employee.getName();
    }


//    @PostMapping("/save-form")

    public String saveEmployeeForm(
            @RequestParam Long id,
            @RequestParam String name) {
        return "Saved (Form): ID = " + id + ", Name = " + name;
    }


    @PostMapping("/save-model")
    public String saveEmployeeModel(@ModelAttribute Employee employee) {
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        return "Saved (Model): ID = " + employee.getId() + ", Name = " + employee.getName();
    }

}
