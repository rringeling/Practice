/**
 * Problem statement:
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Solution will find the largest palindrome from the product of two n-digit
 * numbers.
 * 
 * @author Robert Ringeling
 * 
 */
public class Palindrome {

	public static void main(String[] args) {

	}

	/**
	 * Find the largest palindrome from the product of two n-digit numbers.
	 * 
	 * @param digits
	 *            the number of digits in the two numbers.
	 * @return the largest palindrome from the product of two n-digit numbers.
	 */
	public int findPal(int digits) {
		int limit = digits - 1;
		int maxpal = -1;
		int a = getNum(digits);
		int b, pal;
		String temp;
		
		while (numLength(a) > limit) {
			b = a;
			while (numLength(b) > limit) {
				pal = a * b;
				temp = String.valueOf(pal);
				if (isPalindrome(temp)) {
					if (maxpal < pal) {
						maxpal = pal;
					}
				}
				b--;
			}
			a--;
		}
		return maxpal;
	}
	
	/**
	 * 
	 */
	static int getNum(int n) {
		String str = "";
		
		for (int i = 0; i < n; i++) {
			str = str + 9;
		}
		return Integer.valueOf(str).intValue();
	}
	/**
	 * Check if a number is a palindrome.
	 * 
	 * @param str
	 *            the string to be checked for a palindrome.
	 * @return true if it is a palindrome, false if not.
	 */
	static boolean isPalindrome(String str) {
		int front = 0, back = str.length() - 1;
		boolean palindrome = true;
		
		while (palindrome) {
			if (str.charAt(front) == (str.charAt(back))) {
				front++;
				back--;
				if (front >= back) { // crossed indices
					break;
				}
			} else {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

	/**
	 * Check how many digits are in a number.
	 * 
	 * @param n
	 *            the number we are checking the number of digits for.
	 * @return the number of digits in the number.
	 */
	static int numLength(int n) {
		int length;
		n = Math.abs(n);
		
		for (length = 0; n > 0; ++length)
			n = n / 10;
		return length;
	}
}