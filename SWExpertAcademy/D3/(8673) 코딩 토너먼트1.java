import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution8673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int sum = 0;
			Queue<Integer> q = new LinkedList<>();
			int K = sc.nextInt();
			for(int i = 0;i < Math.pow(2, K);i++) {
				int n = sc.nextInt();
				q.add(n);
			}
			while(q.size()>1) {
				int a = q.poll();
				int b = q.poll();
				sum += Math.abs(a-b);
				if(a > b)
					q.add(a);
				else
					q.add(b);
			}
			System.out.println("#"+testcase+" "+ sum);
		}
	}
}
