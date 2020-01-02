import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int length = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int fly = sc.nextInt();
			double time = (double)length/(double)(A+B);
			double result = time*(double)fly;
			System.out.printf("#%d %.10f",t,result);
		}
	}
}
