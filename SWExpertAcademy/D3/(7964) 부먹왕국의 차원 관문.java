import java.util.Scanner;

public class Solution {
	static int N,D,result;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		arr = new int[300002];
		arr[0] = 1;
		for(int t = 1;t <= testcase;t++) {
			N = sc.nextInt();
			D = sc.nextInt();
			result = 0;
			int i;
			for(i = 1;i <= N;i++)
				arr[i] = sc.nextInt();
			
			arr[i] = 1; 
			solution(0,0);
			System.out.println("#"+t+" "+result);
		}
	}
	public static void solution(int depth,int count) {
		if(depth >= N+1) {
			result = count;
			return;
		}
		int num = depth;
		while(num<N+1) {
			if(arr[num] == 1)
				break;
			num++;
		}
		count += (num-depth)/D;
		solution(num+1,count);
	}
}
