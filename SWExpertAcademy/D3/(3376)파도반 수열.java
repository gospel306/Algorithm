import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		long[] tri = new long[101];
		tri[0] = 1;
		tri[1] = 1;
		tri[2] = 1;
		tri[3] = 1;
		tri[4] = 2;
        tri[5] = 2;
		for (int i = 6; i < tri.length; i++) {
			tri[i] = tri[i - 1] + tri[i - 5];
		}
		for (int t = 1; t <= testcase; t++) {
			int N = sc.nextInt();
			System.out.printf("#%d %d\n",t,tri[N]);
		}
	}
}
