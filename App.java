package com.maven;
import java.io.FileInputStream;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Work is Runing On" );
        Configuration cfg=new Configuration();
        cfg.configure("hiber.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
         
        Employee em=new Employee();
        em.setName("Sneha");
        em.setCity("Raipur");
        em.setOpen(true);
        em.setX(1);
        
        FileInputStream is=new FileInputStream("C:\\Users\\Divyanshu Sahu\\OneDrive\\Desktop\\Maven Projects\\demo\\src\\main\\java\\dhoni.jpeg");
        byte[] img=new byte[is.available()]  ;
        is.read();
        em.setImage(img);
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
       
        session.save(em);
        tx.commit();
        session.close();
        System.out.println("image uploaded");
        
        
    }
}
