package com.vipul.Maven_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {

//    	Laptop lap1 = new Laptop();
//    	lap1.setlId(101);
//    	lap1.setCompany("Hp");
//    	
//    	Laptop lap2 = new Laptop();
//    	lap2.setlId(102);
//    	lap2.setCompany("Dell");
//
//    	Laptop lap3 = new Laptop();
//    	lap3.setlId(103);
//    	lap3.setCompany("Lenovo");
//    	
//    	Laptop lap4 = new Laptop();
//    	lap4.setlId(104);
//    	lap4.setCompany("Asus");
//    	
//    	Student student_1 = new Student();
//    	student_1.setsRno(1);
//    	student_1.setsName("Vipul Lakhara");
//    	student_1.setFavSubject("Java");
//    	student_1.getLaptop().add(lap1);
//    	student_1.getLaptop().add(lap3);
//    	lap1.setStudent(student_1);
//    	lap3.setStudent(student_1);
//    	
//    	Student student_2 = new Student();
//    	student_2.setsRno(2);
//    	student_2.setsName("Harsh Lakhara");
//    	student_2.setFavSubject("Java");
//    	
//    	Student student_3 = new Student();
//    	student_3.setsRno(3);
//    	student_3.setsName("Trupti Lakhara");
//    	student_3.setFavSubject("JavaScript");
//    	student_3.getLaptop().add(lap2);
//    	student_3.getLaptop().add(lap4);
//    	lap2.setStudent(student_3);
//    	lap4.setStudent(student_3);
    	
    	
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session  = sf.openSession();
        
        Transaction tr = session.beginTransaction();

        Student student = session.get(Student.class, 1);
        
        System.out.println(student.getsName());
      
        tr.commit();
        
    }
}
