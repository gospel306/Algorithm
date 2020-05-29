import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int K = sc.nextInt();
			int[] arr = new int[(int)Math.pow(2, K)-1];
			for(int i = 0;i < arr.length;i++)
				arr[i] = sc.nextInt();
			System.out.print("#"+testcase+" ");
			for(int i = 0;i < K;i++) {
				for(int j = 0;j <= i*i;j++) {
					int num = (int)(Math.pow(2, K)/Math.pow(2,i+1)-1+Math.pow(2,K-i)*j);
					if(arr.length > num)
					System.out.print(arr[num]+" ");
				}
				System.out.println();
			}
		}
	}
}
