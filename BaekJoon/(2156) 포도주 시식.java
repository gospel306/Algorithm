import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[10001];
		int[] dp = new int[10001];
		for(int i = 1;i<= n;i++)
			a[i] = sc.nextInt();
		dp[1] = a[1];
		dp[2] = a[2] + dp[1];
		for(int i = 3;i < dp.length;i++)
			dp[i] = Math.max(Math.max(dp[i-2]+a[i],a[i] + a[i-1] + dp[i-3]), dp[i-1]);
		System.out.println(dp[n]);
	}
}
