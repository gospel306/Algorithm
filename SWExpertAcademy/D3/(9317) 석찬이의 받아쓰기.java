import java.util.Scanner;

public class Solution9317 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int N = sc.nextInt();
			String s1 = sc.next();
			String s2 = sc.next();
			int count = 0;
			for(int i = 0;i < N;i++) {
				if(s1.charAt(i) == s2.charAt(i))
					count++;
			}
			System.out.println("#"+testcase+" "+count);
		}
	}
}
