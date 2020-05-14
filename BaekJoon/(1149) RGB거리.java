import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[][] = new int[N+1][3];
		int d[][] = new int[N+1][3];
		for(int i = 1;i <= N;i++)
			for(int j = 0;j < 3;j++)
				a[i][j] = sc.nextInt();
		for(int i = 1;i <= N;i++) {
			d[i][0] = Math.min(d[i-1][1],d[i-1][2]) + a[i][0];
			d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + a[i][1];
			d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + a[i][2];
		}
		System.out.println(Math.min(Math.min(d[N][0], d[N][1]), d[N][2]));
	}
}
