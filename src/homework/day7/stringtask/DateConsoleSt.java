package homework.day7.stringtask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConsoleSt {

        public static void DateConsolen() {
            Date date = new Date();
            SimpleDateFormat formatDate = new SimpleDateFormat("dd MMMM, yyyy,  h 'часов' mm 'минут'");
            System.out.println("Сейчас на дворе " + formatDate.format(date));
        }
    }

