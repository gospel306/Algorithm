import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int n = 0;
		while(n < testcase) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			n++;
			System.out.printf("#%d %d %d\n", n,a/b,a%b);
		}
	}
}
