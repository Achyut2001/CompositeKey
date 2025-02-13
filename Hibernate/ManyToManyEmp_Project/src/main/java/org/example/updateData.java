package org.example;

import DTO.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateData {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();

        Employees employees;
        employees = session.get(Employees.class, 2);
        employees.getEmp_name();
        employees.setEmp_name("Ketan");

        session.update(employees);
        transaction.commit();
        session.close();


    }
}
