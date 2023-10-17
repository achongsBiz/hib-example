package com.demo.hibexample.controller;

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


    //TODO: Autowire in repository


    @PostMapping("/associate")
    public void associate(@RequestBody AssociationDto dto) {

        Employee employee = null;
        Project project = null;

        // TODO: Search by employee ID:

        // TODO: Search by project ID:

        // TODO: Obtain a reference to the employees currently in the project:

        // TODO: Add new employee to the project:

        // TODO: Save:

    }
}
