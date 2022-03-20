package springCoreAssignment1;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springCoreAssignment1.Address;
import springCoreAssignment1.customer;

public class Assignment1Test {

	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Assignment1.xml");
		customer c1 = (customer) context.getBean("customer");
		Address s1 = (Address) context.getBean("Address"); 
		Long l=  9381358140l;
		customer c2 = new customer(26,"Vamsi",l,s1);
		assertEquals(c2.toString(),c1.toString());
		context.close();
	}
	
	
	
}