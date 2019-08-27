import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			String result = "";
			for(int i = 0;i < line.length();i++) {
				if(line.charAt(i) != 'a'&&line.charAt(i) != 'e'&&line.charAt(i) != 'i'&&line.charAt(i) != 'o'&&line.charAt(i) != 'u')
					result += line.charAt(i);
			}
			System.out.println("#"+t+" "+result);
		}
	}
}
