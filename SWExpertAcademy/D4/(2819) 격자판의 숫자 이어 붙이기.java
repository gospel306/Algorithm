import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	static int result = 0;
	static int[] x = { 1, 0, -1, 0 };
	static int[] y = { 0, 1, 0, -1 };
	static HashSet<Integer> set;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int[][] num = new int[4][4];
			set = new HashSet<>();
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					num[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					dfs(num, i, j, 0, num[i][j]);
				}
			}
			System.out.printf("#%d %d\n",t, set.size());
		}
	}

	static void dfs(int[][] num, int a, int b, int depth, int val) {
		if (depth == 6) {
			set.add(val);
			return;
		}
		for (int i = 0; i < x.length; i++) {
			int nx = x[i] + a;
			int ny = y[i] + b;

			if (nx >= 0 && nx < 4 && ny >= 0 && ny < 4)
				dfs(num, nx, ny, depth + 1, val * 10 + num[nx][ny]);
		}

	}
}
