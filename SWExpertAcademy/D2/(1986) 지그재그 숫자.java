import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int num = sc.nextInt();
			int sum = 0;
			for(int i = num;i > 0;i--)
				if(i%2 == 1)
					sum += i;
				else
					sum -= i;
			System.out.printf("#%d %d\n", t,sum);
		}
	}
}
