package com.cmsproject.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class ProjectController {
    
    @GetMapping("/employees")
   
    public String goHome(){
        return "Employees";
    }
    
}
