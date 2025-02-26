package org.example.dto;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



import javax.persistence.*;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Emp_id;


   @NotNull(message = "Emp can not be null")
   @Max( value = 4, message = "Max character is 4 is allowed")
   @Min(value = 1)
    private String Emp_name;


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Projects> projectsList;


    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public List<Projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Projects> projectsList) {
        this.projectsList = projectsList;
    }
}
