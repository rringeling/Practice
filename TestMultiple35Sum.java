import java.math.BigInteger;

import junit.framework.TestCase;

public class TestMultiple35Sum extends TestCase {

	public void testMultiple35Sum() {
		Multiple35Sum m = new Multiple35Sum();
		assertEquals(23, m.getSum(10));
		assertEquals(2318, m.getSum(100));
		assertEquals(233168, m.getSum(1000));
	}

	public void testFib() {
		EvenFibonacci fib = new EvenFibonacci();
		assertEquals(44, fib.getSum(88));
		assertEquals(4613732, fib.getSum(4000000));
	}
	
	public void testLargestFactor() {
		LargestPrimeFactor lpf = new LargestPrimeFactor();
		assertEquals(29, lpf.getLargest(13195));
		assertEquals(6857, lpf.getLargest(600851475143L));
		assertEquals(29, lpf.getLargest(29));
		assertEquals(7, lpf.getLargest(28));
		//uncommented because its a slow test, mostly done for fun
		//assertEquals(new BigInteger("52723356564838537"), lpf.getBigger(new BigInteger("9346163971535797776916")));
	}
	
	public void testPalindrome() {
		Palindrome p = new Palindrome();
		assertEquals(9009, p.findPal(2));
		assertEquals(906609, p.findPal(3));
		//assertEquals(99000099, p.findPal(4));
	}
	
	public void testSmallestMultiple() {
		SmallestMultiple s = new SmallestMultiple();
		assertEquals(1, s.findSmallestMultiple(1));
		assertEquals(2, s.findSmallestMultiple(2));
		assertEquals(6, s.findSmallestMultiple(3));
		assertEquals(12, s.findSmallestMultiple(4));
		assertEquals(60, s.findSmallestMultiple(5));
		assertEquals(60, s.findSmallestMultiple(6));
		assertEquals(420, s.findSmallestMultiple(7));
		assertEquals(840, s.findSmallestMultiple(8));
		assertEquals(2520, s.findSmallestMultiple(9));
		assertEquals(2520, s.findSmallestMultiple(10));
		assertEquals(232792560, s.findSmallestMultiple(20));
	}
}
