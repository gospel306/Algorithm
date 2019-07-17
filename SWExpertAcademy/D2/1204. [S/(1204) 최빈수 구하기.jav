import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int num,number,result = 0;
		int n = 0;
		while(n < testcase) {
			num = sc.nextInt();
			int max = 0;
			int[] sum = new int[101];
			for(int i = 0;i < 1000;i++) {
				number = sc.nextInt();
				sum[number]++;
				if(max < sum[number])
					max = sum[number];
			}
			for(int i=0; i < 101; i++) {
				if(max == sum[i])
					result = i;
			}
			System.out.printf("#%d %d\n",num,result);
			n++;
		}
	}
}
