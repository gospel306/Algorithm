import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 0; t < 10; t++) {
			int testcase = sc.nextInt();
			int[] sumrow = new int[100];
			int[] sumcol = new int[100];
			int a = 0, b = 0, num;
			int result = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					num = sc.nextInt();
					if (i == j)
						a += num;
					if (i == 100 - 1 - j)
						b += num;
					sumrow[i] += num;
					sumcol[j] += num;
				}
			}
			for (int i = 0; i < 100; i++) {
				if (result < sumrow[i])
					result = sumrow[i];
				if (result < sumcol[i])
					result = sumcol[i];
			}
			if (result < a)
				result = a;
			if (result < b)
				result = b;
			System.out.println("#"+testcase+" "+result);
		}
	}
}
