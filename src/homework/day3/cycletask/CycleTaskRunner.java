package cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        NumbersFromOnetoTwenty one = new NumbersFromOnetoTwenty();
        one.NumbersFromOnetoTwentyOutput();

        UnevenNumbersFromThreeToNineteen second = new UnevenNumbersFromThreeToNineteen();
        second.UnevenNumbersFromThreeToNineteenOutput();

        ArrayWithRandomElements third = new ArrayWithRandomElements();
        third.ArrayWithRandomElementsCreationAndOutput();
        third.ArrayReverse();
        third.ArrayMultipliedByFive();
        third.ArrayMultipliedByItself();
        third.ArrayMin();
        third.ArrayFirstLast();
        third.ArraySort();

    }

}
