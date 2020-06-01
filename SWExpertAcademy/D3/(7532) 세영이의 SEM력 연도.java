import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			int M = sc.nextInt();
			int i = 0;
			int ans = 0;
			while(true) {
				int N = S + i*365;
				if(N%24 == E%24 && N%29 == M%29) {
					ans = N;
					break;
				}
				i++;
			}
			System.out.println("#"+testcase+" "+ans);
		}
	}
}
