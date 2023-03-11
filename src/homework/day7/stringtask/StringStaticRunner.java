package homework.day7.stringtask;

public class StringStaticRunner {

    public static void main(String[] args) {



        ColumnSt ex1 = new ColumnSt();
        ex1.methodColumn("String to column");

        DuplicatesSt ex2 = new DuplicatesSt();
        ex2.DuplicatesWords("one two three one two four four");

        DateConsoleSt ex5 = new DateConsoleSt();
        ex5.DateConsolen();

        DateFormattingSt ex6 = new DateFormattingSt();
        ex6.Formatting("22.00 07.09.2020");
    }

}

