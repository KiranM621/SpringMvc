package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.dao.UserDao;
import springmvc.model.User;


@Service
public class UserService {

	@Autowired
	private UserDao user;
	
	public int createUser(User user) { 
		return this.user.saveUser(user);
	}
	
	public User getById(int id) { 
//		System.out.println("in service");
//		System.out.println("this"+this.user.getById(id));
		
		return this.user.getById(id);
	}
	
	public User deleteById(int id) {
		return this.user.deleteById(id);
	}
	
	public User updatebyId(int id) {
		return this.user.updatebyId(id);
	}	
}
