package homework.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyBirds {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        Pattern pattern = Pattern.compile("[аеёиоуыэюяАЕЁИОУЫЭЮЯ]");
        int counter = 0;
        for (String bird : birds) {
            Matcher matcher = pattern.matcher(bird);
            if (matcher.results().count() > 1) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(3, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }

    }
}
