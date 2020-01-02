import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			long distance = sc.nextInt();
			int rank;
			if (distance < 100)
				rank = 0;
			else if (distance < 1000)
				rank = 1;
			else if (distance < 10000)
				rank = 2;
			else if (distance < 100000)
				rank = 3;
			else if (distance < 1000000)
				rank = 4;
			else
				rank = 5;
			System.out.println("#"+t+" "+rank);
		}
	}
}
