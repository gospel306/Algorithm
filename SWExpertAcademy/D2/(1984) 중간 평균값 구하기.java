import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int[] num = new int[10];
			int max = 0, min = 10000,sum = 0;
			for(int i = 0;i < num.length;i++) {
				num[i] = sc.nextInt();
				if(max < num[i])
					max = num[i];
				if(min > num[i])
					min = num[i];
			}
			for(int i = 0;i < num.length;i++) {
				if(num[i] != max && num[i] != min)
					sum += num[i];
			}
			System.out.printf("#%d %d\n", t,(int)Math.round(sum/8.0));			
		}
	}
}
