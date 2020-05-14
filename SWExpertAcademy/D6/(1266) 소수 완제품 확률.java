import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = { 2, 3, 5, 7, 11, 13, 17 };
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double sumA = 0, sumB = 0;
			for (int j = 0; j < s.length; j++) {
				double resA = 1, resB = 1;
				int a = doCombination(18, s[j]);
				resA *= a;
				resB *= a;
				for (int i = 0; i < s[j]; i++) {
					resA *= A / 100.0;
					resB *= B / 100.0;
				}
				for (int i = s[j]; i < 18; i++) {
					resA *= (100 - A) / 100.0;
					resB *= (100 - B) / 100.0;
				}
				sumA += resA;
				sumB += resB;
			}
			double result = 1 - ((1 - sumA) * (1 - sumB));
			System.out.printf("#%d %.6f\n",t, result);
		}
	}

	static int doCombination(int n, int r) {
		int result = 1;
		if (r > n / 2)
			r = n - r;
		for (int i = n; i > n - r; i--)
			result *= i;
		for (int i = 1; i <= r; i++)
			result /= i;
		return result;
	}
}
