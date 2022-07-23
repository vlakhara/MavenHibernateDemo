package com.vipul.Maven_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien alien = new Alien();
        alien.setaId(105);
        alien.setaName("Abc");
        alien.setaTech("pqr");
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session  = sf.openSession();
        
        Transaction tr = session.beginTransaction();
        
        session.save(alien);
        
        tr.commit();
        
    }
}
