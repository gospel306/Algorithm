import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int T = 1;T <=testcase;T++) {
			int K = sc.nextInt();
			Stack<Integer> stack = new Stack<>();
			for(int i = 0;i < K;i++) {//0이면 stack에서 빼내기 아니면 stack에 쌓기
				int num = sc.nextInt();
				if(num != 0)
					stack.add(num);
				else if(num == 0)
					stack.pop();
			}
			int sum = 0;
			while(!stack.isEmpty())
				sum += stack.pop();	
			System.out.println("#"+T+" "+sum);
		}
	}
}
