import junit.framework.TestCase;

public class TestANDEquation extends TestCase {

	public void test1() {
		int[] test = { 1, 3, 5 };
		assertEquals(1, ANDEquation.restoreY(test));
	}

	public void test2() {
		int[] test = { 31, 7 };
		assertEquals(-1, ANDEquation.restoreY(test));
	}

	public void test3() {
		int[] test = { 31, 7, 7 };
		assertEquals(7, ANDEquation.restoreY(test));
	}

	public void test4() {
		int[] test = { 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0,
				0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 };
		assertEquals(0, ANDEquation.restoreY(test));
	}

	public void test5() {
		int[] test = { 191411, 256951, 191411, 191411, 191411, 256951, 195507,
				191411, 192435, 191411, 191411, 195511, 191419, 191411, 256947,
				191415, 191475, 195579, 191415, 191411, 191483, 191411, 191419,
				191475, 256947, 191411, 191411, 191411, 191419, 256947, 191411,
				191411, 191411 };
		assertEquals(191411, ANDEquation.restoreY(test));
	}

	public void test6() {
		int[] test = { 1362, 1066, 1659, 2010, 1912, 1720, 1851, 1593, 1799,
				1805, 1139, 1493, 1141, 1163, 1211 };
		assertEquals(-1, ANDEquation.restoreY(test));
	}

	public void test7() {
		int[] test = { 2, 3, 7, 19 };
		assertEquals(-1, ANDEquation.restoreY(test));
	}
}
