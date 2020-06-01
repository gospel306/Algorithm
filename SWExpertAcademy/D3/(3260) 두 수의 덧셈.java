import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			BigInteger A = sc.nextBigInteger();
			BigInteger B = sc.nextBigInteger();

			System.out.println("#"+testcase+" "+A.add(B));
		}
	}
}
