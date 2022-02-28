
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

class  convertToUpperCase implements UnaryOperator<String>
{
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}
public class Assignment8Q6
{
    public static void main(String[] args)  {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("vamsi", "gupta", "ali", "sunil", "seven"));
       
        list.replaceAll( new convertToUpperCase());
       System.out.println(list);
    }

}