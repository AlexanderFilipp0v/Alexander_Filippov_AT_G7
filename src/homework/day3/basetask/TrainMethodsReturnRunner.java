package baseTask;

public class TrainMethodsReturnRunner {

	public static void main(String[] args) {
		
		TrainMethodsReturn ret = new TrainMethodsReturn();
		
		System.out.println("метод <returnNewInt> вернул " + ret.returnNewInt(5));
		System.out.println("метод <returnNewLong> вернул " + ret.returnNewLong(9223372036854775807l));
		System.out.println("метод <returnNewChar> вернул " + ret.returnNewChar('Л'));
		System.out.println("метод <returnNewFloat> вернул " + ret.returnNewFloat(1.456f));
		System.out.println("метод <returnNewDouble> вернул " + ret.returnNewDouble(1.456789012345678d));
		System.out.println("метод <returnNewShort> вернул " + ret.returnNewShort((short)32767));
		System.out.println("метод <returnNewByte> вернул " + ret.returnNewByte((byte)100));
		System.out.println("метод <returnNewBoolean> вернул " + ret.returnNewBoolean(true));

		
		
	}

}
