package com.example.hibernateIntro;

import com.example.hibernateIntro.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {

        UserDetails user = new UserDetails();
        user.setUserID(1);
        user.setUsername("John");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
    }
}
