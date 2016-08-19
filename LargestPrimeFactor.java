import java.math.BigInteger;

/**
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Solution can find the largest prime factor of any Long value n.
 * 
 * @author Robert Ringeling
 * 
 */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		/*
		 * Messing around with BigInteger for fun LargestPrimeFactor lpf = new
		 * LargestPrimeFactor(); lpf.getBigger(new
		 * BigInteger("9346163971535797776916"));
		 */
	}

	/**
	 * Get the largest prime factor by using some smart trial divisions.
	 * 
	 * @param n
	 *            the number for which we want to find the largest prime factor.
	 * @return the largest prime number that is a factor of n.
	 */
	public long getLargest(long n) {
		long i = 2;

		while (n > 1) {
			while (n % i == 0) {
				n = n / i;
			}
			i++;
			if (i * i > n && n > 1) {
				System.out.println(n); // found a prime
				break;
			}
		}
		return n;
	}

	/**
	 * Created a BigInteger version for fun. I may want to change things to make
	 * it a little more efficient, but it works fine for now.
	 * 
	 * @param bigInteger
	 *            the number for which we want to find the largest prime factor.
	 * @return the largest prime number that is a factor of n.
	 */
	public BigInteger getBigger(BigInteger bigInteger) {
		long i = 2;

		while (bigInteger.compareTo(BigInteger.valueOf(1)) == 1) {
			while (bigInteger.mod(BigInteger.valueOf(i)) == BigInteger
					.valueOf(0)) {
				bigInteger = bigInteger.divide(BigInteger.valueOf(i));
			}
			i++;
			if (BigInteger.valueOf(i * i).compareTo(bigInteger) == 1
					&& bigInteger.compareTo(BigInteger.valueOf(1)) == 1) {
				System.out.println(bigInteger);
				break;
			}
		}
		return bigInteger;
	}
}
