import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			long N = sc.nextLong();
			long A = sc.nextLong();
			long B = sc.nextLong();
			long ans = Long.MAX_VALUE;
			for(int R = 1;R <= N;R++) 
				for(int C = 1;R*C <= N;C++) {
					long tmp = A*Math.abs(R-C)+B*(N-R*C);
					if(tmp > 0 && tmp < ans)
						ans = tmp;
				}
			System.out.println("#"+testcase+" "+ans);
		}
	}
}
