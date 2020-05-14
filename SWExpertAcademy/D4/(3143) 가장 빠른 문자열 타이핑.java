import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		for(int t = 1;t <= testcase;t++) {
			String A = sc.next();
			String B = sc.next();
			int size = B.length();
			int result = 0;
			for(int i = 0;i < A.length();i++) 
				if(i+size-1 < A.length() && A.substring(i, i+size).equals(B)) {
					result++;
					i += size-1;
				}
				else
					result++;
			System.out.println("#"+t+" "+result);
		}
	}
}
