/**
 * 
 * <h1>Convert Data Type</h1>
 * Program Data Types digunakan untuk latihan
 * operator pada java
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-11
 *
 */

public class ConvertDataType {

	static short methodOne(long l) {
		int i = (int) l;
		return (short)i;
	}
	public static void main(String[] args) {
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	}

}

