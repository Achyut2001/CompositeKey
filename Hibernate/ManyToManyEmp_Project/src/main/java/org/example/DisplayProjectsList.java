package org.example;

import org.example.dto.Employees;
import org.example.dto.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DisplayProjectsList {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Projects projects = session.load(Projects.class, 55);

        List<Employees> listemp = projects.getEmpList();
        for (Employees employees : listemp) {
            System.out.println(employees.getEmp_name());
        }

        transaction.commit();
        session.close();

    }
}
