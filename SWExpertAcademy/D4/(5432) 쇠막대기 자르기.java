import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			int result = 0;
			char[] c = line.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if (c[i] == '(')
					stack.push(c[i]);
				else if (c[i] == ')') {
					if (c[i - 1] == '(') {
						stack.pop();
						result += stack.size();
					} else {
						stack.pop();
						result++;
					}
				}
			}
			System.out.println("#"+t+" "+result);
		}
	}
}
