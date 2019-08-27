import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int result = N + 3;
			for (int i = 0; i < M - 1; i++) {
				result += month[i];
			}
			result %= 7;
			System.out.printf("#%d %d\n",t,result);
		}
	}
}
