package baseTask;

public class TrainMethodsPrimitiveRunner {

    public static void main(String[] args) {

        TrainMethodsPrimitive prim = new TrainMethodsPrimitive();

        prim.printInt(5);
        prim.printLong(9223372036854775807l);
        prim.printChar('Л');
        prim.printFloat(1.456f);
        prim.printDouble(1.456789012345678d);
        prim.printShort((short) 32767);
        prim.printByte((byte) 100);
        prim.printBoolean(true);

    }
}
