package org.example;

import org.example.dto.Employees;
import org.example.dto.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;


public class DisplayData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = null;
        try {

            session = sessionFactory.openSession();

            Transaction transaction = session.beginTransaction();

            Employees employees = session.load(Employees.class, 1);
            System.out.println(employees.getEmp_id());
            System.out.println(employees.getEmp_name());



            List<Projects> projectsList = employees.getProjectsList();
            if (null != projectsList) {
                for (Projects projects : projectsList) {
                    System.out.println("Project Name=>\t" + projects.getP_name());

                }
            }
            transaction.commit();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
        session.close();

    }
}
