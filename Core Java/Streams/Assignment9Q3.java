import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Trader {
    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

public class Assignment9Q3 {
    public static List<String> printUniqueCities (List<Trader> traders) {
        List <String> Cities = new ArrayList<>();
        traders.forEach(p -> Cities.add(p.getCity()));
        List<String> unqcities = Cities.stream().distinct().toList();
        return unqcities;
    }
    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {

        List <String> Cities = new ArrayList<>();
        traders.forEach(p -> {if(p.getCity().equals("Pune")){Cities.add(p.getName());}});
        List <String> CitiesSorted = Cities.stream().sorted().collect(Collectors.toList());
        return CitiesSorted;
    }
    public static String allTraderNames(List<Trader> traders) {
        StringBuilder a = new StringBuilder("");
        traders.forEach(p -> a.append(p.getName()+" "));
        return String.valueOf(a);
    }
    public static ArrayList<Trader> areAnyTradersFromIndore(List<Trader> traders) {
        ArrayList <Trader> Cities = new ArrayList<>();
        traders.forEach(p -> {if(p.getCity().equals("Indore")){Cities.add(p);}});
        return Cities;
    }
    public static void main(String[] args) {
        List<Trader> t = new ArrayList<>();
        t.add(new Trader("Gupta", "Hyderabad"));
        t.add(new Trader("Vamsi", "Pune"));
        t.add(new Trader("Anjani", "Pune"));
        t.add(new Trader("Anurag", "Kolkata"));
        t.add(new Trader("Komal", "Indore"));
        t.add(new Trader("Ravi", "Indore"));
        System.out.println(printUniqueCities(t));
        System.out.println(tradersFromPuneSortByName(t));
        System.out.println(allTraderNames(t));
        System.out.println(areAnyTradersFromIndore(t));

    }
}