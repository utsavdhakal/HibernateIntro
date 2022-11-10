package com.example.hibernateIntro;

import com.example.hibernateIntro.dto.Address;
import com.example.hibernateIntro.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HibernateTest {
    public static void main(String[] args) {

        Address address = new Address("street", "city", "state", 101);
        UserDetails user = new UserDetails("John", address);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        session.close();
    }
}
