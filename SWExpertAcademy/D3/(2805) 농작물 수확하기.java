import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int size = sc.nextInt();
			int[][] farm = new int[size][size];
			String num;
			int result = 0;

			for (int i = 0; i < farm.length; i++) {
				num = sc.next();
				for (int j = 0; j < farm[i].length; j++) {
					farm[i][j] = num.charAt(j) - '0';
					result += farm[i][j];
				}
			}

			for (int i = 0; i < farm.length / 2 + 1; i++) {
				for (int j = farm.length / 2 - 1 - i; j >= 0; j--)
					result -= farm[i][j];
			}
			for (int i = 0; i < farm.length / 2 + 1; i++)
				for (int j = farm.length - 1; j > farm.length / 2 + i; j--)
					result -= farm[i][j];
			for (int i = farm.length - 1; i > farm.length / 2; i--)
				for (int j = 0; j < farm.length / 2 - (farm.length - 1 - i); j++)
					result -= farm[i][j];
			for (int i = farm.length - 1; i > farm.length / 2; i--)
				for (int j = farm.length - 1; j > farm.length / 2 + (farm.length - 1 - i); j--)
					result -= farm[i][j];
			System.out.println("#"+t+" "+result);
		}
	}
}
