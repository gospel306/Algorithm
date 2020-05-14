import java.util.Scanner;

public class Solution {
	static int min = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int n = sc.nextInt();
			int[][] point = new int[n + 2][2];
			min = 0;
			point[0][0] = sc.nextInt();
			point[0][1] = sc.nextInt();
			point[n + 1][0] = sc.nextInt();
			point[n + 1][1] = sc.nextInt();
			for (int i = 1; i < n + 1; i++) {
				point[i][0] = sc.nextInt();
				point[i][1] = sc.nextInt();
			}
			dfs(point, 1);
			System.out.printf("#%d %d\n",t,min);
		}
	}

	static void dfs(int[][] point, int depth) {
		if (point.length - 1 == depth) {
			int result = 0;
			for (int i = 1; i < point.length; i++) {
				result += Math.abs(point[i][0] - point[i - 1][0]) + Math.abs(point[i][1] - point[i - 1][1]);
			}
			if (min == 0 || min > result)
				min = result;
			return;
		}
		for (int i = depth; i < point.length - 1; i++) {
			swap(point, i, depth);
			dfs(point, depth + 1);
			swap(point, i, depth);
		}
	}

	static void swap(int[][] point, int i, int j) {
		int tmp = point[i][0];
		point[i][0] = point[j][0];
		point[j][0] = tmp;
		tmp = point[i][1];
		point[i][1] = point[j][1];
		point[j][1] = tmp;
	}
}
