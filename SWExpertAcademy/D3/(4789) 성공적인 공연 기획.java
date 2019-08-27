import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			int[] num = new int[line.length()];
			for (int i = 0; i < line.length(); i++) {
				num[i] = line.charAt(i) - '0';
			}
			int check = 0, result = 0;
			for (int i = 0; i < line.length(); i++) {
				check += num[i];
				if (check < i + 1) {
					result++;
					check++;
				}
			}
			System.out.printf("#%d %d\n",t,result);
		}
	}
}
