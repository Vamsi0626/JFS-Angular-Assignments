package springCoreAssignment4;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Assignment4.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");

        System.out.println(controller.getBalance(626));
        System.out.println(controller.deposit(626,5000));
        System.out.println("----------------------------");
        System.out.println(controller.withdraw(626,5000));
        System.out.println(controller.getBalance(626));
        
        System.out.println("----------------------------");
        System.out.println(controller.fundTransfer(626,627,5000));
        System.out.println(controller.getBalance(626));
        System.out.println(controller.getBalance(627));
        context.close();

    }
}