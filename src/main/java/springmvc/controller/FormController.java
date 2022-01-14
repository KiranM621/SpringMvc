package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.UserRegistration;

@Controller
public class FormController {

	
	@RequestMapping("/complexform")
	public String showForm(Model model) {
//		String str = null;
//		System.out.println(str.length());
		return "complexform";
	}
	
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String formhandler(@ModelAttribute UserRegistration userreg,Model model,
			BindingResult result) {
		if(result.hasErrors()) {
			return "complexform";
		}
		
		model.addAttribute("userinfo",userreg);
		
		System.out.println(userreg);
		return "success";
	}
	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class,ArithmeticException.class})
//	public String exceptionHandler( ) { 
//		return "null_page";
//	}
}
