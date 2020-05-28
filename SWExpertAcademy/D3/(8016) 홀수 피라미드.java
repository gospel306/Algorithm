import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			long N = sc.nextInt();
			long left = (2*N*N)-(4*N)+3;
			long right = (2*N*N)-1;		
			System.out.println("#"+testcase+" "+left+" "+right);
		}
	}
}
