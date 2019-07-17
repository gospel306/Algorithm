import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String num = sc.next();
			int[] number = new int[10];
			int n = Integer.parseInt(num);
			int j = 2;
			while (true) {
				int count = 0;
				char[] c = num.toCharArray();
				for (int i = 0; i < c.length; i++) {
					number[c[i] - '0']++;
				}
				for (int i = 0; i < number.length; i++)
					if (number[i] >= 1)
						count++;
				if (count == 10)
					break;
				num = Integer.toString(n * j);
				j++;
			}
			System.out.println("#"+t+" "+num);
		}
	}
}
