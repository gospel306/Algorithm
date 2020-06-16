import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		int[] arr = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		for(int tc = 1;tc <=TC;tc++) {
			String s = sc.next();
			String t = sc.next();
			String ans = "DIFF";
			if(s.length() == t.length()) {
				boolean check = true;
				for(int i = 0;i < s.length();i++)
					if(arr[s.charAt(i)-'A'] != arr[t.charAt(i)-'A']) {
						check = false;
						break;
					}
				if(check)
					ans = "SAME";
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
}
