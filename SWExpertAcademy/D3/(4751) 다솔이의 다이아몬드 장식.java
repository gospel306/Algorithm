import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			String line1 = "";
			String line2 = "";
			String line3 = "";
			for (int i = 0; i < line.length(); i++) {
				line1 += "..#.";
				line2 += ".#.#";
				line3 += "#." + line.charAt(i) + ".";
			}
			line1 += ".";
			line2 += ".";
			line3 += "#";
			for(int i = -2;i < 3;i++) {
				if(Math.abs(i) == 2)
					System.out.println(line1);
				else if(Math.abs(i) == 1)
					System.out.println(line2);
				else
					System.out.println(line3);
			}
		}
	}
}
