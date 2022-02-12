import java.util.*;

/**
 * <h1>Data Types</h1>
 * Program Strings Pada Soal 6 ini digunakan untuk :
 * 1. Menerima 2 inputan pengguna berupa string
 * 2. Menghitung jumlah karakter dari string yang masukkan
 * 3. Mengecek diantara 2 string apakah string pertama secara
 *    leksikal lebih besar dari string pertama ?
 * 4. Mengubah huruf pertama dari tiap string menjadi kapital
 * 5. Menggabungkan kedua string
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-11
 */

public class Strings {
	
	/**
	 * <h2>Sum Method</h2>
	 * Method ini digunakan untuk menghitung banyak 
	 * karakter dari dua string yang diterima
	 * @param textA , parameter untuk string pertama
	 * @param textB , parameter untuk string kedua
	 * @return sum , mengembalikan nilai dari jumlah banyaknya karakter.
	 */
	public int sum(String textA, String textB) {
		int sum = textA.length() + textB.length();
		return sum;
	} 
	
	/**
	 * <h2>Check Method</h2>
	 * Method ini digunakan untuk mengecek diantara 2 string apakah 
	 * string pertama secara leksikal lebih besar dari string pertama
	 * dengan cara membandingkan nilai ascii dari tiap karakter yang dicek
	 * @param textA , parameter untuk string pertama
	 * @param textB , parameter untuk string kedua
	 * @return "Yes" , mengembalikan Yes jika string pertama lebih besar
	 * @return "No" , mengembalikan No jika string pertama tidak lebih besar
	 */
	public String check(String textA, String textB) {
		int asciiA = 0;		// variabel menampung nilai ascii untuk string pertama
		int asciiB = 0;		// variabel menampung nilai ascii untuk string kedua
		int i = 0;			// variabel iteration untuk indeks string
		while(asciiA == asciiB) {				// cek terus jika nilai ascii sama, jika beda berhenti
			asciiA = (int) textA.charAt(i);
			asciiB = (int) textB.charAt(i);
			i++ ;
		}
		if(asciiA > asciiB) {	// pengecekkan apakah ascii string yang lebih besar 
			return "Yes";		//untuk menentukan nilai kembalian
		} else {
			return "No";
		}		
	}
	
	/**
	 * <h2>Output Method</h2>
	 * Method ini digunakan untuk mengubah huruf pertama dari tiap string menjadi kapital
	 * serta menggabungkan kedua string menjadi satu baris
	 * @param textA , parameter untuk string pertama
	 * @param textB , parameter untuk string kedua
	 * @return output , mengembalikan string yang sudah digabungkan dan sudah diubah huruf 
	 * pertamanya menjadi kapital
	 */
	public String Output(String textA, String textB) {
		String output = textA.substring(0,1).toUpperCase() + textA.substring(1) + " " + 
				textB.substring(0,1).toUpperCase() + textB.substring(1);
		return output;
	}

	/**
	 * <h2>Program Utama</h2>
	 * Ini adalah program utama
	 * Penerimaan input, pemanggilan method, dan penampilan hasil
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String A = input.next();
		String B = input.next();
		Strings obj = new Strings();
		int totalLength = obj.sum(A, B);
		String isLarger = obj.check(A, B);
		String output = obj.Output(A, B);
		System.out.println(totalLength);
		System.out.println(isLarger);
		System.out.println(output);
	}

}

