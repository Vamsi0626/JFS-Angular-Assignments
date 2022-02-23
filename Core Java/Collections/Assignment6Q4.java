import java.util.*;

public class Assignment6Q4 {
    int date,month,year;
    
    public Assignment6Q4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<Assignment6Q4> dob = new LinkedList<>();
        

        dob.add(new Assignment6Q4(26,11,2000));
        dob.add(new Assignment6Q4(06,05,2000));
        dob.add(new Assignment6Q4(30,05,1980));
        dob.add(new Assignment6Q4(15,9,1978));
        dob.add(new Assignment6Q4(28,8,1999));
        dob.add(new Assignment6Q4(16,01,2004));
        dob.add(new Assignment6Q4(28,04,1983));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println("Your Data of Birth is "+dob.get(i)+" and it was a leap year ");
            }else{
                System.out.println("Your date of birth is "+dob.get(i)+" and it was not a leap year");
            }
            
        }
    }
    
}