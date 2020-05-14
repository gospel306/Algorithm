import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[N];
		for(int i = 0;i < N;i++) 
			dp[i] = sc.nextInt();
		int result = dp[0];
		for(int i = 1;i < N;i++) {
			if(dp[i-1] > 0 && dp[i-1] + dp[i] > 0)
				dp[i] += dp[i-1];
			
			if(dp[i] > result)
				result = dp[i];
		}
		System.out.println(result);
	}
}
