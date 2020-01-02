import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			for(int i = 0;i < N;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			int P = sc.nextInt();
			System.out.print("#"+t+" ");
			for(int i = 0;i < P;i++) {
				int c = sc.nextInt();
				int count = 0;
				for(int j = 0;j < N;j++)
					if(a[j] <= c && b[j] >= c)
						count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
