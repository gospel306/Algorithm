import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int TC = 1;TC <= testcase;TC++) {
			long N = sc.nextLong();
			long A = sc.nextLong();
			long B = sc.nextLong();
			if((N < 2 && A!=B) || A > B) {
				System.out.println("#"+TC+" 0");
			}else {
				long answer = 1 + (N-2)*(B-A);
				System.out.println("#"+TC+" "+answer);
			}
		}
	}
}
