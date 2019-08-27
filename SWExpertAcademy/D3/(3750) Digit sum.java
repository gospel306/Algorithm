import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			String line = sc.next();
			int result;
			while(line.length() > 1) {
				result = 0;
				for(int i = 0;i < line.length();i++) {
					result += line.charAt(i) -'0';
				}
				line = result+"";
			}
			System.out.println("#"+t+" "+line);
		}
	}
}
