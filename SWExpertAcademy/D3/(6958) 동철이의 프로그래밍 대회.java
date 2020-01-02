import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];
			int n = 0;
			for(int i=0;i < N;i++) {
				for(int j=0;j < M;j++) {
					int num = sc.nextInt();
					if(num == 1)
						arr[i]++;
				}
				if(n <arr[i])
					n = arr[i];
			}
			int count = 0;
			for(int i = 0;i < N;i++) {
				if(n == arr[i])
					count++;
			}
			System.out.println("#"+t+" "+count+" "+n);	
		}
	}
}
