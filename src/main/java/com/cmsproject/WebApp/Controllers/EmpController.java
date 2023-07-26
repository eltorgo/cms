package com.cmsproject.WebApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cmsproject.WebApp.Services.EmpService;

@Controller
public class EmpController {
    @Autowired
    private EmpService empservice;
    public EmpController(EmpService empservice){
        this.empservice=empservice;
    }
    @GetMapping("/Employees")
    public String ListofEmps(Model model){
        model.addAttribute("Employee", empservice.getAllEmps());
        return "Employees";
    }

}
