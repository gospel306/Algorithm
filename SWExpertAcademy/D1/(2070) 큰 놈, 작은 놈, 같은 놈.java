import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i = 0;i<testcase;i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			if(first > second)
				System.out.printf("#%d >\n", (i+1));
			else if(first < second)
				System.out.printf("#%d <\n", (i+1));
			else
				System.out.printf("#%d =\n", (i+1));
		}
	}
}
