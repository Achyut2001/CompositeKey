package org.example;

import DTO.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {
        Configuration cfg=new Configuration().configure();

        SessionFactory sessionFactory=cfg.buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction= session.beginTransaction();

        Employees employees=session.load(Employees.class,2);
        session.delete(employees);

        transaction.commit();
        session.close();
    }
}
