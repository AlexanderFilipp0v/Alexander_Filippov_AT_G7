package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class MyCountries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        StringBuilder countryString = new StringBuilder();
        for (String country : countries) {
            countryString.append(country).append(", ");
        }
        String countriesNew = countryString.toString();
        if (countriesNew.length() > 1) {
            countriesNew = countriesNew.substring(0, countriesNew.length() - 2);
        }
        System.out.println(countriesNew);

        int counter = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i) + " ");
        }
    }
}
