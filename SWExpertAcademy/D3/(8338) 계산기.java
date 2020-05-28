import java.util.Scanner;

public class Solution {
	static int max,N;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			N = sc.nextInt();
			max = 0;
			arr = new int[N];
			for(int i = 0;i < N;i++)
				arr[i] = sc.nextInt();
			solution(1,arr[0]);
			System.out.println("#"+testcase+" "+max);
		}
	}
	static void solution(int depth,int sum) {
		if(depth == N) {
			if(sum > max)
				max = sum;
			return;
		}
		solution(depth+1,sum+arr[depth]);
		solution(depth+1,sum*arr[depth]);
	}
}
