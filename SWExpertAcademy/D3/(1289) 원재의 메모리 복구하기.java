import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			int[] num = new int[line.length()];
			int[] check = new int[line.length()];
			for (int i = 0; i < num.length; i++)
				num[i] = line.charAt(i) - '0';
			int count = 0;
			for (int i = 0; i < num.length; i++) {
				if (num[i] != 0) {
					for (int j = i; j < num.length; j++) {
						if (num[j] == 1)
							num[j] = 0;
						else
							num[j] = 1;
					}
					count++;
				}
				if (num == check)
					break;
			}
			System.out.println("#"+t+" "+count);
		}
	}
}
