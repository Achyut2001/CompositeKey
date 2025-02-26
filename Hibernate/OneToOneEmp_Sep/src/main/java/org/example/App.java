package org.example;

import Emp_deparment.Deparment;
import Emp_deparment.EmpDeatils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        EmpDeatils empDeatils = new EmpDeatils();

        empDeatils.setEmp_name("Achyut");
        empDeatils.setEmp_gmail("achyut@gmail.com");
        empDeatils.setDoj(new Date(1));

        Deparment deparment = new Deparment();
        deparment.setDep_name("It");
        deparment.setHod("Govind");
        empDeatils.setDeparment(deparment);


        EmpDeatils empDeatils1 = new EmpDeatils();

        empDeatils1.setEmp_name("Adesh");
        empDeatils1.setEmp_gmail("adesg@gmail.com");
        empDeatils1.setDoj(new Date(2));

        Deparment deparment1 = new Deparment();
        deparment1.setDep_name("Support");
        deparment1.setHod("Sudhakar");
        empDeatils1.setDeparment(deparment1);

        deparment1.setHod("Achyut");


        Transaction tx = session.beginTransaction();
//        session.save(empDeatils);
//        session.save(deparment);


        session.save(empDeatils1);
        session.save(deparment1);


        tx.commit();


        session.detach(empDeatils1);

        empDeatils1.setEmp_name("Satish");



        /*    session.delete(empDeatils1);*/ // used to delete data from db.


     /*   Scanner sc=new Scanner(System.in);
        int id= sc.nextInt();
         try {
             EmpDeatils deatils = session.load(EmpDeatils.class, id);
             System.out.println(deatils);
         } catch (RuntimeException e) {
             e.getMessage();
             System.out.println("Please enter correct id");
         }*/
      /*  EmpDeatils deatils1 = session.get(EmpDeatils.class, empDeatils1.getEmp_id());
        System.out.println(deatils1);*/


        session.close();


    }
}
