/**
 * Problem Statement
 * 
 * An AND-equation is an equation that looks like this:
 * 
 * X[0] AND X[1] AND ... AND X[N-1] = Y
 * 
 * Here X[i] and Y are non-negative integers.
 * 
 * You are given an A that contains exactly N+1 elements. Your task is to
 * construct an AND-equation using each element of A exactly once. (That is, N
 * of them will be on the left hand side of the AND-equation and the remaining
 * one will be on the right hand side.) If this is possible, return the value of
 * Y in this AND-equation. If no AND-equation can be constructed, return -1. (It
 * can be shown that for each A there is at most one possible value Y, so the
 * return value is always defined correctly.)
 **/
public class ANDEquation {

	public static int restoreY(int[] A) {
		int total;
		//first pick a Y value
		for (int indexY = 0; indexY < A.length; indexY++) {
			//special cases
			if (indexY == 0) {
				total = A[1];
			} else {
				total = A[0];
			}
			//add rest of elements using AND operator
			for (int i = 0; i < A.length; i++) {
				if (indexY != i) {
					total = total & A[i];
				}
			}
			if (total == A[indexY]) {
				//we have a match
				return total;
			}
		}
		//no matches
		return -1;
	}	
}