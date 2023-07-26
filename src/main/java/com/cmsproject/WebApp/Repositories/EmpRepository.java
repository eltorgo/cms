package com.cmsproject.WebApp.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cmsproject.WebApp.Models.Employee;

public interface EmpRepository extends JpaRepository<Employee,Long>{

}