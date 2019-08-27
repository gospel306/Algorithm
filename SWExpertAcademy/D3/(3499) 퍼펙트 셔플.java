import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {	
			int N = sc.nextInt();
			String[] card = new String[N];
			for(int i = 0;i <N;i++) {
				card[i] = sc.next();
			}
			String[] shuffle = new String[N];
			for(int i = 0;i < N;i++) {
				if(i%2 == 0)
					shuffle[i] = card[i/2];
				else
					if(N%2 == 0)
						shuffle[i] = card[card.length/2+i/2];
					else
						shuffle[i] = card[card.length/2+i/2+1];
			}
			System.out.printf("#%d ",t);
			for(int i = 0;i < N;i++) {
				System.out.printf("%s ",shuffle[i]);
			}
			System.out.println();
		}
	}
}
