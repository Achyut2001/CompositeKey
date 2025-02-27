package org.example;

import org.example.dto.Employees;
import org.example.dto.Projects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import javax.validation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)  {
        System.out.println("Hello World!");

        Configuration cfg = new Configuration().configure();


        SessionFactory sessionFactory = cfg.buildSessionFactory();


        try (Session session = sessionFactory.openSession()) {


            Employees emp = new Employees();
            ValidatorFactory factory = Validation.byDefaultProvider()
                    .configure()
                    .messageInterpolator(new ParameterMessageInterpolator())
                    .buildValidatorFactory();
            Validator validator = factory.getValidator();


            emp.setEmp_name("Satishs dddddddddddddddddddddddd");

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


            Set<ConstraintViolation<Employees>> violations = validator.validate(emp);
            for (ConstraintViolation<Employees> violation: violations ){
                System.out.println(violation.getPropertyPath()+" "+violation.getMessage());
            }



            Set<ConstraintViolation<Employees>> violations1 = validator.validate(emp2);
            for (ConstraintViolation<Employees> violation: violations ){
                System.out.println(emp2 +" Emp2 violation"+""+violation.getPropertyPath()+" "+violation.getMessage());
            }


            transaction.commit();

            session.save(emp);
            System.out.println(session.get(Employees.class, 1));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }




    }
}
