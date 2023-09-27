package collection;
import java.util.HashSet;
import java.util.Set;

public class hashseteg {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("Canada");
        countries.add("Australia");
        countries.add("UK");
        System.out.println("Countries " + countries);

        String searchcon = "Canada";
        System.out.println("Does " + searchcon + " exist in the set? " + countries.contains(searchcon));

        Set<String> otherCountries = new HashSet<>();
        otherCountries.add("UK");
        otherCountries.add("Mexico");
        otherCountries.add("Japan");
        Set<String> intersection = new HashSet<>(countries);
        intersection.retainAll(otherCountries);
        System.out.println("Intersection of my two country set " + intersection);

        Set<String> union = new HashSet<>(countries);
        union.addAll(otherCountries);
        System.out.println("Union of twosets: " + union);
        countries.removeAll(otherCountries);
        System.out.println("after removing " + countries);
    }
}
