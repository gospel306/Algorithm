import java.util.Scanner;

public class Solution {
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int t = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			result = N;
			dfs(N, M, 1);
			System.out.printf("#%d %d\n",t,result);
		}
	}

	static void dfs(int N, int M, int depth) {
		if (M == depth)
			return;
		result *= N;
		dfs(N, M, depth + 1);
	}
}
