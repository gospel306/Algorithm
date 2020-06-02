import java.util.Scanner;

public class Main {
	static int N;
	static int[][] arr, dir = {{0,1},{-1,0},{0,-1},{1,0}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] arr = new int[300];
		int[] dp = new int[300];
		for(int i = 0;i < N;i++)
			arr[i] = sc.nextInt();
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0]+arr[1], arr[1]);
		dp[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
		for(int i = 3;i < N;i++)
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
		System.out.println(dp[N-1]);
	}
}
