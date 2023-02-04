package pro;

public class ArrTets {


	public static void main(String[] args) {
		// for (int i = 0; i < 10; i++) {
			System.out.println(intTobase62(4000));
		// }
		// base3ToInt("BBA");
	}

	private static String intTobase62(int id) {  // int to base3
		// id = 64;
		String[] base62 = { "0","1","2","3","4","5","6","7","8","9",
			"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
			"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

		String s = "";

		int share = 0;

		while ((id/62) > 1) {     // 64
			int remain = id % 62;
			s = remain + s; // s = 2

			share = id / 62;
		}

		return "";
	}

	private static String base3ToInt(String encodedUrl) {
		String[] base = {"A", "B", "C"};

		// "BBA"
		System.out.println(encodedUrl);

		for (int i = encodedUrl.length()-1; i >= 0 ; i--) {
			System.out.print(encodedUrl.charAt(i));
		}
		System.out.println();
		return "";
	}
}