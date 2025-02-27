package org.example.DTO;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employees {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emp_id;

    @NotBlank(message = "Name cannot be blank.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    @Column(nullable = false, length = 50)
    private String name;


    private double salary;

    @Email
    private String g_mail;


    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public @NotBlank(message = "Name cannot be blank.") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name cannot be blank.") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.") String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public @Email String getG_mail() {
        return g_mail;
    }

    public void setG_mail(@Email String g_mail) {
        this.g_mail = g_mail;
    }

    public Employees(long emp_id, String name, double salary, String g_mail) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
        this.g_mail = g_mail;
    }

    public Employees() {
    }

    @Override
    public String toString() {
        return "Employees{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", g_mail='" + g_mail + '\'' +
                '}';
    }
}
