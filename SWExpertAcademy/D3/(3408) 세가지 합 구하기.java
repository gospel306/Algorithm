import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t<=testcase;t++) {
			long N = sc.nextLong();
			long S1 = N*(N+1)/2;
			long S3 = S1 * 2;
			long S2 = S3 - N;
			System.out.printf("#%d %d %d %d\n",t,S1,S2,S3);
		}
	}

}
