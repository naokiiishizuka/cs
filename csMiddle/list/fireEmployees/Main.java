package csMiddle.list.fireEmployees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fireEmployees(new String[]{"Steve","David","Mike","Donald","Lake","Julian"}, new String[]{"Donald","Lake"})));
    }
    public static String[] fireEmployees(String[] employees, String[] unemployed) {
        Set<String> unemployedSet = new HashSet<>(Arrays.asList(unemployed));
        ArrayList<String> remainEmployees = new ArrayList<>();

        for (String employ : employees) {
            if (!unemployedSet.contains(employ)) {
                remainEmployees.add(employ);
            }
        }

        return remainEmployees.toArray(new String[0]);
    }
}
