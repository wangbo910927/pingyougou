package cn.itcast.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController2 {
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/info88")
	public String info(){
		return "asss!!"+env.getProperty("url");
	}
	


}
