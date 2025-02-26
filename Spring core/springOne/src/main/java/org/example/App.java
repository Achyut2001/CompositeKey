package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("services.xml");

        Students student = (Students) context.getBean("studentbean");
        System.out.println(student);
    }
}
