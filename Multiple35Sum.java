/**
 * ORIGINAL PROBLEM: If we list all the natural numbers below 10 that are
 * multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * Solution will work for any int N.
 * 
 * @author Robert Ringeling
 * 
 */
public class Multiple35Sum {

	/**
	 * Get the sum of all numbers divisible by 3 or 5 between 1 and n.
	 * 
	 * @param n
	 *            the upper limit of the sequence.
	 * 
	 * @return the sum of numbers divisible by 3 or 5.
	 */
	public int getSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
