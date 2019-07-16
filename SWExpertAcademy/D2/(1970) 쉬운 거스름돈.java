import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int[] moneys = { 50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] moneycount = new int[moneys.length];
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int money = sc.nextInt();
			for (int i = 0; i < moneys.length; i++) {
				if (money >= moneys[i]) {
					moneycount[i] = money / moneys[i];
					money %= moneys[i];
				}
			}
            System.out.println("#"+t);
			for (int i = 0; i < moneycount.length; i++)
				System.out.print(moneycount[i] + " ");
            Arrays.fill(moneycount, 0);
            System.out.println();
		}
	}
}
