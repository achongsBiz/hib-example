package com.demo.hibexample.controller;

import com.demo.hibexample.data.EmployeeRepository;
import com.demo.hibexample.data.ProjectRepository;
import com.demo.hibexample.model.AssociationDto;
import com.demo.hibexample.model.Employee;
import com.demo.hibexample.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ManyToManyController {

    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private ProjectRepository projRepo;

    @PostMapping("/associate")
    public void associate(@RequestBody AssociationDto dto) {

        Employee employee = null;
        Project project = null;

        Optional<Employee> empOptional = empRepo.findById(dto.getEmployeeId());

        if(empOptional.isPresent()) {
            employee = empOptional.get();
        }

        Optional<Project> empProject = projRepo.findById(dto.getProjectId());

        if(empProject.isPresent()) {
            project = empProject.get();
        }

        List<Employee> employees = project.getEmployees();
        employees.add(employee);

        projRepo.save(project);
    }
}
