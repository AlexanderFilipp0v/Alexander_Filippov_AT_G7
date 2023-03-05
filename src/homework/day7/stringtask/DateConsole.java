package homework.day7.stringtask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConsole {
    public void DateConsolen() {
        Date date = new Date();
        //SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd %2$tB yyyy hh:mm");


        //System.out.println("Сейчас на дворе " + formatForDateNow.format(dateNow));
        System.out.printf("%1$s %2$td %2$tB, %2$tY", "Сейчас на дворе:", date);
    }
}
