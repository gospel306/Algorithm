import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int hour1 = sc.nextInt();
			int min1 = sc.nextInt();
			int hour2 = sc.nextInt();
			int min2 = sc.nextInt();
			int hour = hour1 + hour2, min = min1 + min2;
			if (min > 60) {
				hour++;
				min = min - 60;
			}
			if (hour > 12)
				hour = hour - 12;
			System.out.println("#"+t+" "+hour + " " + min);
		}
	}
}
