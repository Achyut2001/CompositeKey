package org.example;


import Model.Department;
import Model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Employee employee = new Employee();//
        employee.setName("Achyut");
        employee.setPhoneNo(1234567);//they are in transient state


        Department department = new Department();
        department.setDep_name("Hr");
        department.setExp(12);
        employee.setDep(department);


        // creating another obj

        Employee employee1=new Employee();
        employee1.setName("Adesh");
        employee1.setPhoneNo(455555);


        Department department1=new Department();
        department1.setDep_name("It");
        department1.setExp(11);
        employee1.setDep(department1);


        Transaction t = session.beginTransaction();
        session.save(employee);
        session.save(employee1);

        t.commit();
        session.close();


    }
}
