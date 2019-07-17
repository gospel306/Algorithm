import java.util.Scanner;

public class Solution {
	static int[] num;
	static int count,max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			num = new int[N];
			max = 0;
			for(int i = 0;i < N;i++) {
				num[i] = sc.nextInt();
			}
			count = 0;
			for(int i = 0;i < N;i++) {
				count += num[i];
				if(count < 0)
					count = 0;
				if(max < count)
					max = count;
			}
			System.out.println("#"+t+" "+max);
		}
	}
}
