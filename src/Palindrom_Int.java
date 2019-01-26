
public class Palindrom_Int {

	public static void main(String[] args) {
		System.out.println(isPalindrom(1221));
		System.out.println(isPalindrom(1223));
		System.out.println(isPalindrom(44444));
	}

	public static boolean isPalindrom(int number) {
		
		boolean isPalindrom = false;
		String intToString = Integer.toString(number);
		int laengeNumber = intToString.length();
		
		if (laengeNumber % 2 != 0) {
			return false;
		}
		
		for (int i = 0; i < (intToString.length() / 2); i++) {
			if (intToString.charAt(i) == intToString.charAt(laengeNumber-1)) {
				isPalindrom = true;
			}
			else {
				return false;
			}
			laengeNumber--;
		}
		
		return isPalindrom;
		
		
			

	}

}
