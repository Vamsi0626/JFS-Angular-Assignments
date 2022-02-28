import java.util.ArrayList;
import java.util.Arrays;


public class Assignment8Q4 {
	    


	public static void main(String[] args ) {
		ArrayList<String> list =new ArrayList<String>(Arrays.asList("Vamsi", "Gupta", "Ali", "Sunil", "Seven"));
		
		
		
			list.removeIf(s -> ((s.length())%5!=0));
			System.out.println(list);
			

		
	}
}
