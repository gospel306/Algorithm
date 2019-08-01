import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			long Aline = sc.nextLong();
			long Bline = sc.nextLong();		
			long result = (long) Math.pow(Aline/Bline, 2);
			System.out.println("#"+t+" "+result);
		}
	}
}
