import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			int n = 1;
			int t = sc.nextInt();
			for (int j = 0; j < 8; j++) 
				q.offer(sc.nextInt());
			while (true) {
				if (q.peek() - n <= 0) {
					q.poll();
					q.add(0);
					break;
				}
				q.add(q.poll() - n);
				n++;
				if (n > 5)
					n = 1;
			}
			System.out.print("#"+t+" ");
			while (!q.isEmpty())
				System.out.print(q.poll() + " ");
			System.out.println();
		}
	}
}
