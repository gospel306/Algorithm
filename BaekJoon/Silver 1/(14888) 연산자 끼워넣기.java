import java.util.Scanner;

public class Main {
	static int[] oper,arr;
	static int N;
	static long max,min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		oper = new int[4];
		max = Long.MIN_VALUE;
		min = Long.MAX_VALUE;
		for(int i = 0;i < N;i++)
			arr[i] = sc.nextInt();
		for(int i = 0;i < 4;i++)
			oper[i] = sc.nextInt();
		solution(0,arr[0]);
		System.out.println(max);
		System.out.println(min);
	}
	static void solution(int depth,int sum) {
		if(depth == N-1) {
			if(sum > max)
				max = sum;
			if(sum < min)
				min = sum;
			return;
		}
		if(oper[0] > 0) {
			oper[0]--;
			depth++;
			solution(depth,sum+arr[depth]);
			depth--;
			oper[0]++;
		}
		if(oper[1] > 0) {
			oper[1]--;
			depth++;
			solution(depth,sum-arr[depth]);
			depth--;
			oper[1]++;
		}
		if(oper[2] > 0) {
			oper[2]--;
			depth++;
			solution(depth,sum*arr[depth]);
			depth--;
			oper[2]++;
		}
		if(oper[3] > 0) {
			oper[3]--;
			depth++;
			solution(depth,sum/arr[depth]);
			depth--;
			oper[3]++;
		}
	}
}
