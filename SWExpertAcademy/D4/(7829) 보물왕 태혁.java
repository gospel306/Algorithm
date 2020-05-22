import java.util.Scanner;

public class Solution7829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int answer = 0;
			int P = sc.nextInt();
			if(P == 1) {
				int n = sc.nextInt();
				answer = n*n;
			}else {
				int min = Integer.MAX_VALUE;
				int max = 0;
				for(int i = 0;i < P;i++) {
					int n = sc.nextInt();
					if(n < min)
						min = n;
					if(n > max)
						max = n;
				}
				answer = min*max;
			}
			System.out.println("#"+testcase+" "+answer);
		}
	}
}
