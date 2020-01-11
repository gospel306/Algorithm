import java.util.Scanner;

public class Solution {
	static int answer, N, M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int TC = 1;TC <= testcase;TC++) {
			N = sc.nextInt();
			M = sc.nextInt();
			int[] arr = new int[N];
			boolean[] visited = new boolean[N];
			answer = 0;
			for(int i = 0;i < N;i++)
				arr[i] = sc.nextInt();
			combination(arr, visited,0,N,2);
			if(answer == 0)
				answer = -1;
			System.out.println("#"+TC+" "+answer);
		}
	}
	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			int sum = 0;
			for(int i = 0;i < n;i++) {
				if(visited[i] == true) {
					sum += arr[i];
					if(sum > M) {
						return;
					}
				}
			}
			if(answer < sum)
				answer = sum;
			return;
		}else {
			for(int i = start; i< n;i++) {
				visited[i] = true;
				combination(arr, visited, i + 1, n, r-1);
				visited[i] = false;
			}
		}
	}
}
