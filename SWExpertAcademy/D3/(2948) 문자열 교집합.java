import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			HashMap<String, Integer> hash = new HashMap<>();
			int ans = 0;
			for (int i = 0; i < N; i++) {
				String s = sc.next();
				if (hash.containsKey(s)) {
					hash.put(s, hash.get(s) + 1);
					ans++;
				} else
					hash.put(s, 1);
			}
			for (int i = 0; i < M; i++) {
				String s = sc.next();
				if (hash.containsKey(s)) {
					hash.put(s, hash.get(s) + 1);
					ans++;
				} else
					hash.put(s, 1);
			}
			System.out.println("#" + testcase + " " + ans);
		}
	}
}
