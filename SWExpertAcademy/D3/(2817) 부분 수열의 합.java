import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int A,K;
	static int[] num;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			A = sc.nextInt();
			K = sc.nextInt();
			num = new int[A];
			for (int i = 0; i < A; i++)
				num[i] = sc.nextInt();
			count = 0;
			permutation(0,0);
			System.out.println("#"+t+" "+count);
		}
	}
	public static void permutation(int sum,int depth) {
		if(sum > K)
			return;
		if(sum == K) {
			count++;
			return;
		}
		if(depth > A - 1)
			return;
		permutation(sum,depth+1);
		permutation(sum+num[depth],depth+1);	
	}
}
