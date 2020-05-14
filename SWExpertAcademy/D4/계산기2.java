import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t < 11; t++) {
			int size = sc.nextInt();
			String line = sc.next();
			Stack<Character> stack = new Stack<>();
			String postFix = "";
			for (int i = 0; i < line.length(); i++) {
				char num = line.charAt(i);
				if (num >= '0' && num <= '9')
					postFix += num;
				else {
					if (stack.isEmpty())
						stack.push(num);
					 else if (num == '+') {
						while (!stack.isEmpty()) 
							postFix += stack.pop();
						stack.push(num);
					} else if (num == '*') {
						while (!stack.isEmpty() && stack.peek() == '*')
							postFix += stack.pop();
						stack.push(num);
					}
				}
			}
			while (!stack.isEmpty()) {
				postFix += stack.pop();
			}
			Stack<Integer> numstack = new Stack<>();
			for (int i = 0; i < postFix.length(); i++) {
				char ch = postFix.charAt(i);
				if (ch >= '0' && ch <= '9')
					numstack.push(ch - '0');
				 else if (ch == '*') {
					int n1 = numstack.pop();
					int n2 = numstack.pop();
					numstack.push(n1 * n2);
				} else if (ch == '+') {
					int n1 = numstack.pop();
					int n2 = numstack.pop();
					numstack.push(n1 + n2);
				}
			}
			int result = numstack.pop();
			System.out.println("#"+ t + " " + result);
		}
	}
}
