package springmvc.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import springmvc.model.User;

@Repository
public class UserDao {
	

	public int saveUser(User user) {
		
		
    	Configuration config = new Configuration().configure().addAnnotatedClass(User.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	session.save(user);
    	
    	
    	tx.commit();
    	
		return 1;
	}
	
	public User getById(int id) { 
	
//		System.out.println("in dao");

		Configuration config = new Configuration().configure().addAnnotatedClass(User.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	User data = (User) session.get(User.class, id);
//    	System.out.println(data);
    	
    	tx.commit();
    	
		return data;
	}
	
	public User deleteById(int id) {
		Configuration config = new Configuration().configure().addAnnotatedClass(User.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	User data = (User) session.get(User.class, id);
    	
    	session.delete(data);
//    	System.out.println(data);
    	
    	tx.commit();
    	
		return data;
		
		
	}
	
	public User updatebyId(int id) {
		Configuration config = new Configuration().configure().addAnnotatedClass(User.class);
    
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	//interface for following acid property
    	Transaction tx = session.beginTransaction();
    	
    	SQLQuery<User> userupdate = session.createSQLQuery("update logindata set email = 'kiran@gmail.com' where id = :userid").setParameter("userid",id);
    	
    	userupdate.executeUpdate();
    	
//    	System.out.println(data);
    	
    	tx.commit();
    	
		return null;
		
		
	}
	
}
