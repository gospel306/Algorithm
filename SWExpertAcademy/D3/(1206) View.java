import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 1;t < 11;t++) {
			int N = sc.nextInt();
			int[] field = new int[N+4];
			for(int i = 2;i < N+2;i++)
				field[i] = sc.nextInt();
			int max = 0;
			for(int i = 2;i < N+2;i++) {
				int count = 0;
				if(field[i] > field[i-1] && field[i] > field[i-2] && field[i] > field[i+1] && field[i] > field[i+2]) {
					count = Math.min(field[i] - field[i-1],Math.min(field[i] - field[i-2], Math.min(field[i] - field[i+1], field[i] - field[i+2])));
					max += count;
				}
			}
			System.out.println("#"+t+" "+ max);
		}
	}
}
