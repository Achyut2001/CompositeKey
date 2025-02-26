package org.example;

import org.example.dto.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Pagination {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();


        try (SessionFactory sessionFactory = cfg.buildSessionFactory(); Session session = sessionFactory.openSession()) {

            Query<Employees> query = session.createQuery("from Employees", Employees.class);

            query.setFirstResult(0);

            query.setMaxResults(6);

            List<Employees> list = query.list();


            for (Employees employees : list) {
                System.out.println(employees.getEmp_id() + "  :  " + employees.getEmp_name());
            }
        }

    }
}
