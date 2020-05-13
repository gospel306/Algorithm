import java.util.Arrays;
import java.util.Scanner;

public class Solution8888 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int testcase = 1;testcase <= t;testcase++) {
			int N = sc.nextInt();
			int T = sc.nextInt();
			int P = sc.nextInt();
			int[] score = new int[T];
			int[][] test = new int[N][T];
			int[][] user = new int[N][2];
			Arrays.fill(score, N);
			sc.nextLine();
			for(int i = 0;i < N;i++) {
				char[] arr = sc.nextLine().toCharArray();
				int idx = 0;
				for(int j = 0;j < arr.length;j++) {
					if(arr[j] == '1') {
						test[i][idx]++;
						score[idx++]--;
					}else if(arr[j] == '0'){
						test[i][idx++] = 0;
					}
				}
			}
			for(int i = 0;i < N;i++) {
				int sum = 0;
				int cnt = 0;
				for(int j = 0;j < T;j++) {
					sum += score[j] * test[i][j];
					cnt += test[i][j];
				}
				user[i][0] = sum;
				user[i][1] = cnt;
			}
			P--;
			int rank = 1;
			for(int i = 0;i < N;i++) {
				if(user[i][0] > user[P][0])
					rank++;
				else if(user[i][0] == user[P][0])
					if(user[i][1] > user[P][1])
						rank++;
					else if(user[i][1] == user[P][1] && i < P)
						rank++;
			}
			System.out.println("#"+testcase+" "+user[P][0]+" "+rank);
		}
	}
}
