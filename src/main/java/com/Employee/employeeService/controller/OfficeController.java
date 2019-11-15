package com.Employee.employeeService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfficeController {

    @RequestMapping("/getOfc")
    public String getOffice(){
        return "My Office";
    }
}
