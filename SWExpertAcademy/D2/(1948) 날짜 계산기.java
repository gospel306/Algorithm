import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();
			int result = 0;
			for (int i = month1 - 1; i < month2 - 1; i++) {
				result += month[i];
			}
			result = result - day1 + day2 + 1;
			System.out.println("#"+t+" "+result);
		}
	}
}
