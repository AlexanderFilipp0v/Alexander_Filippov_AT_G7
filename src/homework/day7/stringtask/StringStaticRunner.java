package homework.day7.stringtask;

public class StringStaticRunner {

    public static void main(String[] args) {

        new ColumnSt().methodColumn("String to column");

        new DuplicatesSt().DuplicatesWords("one two three one four two four");

        new NumbersInArraySt().MethodNumbersInArray("2dkhfgb9834y98232db32dbabcb23j");

        new DateConsoleSt().DateConsolen();

        new DateFormattingSt().Formatting("22.00 07.09.2020");

        new GenDateSt().GenerationDate("Hello привет раз два три Hello");

        new LogSt().LogPrint("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied");
    }

}

