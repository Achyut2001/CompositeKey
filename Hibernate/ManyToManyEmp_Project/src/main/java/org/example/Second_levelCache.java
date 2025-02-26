package org.example;

import org.example.dto.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Second_levelCache {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();


        Session session = sessionFactory.openSession();
        Employees employees = session.get(Employees.class, 1);
        System.out.println(employees.getEmp_name());
        session.close();


        Session session1 = sessionFactory.openSession();

        Employees employees1 = session1.get(Employees.class, 1);
        System.out.println(employees1.getEmp_name());
        session1.close();

        sessionFactory.close();


    }
}
