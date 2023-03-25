package classwork.day12.third;

import classwork.day12.third.ClassX;
import classwork.day12.third.MyClass;

public class MyRunner2 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new);
    }
}
