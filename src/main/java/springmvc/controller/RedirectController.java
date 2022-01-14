package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	
	@RequestMapping("/one/{id}/{name}")
	public String one(@PathVariable("id") int id,@PathVariable("name") String name) { 
		System.out.println("one handler "+id+" "+name);
		return "redirect:/two";
		
	}
	
	
	
	@RequestMapping("/two")
	public RedirectView two() { 
		System.out.println("two handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("home");
	
		return redirectView;
			
	}
	
//	@RequestMapping("/two")
//	public String two() { 
//		System.out.println("two handler");
//	
//		return "form";
//			
//	}
	
	

	
	
	
}
