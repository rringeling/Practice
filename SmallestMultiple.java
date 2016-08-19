/**
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * Solution will find smallest number divisible evenly by 1 through n.
 * 
 * @author Robert Ringeling
 * 
 */
public class SmallestMultiple {
	
	public static void main(String[] args) {
		SmallestMultiple s = new SmallestMultiple();
		System.out.println(s.findSmallestMultiple(10));
	}
	
	public int findSmallestMultiple(int n) {
		int result = 1;
		
		while(true) {
			if (isDivisible(result, n)) {
				return result;
			}
			result++;
		}
	}
	
	public boolean isDivisible(int num, int max) {
		for (int i = 1; i <= max; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}
}