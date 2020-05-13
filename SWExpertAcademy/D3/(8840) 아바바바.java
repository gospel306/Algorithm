import java.util.Scanner;

public class Solution8840 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			Long L = sc.nextLong()/2;
			System.out.println("#"+testcase+" "+L*L);
		}
	}
}
