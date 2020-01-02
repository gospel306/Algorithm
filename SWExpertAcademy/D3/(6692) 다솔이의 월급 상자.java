import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int N = sc.nextInt();
			double result = 0;
			double p;
			int x;
			for (int i = 0; i < N; i++) {
				p = sc.nextDouble();
				x = sc.nextInt();
				result += p * x;
			}
			System.out.format("#%d %.06f\n",t, result);
		}
	}
}
