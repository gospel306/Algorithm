import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int N = sc.nextInt();
			System.out.printf("#%d ",t);
			for (int i = 0; i < N; i++) {
				System.out.printf("1/");
				System.out.printf("%d ", N);
			}
			System.out.println();
		}
	}
}
