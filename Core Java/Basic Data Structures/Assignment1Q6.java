import java.util.Scanner;

class Login{
    String userId = "Vamsipolisetty",password = "Vamsi@2423";
    int loginAttempt =3;
    public String loginUser(String user, String pass) 
    {
    	if(user.equals(userId) && pass.equals(password))
    	{
    		return "yes";
    	}
    	else
    	{
    		return "no";
    	}
    }
}


public class Assignment1Q6 {
	public static void main(String[] args) {
		  	Login login = new Login();
	        String userId,password;
	        Scanner sc = new Scanner(System.in);
	        int loginAttempt =0;
	        while(true) {
	            System.out.println("Enter userId: ");
	            userId = sc.next();
	            System.out.println("Enter password: ");
	            password = sc.next();
	            String res = login.loginUser(userId, password);
	            if(res.equals("yes")){
	                System.out.println("Welcome "+userId);
	                break;
	            }
	            else{
	                loginAttempt++;
	                if(loginAttempt==3) {
	                    System.out.println("You have Entered WRONG credentials 3 times");
	                    System.out.println("NEED HELP --CONTANT ADMIN");
	                    break;
	                }
	                System.out.println("You have entered WRONG credentials ,please enter RIGHT credentials");
	            }
	        }
	}
}