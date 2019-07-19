import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 1;t < 11;t++) {
			int N = sc.nextInt();
			String line = sc.next();
			Stack<Integer> stack = new Stack<>();
			for(int i = 0;i<N;i++) {
				if(stack.isEmpty())
					stack.push(line.charAt(i) - '0');
				else
					if(stack.peek() == line.charAt(i) - '0') {
						stack.pop();
					}else
						stack.push(line.charAt(i) - '0');
			}
			String result = "";
			while(!stack.isEmpty()) {
				result = stack.pop() + result;
			}
			System.out.printf("#%d %s\n",t,result);
		}
	}
}
