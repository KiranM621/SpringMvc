package springmvc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Kiran" );
		return "index";
	}	
	
	
	
	
	@RequestMapping("/about")
	public ModelAndView about() {
		
		ModelAndView model = new ModelAndView();
		
		List<String> friends = new ArrayList<String>();
		friends.add("Akash");
		friends.add("Pooja");
		friends.add("Apeksha");
		
		//setting data
		model.addObject("name", "kiran");
		model.addObject("friends", friends);

		//setting view name
		model.setViewName("about");
		
		return model;
	}

	
	

}
