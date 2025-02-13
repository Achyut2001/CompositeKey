package org.example;

import DTO.Employees;
import DTO.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();


        Employees emp = new Employees();
        emp.setEmp_id(41);
        emp.setEmp_name("Satish");

        Employees emp2 = new Employees();
        emp2.setEmp_id(42);
        emp2.setEmp_name("Anuja");

        Employees employees1 = new Employees();
        employees1.setEmp_id(43);
        employees1.setEmp_name("Vishnu");

        // Create Project entities
        Projects projects = new Projects();
        projects.setP_id(42);
        projects.setP_name("Library Management");

        Projects projects1 = new Projects();
        projects1.setP_id(43);
        projects1.setP_name("Student Portal");

        // Create a list of projects and assign to employees
        List<Projects> projectsList = new ArrayList<>();
        projectsList.add(projects);
        projectsList.add(projects1);

        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(emp);
        employeesList.add(emp2);
        employeesList.add(employees1);

        // Establishing many-to-many relationship
        emp.setProjectsList(projectsList);  // Set projects for emp
        emp2.setProjectsList(projectsList); // Assign projects to emp2 (if needed)
        //    employees1.setProjectsList(projectsList); // Assign projects to employees1

        projects.setEmpList(employeesList); // Set employees for the projects
        projects1.setEmpList(employeesList); // Set employees for project1




        Transaction transaction = session.beginTransaction();
        session.flush();

        session.save(emp);
        session.save(emp2);
        session.save(employees1);
        session.save(projects);
        session.save(projects1);


        transaction.commit();

        session.close();

    }
}
