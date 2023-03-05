package cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        cycletask.NumbersFromOnetoTwenty one = new cycletask.NumbersFromOnetoTwenty();
        one.NumbersFromOnetoTwentyOutput();

        cycletask.UnevenNumbersFromThreeToNineteen second = new cycletask.UnevenNumbersFromThreeToNineteen();
        second.UnevenNumbersFromThreeToNineteenOutput();

        cycletask.ArrayWithRandomElements third = new cycletask.ArrayWithRandomElements();
        third.ArrayWithRandomElementsCreationAndOutput();
        third.ArrayReverse();
        third.ArrayMultipliedByFive();
        third.ArrayMultipliedByItself();
        third.ArrayMin();
        third.ArrayFirstLast();
        third.ArraySort();

    }

}
