import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int result = 0;
		for(int i = 0;i < testcase;i++) {
			for(int j = 0;j < 10;j++) {
				int num = sc.nextInt();
				if(result < num)
					result = num;
			}
			System.out.printf("#%d %d\n", (i+1),result);
			result = 0;
		}
	}
}
