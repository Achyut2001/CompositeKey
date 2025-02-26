package DTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Employees employees=new Employees();
        employees.setName("Achyut");
        employees.setG_mail("achyut@gmail.com");


        Department department=new Department();
        department.setName("It");
        employees.setDep(department);

        Transaction  transaction= session.beginTransaction();;


        session.persist(employees);
        session.persist(department);

        transaction.commit();;
        session.close();
        sessionFactory.close();


    }
}
