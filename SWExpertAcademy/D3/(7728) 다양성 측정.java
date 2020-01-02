import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			String X = sc.next();
			int n = X.length();
			int x = Integer.parseInt(X);
			int count = 0;
			boolean[] num = new boolean[10];
			for(int i = n-1;i >= 0;i--) {
				num[(int) (x/Math.pow(10, i))] = true;
				x = (int) (x%Math.pow(10, i));
			}
			for(int i = 0;i < num.length;i++)
				if(num[i])
					count++;
			System.out.println("#"+t+" "+count);
		}
	}
}
