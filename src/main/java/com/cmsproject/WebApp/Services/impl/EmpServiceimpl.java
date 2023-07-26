package com.cmsproject.WebApp.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cmsproject.WebApp.Services.EmpService;
import java.util.List;
import com.cmsproject.WebApp.Models.Employee;
import com.cmsproject.WebApp.Repositories.EmpRepository;
@Service
public class EmpServiceimpl implements EmpService{
   @Autowired
    private EmpRepository emprepository;

    public EmpServiceimpl(EmpRepository emprepository){
            this.emprepository = emprepository;

    }
@Override
    public List<Employee> getAllEmps() {
        return emprepository.findAll();
    }
}

      