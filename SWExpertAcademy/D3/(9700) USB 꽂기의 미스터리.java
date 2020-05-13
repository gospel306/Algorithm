import java.util.Scanner;

public class Solution9700 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			double p = sc.nextDouble();
			double q = sc.nextDouble();
			double s1 = (1-p)* q;
			double s2 = p*(1-q)*q;
			if(s1 < s2)
				System.out.println("#"+testcase +" YES");
			else
				System.out.println("#"+testcase+" NO");
		}
	}
}
