import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			String s = sc.next();
			String a = "";
			int n = 0;
			for(int i = s.length()-1;i >= 0;i--)
				a += s.charAt(i);
			if(a.equals(s))
				n = 1;
			System.out.printf("#%d %d\n",t,n);
		}
	}
}
