package org.example;

import org.example.dto.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchTypeEager {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Employees employees=session.get(Employees.class,1);

        System.out.println(employees.getEmp_name());


      //  Transaction transaction= session.beginTransaction();

        session.close();


    }
}
