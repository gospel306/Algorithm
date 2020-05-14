import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> card = new LinkedList<Integer>();
		for(int i = 1;i <= n;i++) {
			card.add(i);
		}
		while(card.size() != 1) {
			card.poll();
			card.add(card.poll());
		}
		System.out.println(card.poll());
	}
}
