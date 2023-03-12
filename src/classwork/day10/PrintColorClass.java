package classwork.day10;

public class PrintColorClass {

    public void printColor(String color) {

        if (color.equals(ConstantContainer.RED)) {
            System.out.println("Red");
        } else if (color.equals(ConstantContainer.BLUE)) {
            System.out.println("Blue");
        } else if (color.equals(ConstantContainer.GREEN)) {
            System.out.println("Green");
        } else if (color.equals(ConstantContainer.PURPLE)) {
            System.out.println("Purple");
        } else if (color.equals(ConstantContainer.YELLOW)) {
            System.out.println("Yellow");
        }
    }
}
