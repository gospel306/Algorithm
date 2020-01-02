import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			long num = sc.nextLong();
			long a = (long) Math.round(Math.pow(num, 1.0 / 3.0));
			
			if (num == a * a * a)
				System.out.println("#"+t+" "+a);
			else
				System.out.println("#"+t+" -1");
		}
	}
}
