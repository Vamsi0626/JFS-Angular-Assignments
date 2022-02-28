
import java.util.ArrayList;
import java.util.Arrays;

public class Asssignment8Q8 {
    public static void main(String[] args) {
        ArrayList <Integer> j = new ArrayList<>(Arrays.asList(1 ,2 ,3 ,4 ,5 ,6, 7, 8 ,9, 10));
        new Thread(() -> System.out.println(j)).start();  
    }
}