/**
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * Solution takes any int N as upper limit.
 * 
 * @author Robert Ringeling
 * 
 */
public class EvenFibonacci {

	/**
	 * Get the sum of all the EVEN Fibonacci numbers between 1 and N.
	 * 
	 * @param n
	 *            the upper limit value of a Fib number.
	 * 
	 * @return the sum of all EVEN Fibonacci numbers between 1 and N.
	 */
	public int getSum(int n) {
		int sum = 0;
		int curr = 1, prev = 1, temp;
		while (curr < n) {
			temp = curr;
			curr = curr + prev;
			prev = temp;
			if (curr % 2 == 0) {
				sum = sum + curr;
			}
		}
		return sum;
	}
}
