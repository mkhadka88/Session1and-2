package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String args[]) {
	Employee e = new Employee();
	e.setEid(101);
	
	e.setEname("John");
	e.setSal(10000);
	
	
	System.out.println(e);
	
	ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
	
	Employee e1 =(Employee) context.getBean("emp1");
	Employee e2 =(Employee) context.getBean("emp2");
	
	System.out.println(e1);
	System.out.println(e2);
}
}
