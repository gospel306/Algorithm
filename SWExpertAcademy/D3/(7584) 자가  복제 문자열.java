import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			long N = sc.nextLong();
			int ans = 0;
			while(N > 0) {
				if(N%2 == 1) 
					N = (N-1)/2;
				if(N%4 == 0) {
					ans = 0;
					break;
				}else if(N%2 == 0) {
					ans = 1;
					break;
				}
			}
			System.out.println("#"+testcase+" "+ans);
		}
	}
}
