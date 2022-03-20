package springCoreAssignment10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	 public static void main( String[] args ){
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Assignment10.xml");
		    hi c = (hi) Assignment10.getBean("Hello");
		    c.hello();
		    context.close(); 
		  }
}