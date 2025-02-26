package org.example;


import DTO.Author;
import DTO.Book;
//import DTO.Publishers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Author author = new Author();
        author.setAuthor_id(2);
        author.setAuthor_name("Jon");


        Book book = new Book();
        book.setId(7);
        book.setBook_name("Clean Code");
        book.setAuthor(author);



        Book book1=new Book();
        book1.setId(8);
        book1.setBook_name("Java Master");
        book1.setAuthor(author);


        Book book2 = new Book();
        book2.setId(9);
        book2.setBook_name("Head first Java");
        book2.setAuthor(author);



        Book book3=new Book();
        book3.setId(10);
        book3.setBook_name("Java ");
        book3.setAuthor(author);

        List<Book> ls = new ArrayList<>();
        ls.add(book);
        ls.add(book1);
        ls.add(book2);
        ls.add(book3);



        author.setList(ls);
        session.save(author);
        session.save(book);
        session.save(book1);
        session.save(book2);
        session.save(book3); // u can use save method outside the transaction. * but one entity is depended on another then some time that cause data inconsistent

        Transaction transaction= session.beginTransaction();
        transaction.commit();

        session.close();




    }
}
