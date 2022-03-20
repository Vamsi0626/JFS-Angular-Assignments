package springCoreAssignmet2;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springCoreAssignment2.Question;

public class Assignment2Test {

	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Assignment2.xml");	      
	    Question qList= (Question) context.getBean("q2List");   
	    ArrayList <String> l = new ArrayList<String>();
	    l.add("it  is a Color");
	    l.add("it  is a Fruit");
	    Question qL = new Question(1,"What is Orange?",l);
	    assertEquals(qList.toString(), qL.toString());
	    context.close();

	}
	
}