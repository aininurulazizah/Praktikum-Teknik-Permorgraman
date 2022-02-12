/**
 * 
 * <h1>Constants</h1>
 * Program Data Types digunakan untuk latihan menggunakan
 * variabel dan konstanta.
 * Konstanta yang digunakan dibuat dengan menggunakan
 * "public static finale double"
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-11
 *
 */

public class Constants2 {

	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + 
		paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}

