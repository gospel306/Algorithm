import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 1;t<11;t++) {
			int size = sc.nextInt();
			String line = sc.next();
			int sum = 0;
			for(int i = 0;i < line.length();i++) {
				if(line.charAt(i) != '+')
					sum += line.charAt(i) - '0';
			}
			System.out.println("#"+t+" "+sum);
		}
	}
}
