import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 0;t < testcase;t++) {
			int day = sc.nextInt();
			int[] money = new int[day];
			int max = 0;
            long result = 0;
			for(int i = 0;i < money.length;i++) {
				money[i] = sc.nextInt();
			}
			for(int i = money.length - 1;i >= 0;i--) {
				if(max < money[i])
					max = money[i];
				result += max - money[i];
			}
			System.out.printf("#%d %d\n",t+1,result);
		}
	}
}
