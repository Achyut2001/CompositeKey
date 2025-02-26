package org.example.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int p_id;

    @NotNull(message="Project Name is must")
    private String p_name;
    @ManyToMany
    @JoinColumn(name = "projectsList")
    private List<Employees> empList;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public List<Employees> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employees> empList) {
        this.empList = empList;
    }


}
