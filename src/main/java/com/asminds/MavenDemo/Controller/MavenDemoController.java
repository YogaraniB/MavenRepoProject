package com.asminds.MavenDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MavenDemoController {
	@RequestMapping("/") 
	public String index()    
	{
		System.out.println("I am in home");
		return "index";
		
	}
	@RequestMapping("/hello") 
	public String home()
	{
		System.out.println("I am in home");
		return "hello";
		        
	}
	
}
