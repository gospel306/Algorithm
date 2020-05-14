import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] M = new int[N];
			double result = 0.0;
			for (int i = 0; i < M.length; i++)
				M[i] = sc.nextInt();
			Arrays.sort(M);
			for (int i = M.length - K; i < M.length; i++)
				result = (result + (double) M[i]) / 2.0;
			System.out.printf("#%d %.6f\n",t, result);
		}
	}
}
