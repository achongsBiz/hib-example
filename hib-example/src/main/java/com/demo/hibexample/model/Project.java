package com.demo.hibexample.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @ManyToMany(targetEntity = Employee.class, cascade={CascadeType.ALL})
    @JoinTable(
            name = "employee_project",
            joinColumns={@JoinColumn(name="project_id")},
            inverseJoinColumns = {@JoinColumn(name="employee_id")}
    )

    private List<Employee> employees;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long projectId;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private String projectName;
}
