import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N+1][N+1];
		int[] isconnect = new int[N+1];
		int result = 0;
		for(int i = 0;i < arr.length;i++)
			Arrays.fill(arr[i], 124751);
		for(int i = 0;i < M;i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr[s][e] = 1;
		}
		for(int k = 1;k <=N;k++) {
			for(int i = 1;i <=N;i++) {
				for(int j = 1;j <=N;j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j])
						arr[i][j] = arr[i][k]+arr[k][j];
				}
			}
		}
		for(int i = 1;i <= N;i++) {
			for(int j = 1;j <= N;j++) {
				if(arr[i][j] != 124751) {
					isconnect[i]++;
					isconnect[j]++;
					if(isconnect[i] == N-1)
						result++;
					if(isconnect[j] == N-1)
						result++;
				}
			}
		}
		System.out.println(result);
	}
}
