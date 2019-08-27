import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int[] num = new int[3];
			int result = 0;
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}
			if (num[0] != num[1] && num[0] == num[2])
				result = num[1];
			else if (num[0] != num[2] && num[0] == num[1])
				result = num[2];
			else
				result = num[0];
			System.out.println("#"+t+" "+result);
		}
	}
}
