import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			String num = sc.next();
			int num2 = (num.charAt(num.length() - 1) - '0')%2;
			if(num2 == 0)
				System.out.println("#"+t+" Even");
			else
				System.out.println("#"+t+" Odd");
		}
	}
}
