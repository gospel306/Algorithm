import java.util.Scanner;

public class Solution {
	static int N;
	static int results = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			N = sc.nextInt();
			int[] result = new int[N];
			results = 0;
			backTracking(result,0);
			System.out.printf("#%d %d\n",t,results);
		}
	}
	static void backTracking(int[] arr,int n) {
		if(n == N) {
			results++;
			return;
		}
		for(int i = 0;i < N;i++) {
			arr[n] = i;
			if(isOk(arr,n)) {
				backTracking(arr,n+1);
			}
		}
	}
	static boolean isOk(int[] arr,int d) {
		for(int i = 0;i < d;i++) {
			if(arr[i] == arr[d] || Math.abs(arr[i] - arr[d]) == Math.abs(i - d))
				return false;
		}
		return true;
	}
}
