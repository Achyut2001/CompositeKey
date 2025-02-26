package org.example;

import DTO.Answer;
import DTO.Question;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Question question = new Question();
        question.setQ_id(1);
        question.setQuestion("what is Java");


        Answer answer = new Answer();
        answer.setId(1);
        answer.setAnswer("Java is programming lan");
        answer.setQuestion(question);

        Answer answer1 = new Answer();
        answer1.setId(2);
        answer1.setAnswer("Java used to Develop app");
        answer1.setQuestion(question);

        Answer answer2 = new Answer();
        answer2.setId(3);
        answer2.setAnswer("Java is OOps");
        answer2.setQuestion(question);


        Answer  answer3=new Answer();
        answer3.setId(4);
        answer3.setAnswer("Java is WORA");
        answer3.setQuestion(question);

        List<Answer> list = new ArrayList<>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        list.add(answer3);
        question.setList(list);



        Transaction transaction = session.beginTransaction();
        session.save(question);
        session.save(answer);
        session.save(answer1);
        session.save(answer2);
        session.save(answer3);


        transaction.commit();
        session.close();

    }
}
