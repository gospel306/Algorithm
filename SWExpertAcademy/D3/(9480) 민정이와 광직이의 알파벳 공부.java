import java.util.Scanner;

public class Solution9480 {
	static int answer, N;
	static int[] check;
	static boolean[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			N = sc.nextInt();
			arr = new boolean[N][26];
			check = new int[26];
			for (int i = 0; i < N; i++) {
				String word = sc.next();
				for (int j = 0; j < word.length(); j++) {
					arr[i][word.charAt(j) - 'a'] = true;
				}
			}
			answer = 0;
			dfs(0);
			System.out.println("#" + testcase + " " + answer);

		}
	}

	static void dfs(int depth) {
		if (depth == N) {
			int flag = 0;
			for (int i = 0; i < check.length; i++) {
				if (check[i] > 0)
					flag++;
			}
			if (flag == 26) {
				answer++;
			}
			return;
		}
		for (int j = 0; j < arr[depth].length; j++)
			if (arr[depth][j]) 
				check[j]++;
		dfs(depth+1);
		for (int j = 0; j < arr[depth].length; j++)
			if (arr[depth][j])
				check[j]--;
		dfs(depth+1);
	}
}
