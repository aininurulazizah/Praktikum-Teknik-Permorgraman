import java.util.*;

/**
 * <h1>Data Types</h1>
 * Program Data Types digunakan untuk mengecek tipe data
 * numerik dari beberapa data masukkan pengguna
 * Tipe data numerik terdiri dari byte, short integer,
 * integer, dan long integer
 * 
 * Algoritma : 
 * 1. Data masukkan diterima dalam bentuk string
 * 2. Tiap data dikonversi ke tipe data long integer
 * 3. Dilakukan pengecekkan, jika data tidak termasuk ke dalam
 *    keempat tipe data, maka dengan menggunakan exception data
 *    ini akan ditentukan sebagai data numerik yang tidak termasuk
 *    ke dalam tipe data manapun
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-11
 */
public class DataTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Strandard input stream
		int T = input.nextInt();					// Deklarasi dan penerimaan masukkan T sebagai banyaknya masukkan pengguna
		String[] numberInString = new String[T];	// Deklarasi string untuk menerima masukkan pengguna 
		for(int i = 0; i < T; i++) {				// Perulangan menerima masukkan pengguna sebanyak T 
			numberInString[i] = input.next();		// Menerima masukkan pengguna
		}
		for(int i = 0; i < T; i++) {				// Perulangan pengecekkan masukkan pengguna
			try {													
				long number = Long.parseLong(numberInString[i]);		// Konversi dari masukkan pengguna yg berupa string menjadi long integer
				if(number >= -128 && number <= 127){					// Proses pengecekkan
					System.out.println(number + " can be fitted in :\n* byte\n* short\n* int\n* long");
				} else {
					if(number >= -32768 && number <= 32767) {
						System.out.println(number + " can be fitted in :\n* short\n* int\n* long");		
					} else {
						if(number >= -2147483648 && number <= 2147483647) {
							System.out.println(number + " can be fitted in :\n* int\n* long");
						} else {
							System.out.println(number + " can be fitted in :\n* long");
						}
					}
				}
			}
			catch (Exception e){														// Jika ada error (terutama di konversi ke long integer) 
				System.out.println(numberInString[i] + " can't be fitted anywhere.");	// maka digunakan exception agar bisa tetap berjalan
			}																			// Data ditetapkan sebagai data numerik yang tidak 
		}																				// termasuk ke dalam tipe data manapun

	}

}
