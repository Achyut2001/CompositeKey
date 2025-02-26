package org.example.saveupdate;

import org.example.dto.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {


            Employees employees = new Employees();
            employees.setEmp_name("Vaibhav");

            Transaction transaction = session.beginTransaction();
            session.persist(employees);


            System.out.println("Class name====" + session.getClass().isAnonymousClass());


            transaction.commit();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }
}
