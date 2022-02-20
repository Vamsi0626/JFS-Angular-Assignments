
public class Assignment {
	public static void main(String[] args) {
		
		//1. append Strings
		
		StringBuilder sb = new StringBuilder("StringBuffer");
		sb.append(" is a peer class of String");
		sb.append(" that provides much of");
		sb.append(" the functionality of strings");
		System.out.println(sb);
		
		//2. Insert String
		
		StringBuilder sb1 = new StringBuilder("It is used to  at the specified index position");
		sb1.insert(14, "insert text");
		System.out.println(sb1);
		
		//3.Reverse 
		
		StringBuilder sb2 = new StringBuilder("This method returns the reversed object on which it was called");
		sb2.reverse();
		System.out.println(sb2);
	}
}
