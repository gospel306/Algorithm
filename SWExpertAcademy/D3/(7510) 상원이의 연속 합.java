import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int N = sc.nextInt();
			int ans = 0;
			for(int i = 0;i < N;i++) {
				int A = 2*N - i*(i+1);
				int B = 2*(i+1);
				if(A <= 0)
					break;
				if(A%B == 0)
					ans++;
			}
			System.out.println("#"+testcase+" "+ans);
		}
	}
}
