import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] decimal = { 2, 3, 5, 7, 11 };
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int num = sc.nextInt();
			int[] number = new int[5];
			while (num != 1) {
				for (int i = 0; i < decimal.length; i++)
					if (num % decimal[i] == 0) {
						number[i]++;
						num /= decimal[i];
					}
			}
			System.out.print("#"+t+" ");
			for (int i = 0; i < number.length; i++)
				System.out.print(number[i] + " ");
			System.out.println();
		}
	}
}
