package in.pwdservices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		UserServices userServices = ctxt.getBean(UserServices.class);
		
		userServices.savdUser("pooja", "pooja123", 777788);
	}

}
