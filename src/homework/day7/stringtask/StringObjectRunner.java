package homework.day7.stringtask;

public class StringObjectRunner {

    public static void main(String[] args) {

        new Column().methodColumn("String to column");

        new Duplicates().DuplicatesWords("one two three one two four");

        new NumbersInArray().MethodNumbersInArray("2dkhfgb9834y98232db32dbabcb23j");

        new DateConsole().DateConsolen();

        new DateFormatting().Formatting("22.00 07.09.2020");

        new GenDate().GenerationDate("Hello привет раз два");

        new Log().LogPrint("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied");
    }
    }



