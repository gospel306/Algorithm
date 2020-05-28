import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			String s = sc.next();
			long cnt = 1;
			int n = s.length();
			
			for(int i = 0;i < n;i++) {
				int r = 1;
				if(i == 0) {
					if(s.charAt(i) != s.charAt(i+1))
						r++;
				}else if(i == n-1) {
					if(s.charAt(i-1) != s.charAt(i))
						r++;
				}else {
					if(s.charAt(i-1)!=s.charAt(i))
						r++;
					if(s.charAt(i) != s.charAt(i+1))
						r++;
					if(r>1&& s.charAt(i-1) == s.charAt(i+1))
						r--;
				}
				cnt*=r;
				cnt %= 1000000007;
			}
			System.out.println("#"+testcase+" "+cnt);
		}
	}
}
