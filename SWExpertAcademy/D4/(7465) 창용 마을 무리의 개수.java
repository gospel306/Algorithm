import java.util.Scanner;

public class Solution {
	static int disjoint[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int TC = 1; TC <= testcase; TC++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			disjoint = new int[N+1];
			for (int i = 1; i <= N; i++) {
				disjoint[i] = i;
			}
			for (int m = 0; m < M; m++) {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();

				if (find(n1) != find(n2)) {
					union(n1, n2);
				}
			}
			int[] count = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				count[find(i)]++;
			}
			int ans = 0;
			for(int i = 1;i<=N;i++) {
				if(count[i]>0) {
					ans++;
				}
			}
			System.out.println("#"+TC+" "+ans);
		}
	}

	static int find(int n) {
		if (disjoint[n] == n) {
			return n;
		}
		disjoint[n] = find(disjoint[n]);
		return disjoint[n];
	}

	static void union(int n1, int n2) {
		int p1 = find(n1);
		int p2 = find(n2);

		if (p1 != p2) {
			disjoint[p1] = p2;
		}
	}
}
