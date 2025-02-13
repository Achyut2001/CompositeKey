package org.example;

import DTO.Employees;
import DTO.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.List;
import java.util.Optional;

public class DisplayData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();
    //    Transaction transaction= session.beginTransaction();

        Employees employees=session.load(Employees.class,1);
        System.out.println(employees.getEmp_id());
        System.out.println(employees.getEmp_name());


       List<Projects>projectsList = employees.getProjectsList();

            for (Projects projects: projectsList){
                System.out.println(projects.getP_name());

        }

       // transaction.commit();
        session.close();

    }
}
