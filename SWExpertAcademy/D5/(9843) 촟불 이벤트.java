import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			long N = sc.nextLong();
			long ans = -1;
			long left = 0;
			long right = (1 << 31) -1;
			long middle = 0;
			
			while(left <= right) {
				middle = (left+right)/2;
				long tmp = (middle+1)*middle/2;
				if(tmp == N) {
					ans = middle;
					break;
				}else if(tmp > N)
					right = middle -1;
				else
					left = middle + 1;
			}
			System.out.println("#"+testcase+" "+ans);
		}
	}
}
