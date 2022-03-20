package springCoreAssignment5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment5 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Assignment5.xml");
		Shape s = (Shape) context.getBean("Dot");
		s.draw();
		Shape si = (Shape) context.getBean("circle");
		si.draw();
		context.close();
}
}
