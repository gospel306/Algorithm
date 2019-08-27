import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			double Alice = (double)A/B;
			double Bob = (double)C/D;
			System.out.print("#"+t+" ");
			if(Alice == Bob)
				System.out.println("DRAW");
			else if(Alice > Bob)
				System.out.println("ALICE");
			else
				System.out.println("BOB");
		}
	}
}
