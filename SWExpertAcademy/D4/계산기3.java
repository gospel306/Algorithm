import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t < 11; t++) {
			int num = sc.nextInt();
			String postFix = "";
			String line = sc.next();
			String postfix = in2post(line);
			int result = calcPost(postfix);
			System.out.println("#" + t + " " + result);
		}

	}

	// 후위표기법 수식을 계산해서 결과값을 리턴하는 메소드
	static int calcPost(String postfix) {
		Stack<Integer> numstack = new Stack<>();
		int n1, n2;
		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);
			if (ch >= '0' && ch <= '9')
				numstack.push(ch - '0');
			else {
				n1 = numstack.pop();
				n2 = numstack.pop();
				switch (ch) {
				case '+':
					numstack.push(n1 + n2);
					break;
				case '-':
					numstack.push(n1 - n2);
					break;
				case '*':
					numstack.push(n1 * n2);
					break;
				case '/':
					numstack.push(n1 / n2);
					break;
				}
			}
		}
		int result = numstack.pop();
		return result;
	}

	// 중위표기법(infix) 수식을 후위표기법(postfix) 문자열로 변환해서 리턴하는 메소드
	static String in2post(String input) {
		String postfix = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= '0' && ch <= '9')
				postfix += ch;
			else if (ch == ')') {
				char tmp;
				while ((tmp = stack.pop()) != '(')
					postfix += tmp;
			} else {// '(','+','*','-','/'
				while (!stack.isEmpty() && ch != '(' && getProiority(stack.peek()) >= getProiority(ch)) {// 스택 젤 위에 애가
																											// 나보다 같거나
																											// 높으면 pop함
					postfix += stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty())
			postfix += stack.pop();

		return postfix;
	}

	// 특정 연산자의 우선순위를 숫자로 리턴하는 메소드
	static int getProiority(char c) {
		if (c == '(')
			return 1;
		else if (c == '+')
			return 2;
		else if (c == '-')
			return 2;
		else if (c == '*')
			return 3;
		else
			return 3;
	}
}
