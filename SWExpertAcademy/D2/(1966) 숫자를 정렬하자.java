import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int size = sc.nextInt();
			int[] num = new int[size];
			for (int i = 0; i < num.length; i++)
				num[i] = sc.nextInt();
			Arrays.sort(num);
			System.out.print("#"+t+" ");
			for (int i = 0; i < num.length; i++)
				System.out.print(num[i] + " ");
			System.out.println();
		}
	}
}
