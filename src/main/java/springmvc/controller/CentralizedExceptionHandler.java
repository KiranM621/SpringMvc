package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CentralizedExceptionHandler {


	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class,ArithmeticException.class})
	public String exceptionHandler( ) { 
		return "null_page";
	}
	
}
