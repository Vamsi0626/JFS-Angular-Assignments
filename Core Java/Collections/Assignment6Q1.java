import java.util.TreeMap;
public class Assignment6Q1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 938135840, "Vamsi");
		contact.put((long) 950572984, "Gupta");
		contact.put((long) 942586243, "Ali");
		contact.put((long) 947686577, "Sunil");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}