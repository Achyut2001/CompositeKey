package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Configuration cfg = new Configuration().configure();


        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = null;



        try {
            session = sessionFactory.openSession();


            Employees emp = new Employees();

            emp.setEmp_name("Satishs");

            Employees emp2 = new Employees();

            emp2.setEmp_name("Anuja");

            Employees employees1 = new Employees();

            employees1.setEmp_name("Vishnu");


            Projects projects = new Projects();

            projects.setP_name("Library Management");

            Projects projects1 = new Projects();

            projects1.setP_name("Student Portal");


            List<Projects> projectsList = new ArrayList<>();
            projectsList.add(projects);
            projectsList.add(projects1);

            List<Employees> employeesList = new ArrayList<>();
            employeesList.add(emp);
            employeesList.add(emp2);
            employeesList.add(employees1);


            emp.setProjectsList(projectsList);
            emp2.setProjectsList(projectsList);


            projects.setEmpList(employeesList);
            projects1.setEmpList(employeesList);


            Transaction transaction = session.beginTransaction();


            session.save(emp);
            System.out.println(session.get(Employees.class, 1));

            session.save(emp2);
            session.save(employees1);
            transaction.commit();

            session.save(emp);
            System.out.println(session.get(Employees.class, 1));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

    }
}
