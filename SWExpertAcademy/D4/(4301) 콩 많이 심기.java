import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			boolean[][] map = new boolean[N][M];
			int count = 0;
			for(int i = 0;i <N;i++) {
				for(int j = 0;j < M;j++) {
					if(!map[i][j]) {
						if(i+2 < N)
							map[i+2][j] = true;
						if(j+2 < M)
							map[i][j+2] = true;
						count++;
					}
				}
			}
			System.out.println("#"+t+" "+count);
		}
	}
}
