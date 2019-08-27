import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t<=testcase;t++) {
			long L = sc.nextLong();
			long U = sc.nextLong();
			long X = sc.nextLong();
			long result = 0;
			if(X > U)
				result = -1;
			else if(X < L) {
				result = L - X;
			}else
				result = 0;
			System.out.println("#"+t+" "+result);
		}
	}
}
