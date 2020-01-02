import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] box = new int[N];
			for (int i = 0; i < Q; i++) {
				int L = sc.nextInt();
				int R = sc.nextInt();
				for (int j = L - 1; j < R; j++) {
					box[j] = i + 1;
				}
			}
			System.out.print("#"+t+" ");
			for(int i = 0;i < box.length;i++)
				System.out.print(box[i]+" ");
			System.out.println();
		}
	}
}
