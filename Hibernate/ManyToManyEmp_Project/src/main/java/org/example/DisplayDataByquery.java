package org.example;

import org.example.dto.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class DisplayDataByquery {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session  session = sessionFactory.openSession();

      Query query=session.createQuery("from Employees");

        for (Object employee:query.list()){
            Employees employees=(Employees) employee;
            System.out.println(employees.getEmp_id()+" : "+employees.getEmp_name());
        }
            session.close();
            sessionFactory.close();


    }
}
