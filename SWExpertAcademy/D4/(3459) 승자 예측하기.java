import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			long N = sc.nextLong();
			long x = 1;
			boolean turn = true;
			while(N > 0) {
				N -= x;
				if(turn)
					x *= 4;
				turn = !turn;
			}
			if(turn)
				System.out.println("#"+t+" Alice");
			else
				System.out.println("#"+t+" Bob");
		}
	}
}
