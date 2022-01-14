package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller

public class LoginController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/form")
	public String showForm(Model model) {

		
		return "form";
		
	}
	
	
	@RequestMapping(path = "/formsumbit",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		//@ModelAttribute will bind data coming from form to User obj
		if(user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Blank email or Password");
			return "redirect:/form";
		}
		
		model.addAttribute(user);
		this.userservice.createUser(user);
		System.out.println(user);		
		return "user";
		
	}
	
	@RequestMapping(path = "/getById/{id}",method=RequestMethod.GET)
	public User getById(@PathVariable("id") int id) {
		return this.userservice.getById(id);
	}
	
	@RequestMapping(path = "/deletebyId/{id}",method=RequestMethod.DELETE)
	public User deleteById(@PathVariable("id") int id) {
		return this.userservice.deleteById(id);
	}
	
	
	@RequestMapping(path = "/updatebyId/{id}",method=RequestMethod.PATCH)
	public User updatebyId(@PathVariable("id") int id) {
		return this.userservice.updatebyId(id);
	}	
	
//	@ 
//	public User deleteById() { 
//		return null;
//	} 
	/*
	 * @RequestMapping(path = "/formsumbit",method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String email,
	 * 
	 * @RequestParam("password") String password,Model model) {
	 * 
	 * User user = new User(); user.setEmail(email); user.setPassword(password);
	 * 
	 * model.addAttribute(user);
	 * 
	 * System.out.println(user); return "user";
	 * 
	 * }
	 */

}
