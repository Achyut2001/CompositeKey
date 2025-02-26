package org.example;

import org.example.DTO.Employee;
import org.example.DTO.EmployeeData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();


        try(Session session = sessionFactory.openSession()) {
            EmployeeData data = new EmployeeData();
            data.setId(1);
            data.setName("Ketan");
            Employee employee = new Employee();
            employee.setEmployeeData(data);  // Set composite key
            employee.setDep("IT");
            employee.setSal(2837.000);


            System.out.println("===========================");
            EmployeeData data1 = new EmployeeData();
            data1.setId(2);
            data1.setName("chetan");
            Employee employee1 = new Employee();
            employee1.setEmployeeData(data1);  // Set composite key
            employee1.setDep("IT");
            employee1.setSal(2837.000);

            System.out.println("===========================");
            EmployeeData data2 = new EmployeeData();
            data2.setId(3);
            data2.setName("chetan");
            Employee employee2 = new Employee();
            employee2.setEmployeeData(data2);  // Set composite key
            employee2.setDep("IT");
            employee2.setSal(2837.000);


            Transaction transaction = session.beginTransaction();


            // session.persist(employee);
            session.persist(employee2);
            transaction.commit();
            session.close();
            sessionFactory.close();

            System.out.println("Employee saved successfully!");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
