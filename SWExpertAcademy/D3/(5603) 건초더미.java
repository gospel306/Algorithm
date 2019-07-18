import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int[] hay = new int[N];
			int total = 0;
			for(int i = 0;i < N;i++) {
				hay[i] = sc.nextInt();
				total += hay[i];
			}
			total /= N;
			int count = 0;
			for(int i = 0;i < N;i++) {
				if(hay[i] > total)
					count += hay[i] - total;
				else if(hay[i] < total)
					count += total - hay[i];
			}
			count /= 2;
			System.out.println("#"+t+" "+count);
		}
	}
}
