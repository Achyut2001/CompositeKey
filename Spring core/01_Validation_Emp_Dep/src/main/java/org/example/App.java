package org.example;

import org.example.DTO.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        Configuration configuration=new Configuration().configure();

        SessionFactory  sessionFactory=configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();

        ValidatorFactory factory = Validation.byDefaultProvider()
                .configure()
                .messageInterpolator(new ParameterMessageInterpolator())
                .buildValidatorFactory();
        Validator validator = factory.getValidator();

        Employees employees=new Employees();

        employees.setName("");
        employees.setSalary(1234.567);
        employees.setG_mail("achyut@gmail.com");

        Set<ConstraintViolation<Employees>> violations = validator.validate(employees);
        for (ConstraintViolation<Employees> violation: violations ){
            System.out.println(violation.getPropertyPath()+" "+violation.getMessage());
        }

    }
}
