import java.util.Arrays;
import java.util.Scanner;

public class Solution9778 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] card = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int[] num = new int[card.length];
		int T = sc.nextInt();
		for(int testcase = 1;testcase<= T;testcase++) {
			int N = sc.nextInt();
			int sum = 0;
			Arrays.fill(num, 4);
			for(int i = 0;i < N;i++) {
				int a = sc.nextInt();
				num[a+1] -= 1;
				sum += a;
				
			}
			int over = 0;
			int in = 0;
			for(int i = 0;i < num.length;i++) {
				if(num[i] != 0) {
					if(sum+card[i] > 21)
						over++;
					else
						in++;
				}
			}
			if(over >= in)
				System.out.println("#"+testcase+" STOP");
			else
				System.out.println("#"+testcase+" GAZUA");
		}
	}
}
