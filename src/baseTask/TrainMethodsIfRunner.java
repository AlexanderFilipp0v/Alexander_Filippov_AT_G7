package baseTask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf obj1 = new TrainMethodsIf();

        System.out.println("метод <returnNewInt> вернул " + obj1.returnNewInt(10));
        System.out.println("метод <returnNewLong> вернул " + obj1.returnNewLong(9223372036854775807l));
        System.out.println("метод <returnNewChar> вернул " + obj1.returnNewChar('k'));
        System.out.println("метод <returnNewFloat> вернул " + obj1.returnNewFloat(0.67f));
        System.out.println("метод <returnNewDouble> вернул " + obj1.returnNewDouble(80));
        obj1.returnNewBoolean(false);


    }

}
