package com.cmsproject.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class ProjectController {
    
    @GetMapping("/index")
   
    public String goHome(){
        return "index";
    }
    
}
