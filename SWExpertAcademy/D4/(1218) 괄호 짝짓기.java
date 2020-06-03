import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {
			int size = sc.nextInt();
			Stack<Character> stack = new Stack<>();
			int check = 1;
			String line = sc.next();
			for (int i = 0; i < size; i++) {
				char c = line.charAt(i);
				if(check == 0)
					break;
				if (c == '(' || c == '{' || c == '[' || c == '<')
					stack.push(c);
				else {
					char pop = stack.pop();
					if (c == ')') {
						if (pop != '(')
							check = 0;
					} else if (c == '}') {
						if (pop != '{')
							check = 0;
					} else if (c == ']') {
						if (pop != '[')
							check = 0;
					} else if (c == '>')
						if (pop != '<')
							check = 0;
				}
			}
			System.out.println("#" + t + " " + check);
		}
	}
}
