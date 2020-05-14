import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			int count = 0;
			while (line.length() > 1) {
				line = ((line.charAt(0) - '0') + (line.charAt(1) - '0')) + line.substring(2, line.length());
				count++;
			}
			System.out.printf("#%d ",t);
			if (count % 2 == 0)
				System.out.println("B");
			else
				System.out.println("A");
		}
	}
}
