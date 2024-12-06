package com.klu.jfsd;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;




public class App 
{
    
	public static void main( String[] args )
    {
     StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
     Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
     SessionFactory sf = md.getSessionFactoryBuilder().build();
     Session s = sf.openSession();
     Transaction t;
     
    
     //HQL
     //Insert
     Student st1 = new Student();
     st1.setFn("jayanth");
     st1.setId(1);
     s.save(st1);
     t = s.beginTransaction();
     t.commit();
     System.out.println( "Data Inserted" );
     /*
     //Retrieve 
     
     Student st2 = s.find(Student.class, 52);
     System.out.println("Data Retrieved");
     
     //Update
     
     st2.setId(52);
     st2.setFn("JFSDJ");
     s.update(st2);
     t = s.beginTransaction();
     t.commit();
     System.out.println("Data Updated");
     
     //Delete
     s.delete(st2);
     t = s.beginTransaction();
     t.commit();
     System.out.println( "Data Deleted" );
     */
     /*
     //HCQL
     
	Criteria c = s.createCriteria(Student.class);
     String id = null;
	c.add(Restrictions.gt(id,2));
     List<Student> l=c.list();
     System.out.println(l.get(0).getFn());
     System.out.println(l.get(0).getId());
     
     */
     OddSem o1= new OddSem();
     o1.setCourse("JFSD");
     o1.setCoursecode(2203);
     s.save(o1);
     t=s.beginTransaction();
     t.commit();
     System.out.println("OddSem data Inserted");
     
     Acceleration acc = new Acceleration();
     acc.setId(0);
     acc.setFn("Savitha2");
     acc.setCourse("JFSD");
     acc.setResult("Pass");
     s.save(acc);
     t=s.beginTransaction();
     t.commit();
     System.out.println("Acceleration Data Inserted");
     
     
     
    }
}