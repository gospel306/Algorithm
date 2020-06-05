import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int[][] arr,dir = {{1,0},{-1,0},{0,1},{0,-1}};
	static int N,ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1;tc <= T;tc++) {
			N = sc.nextInt();
			arr = new int[N][N];
			for(int i = 0;i < N;i++) {
				String line = sc.next();
				for(int j = 0;j < N;j++)
					arr[i][j] = line.charAt(j) - '0';
			}
			ans = Integer.MAX_VALUE;
			solution();
			System.out.println("#"+tc+" "+ans);
		}
	}
	static void solution() {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(0,0,arr[0][0]));
		int[][] arr2 = new int[N][N];
		for(int i = 0;i < N;i++)
			Arrays.fill(arr2[i], Integer.MAX_VALUE);
		arr2[0][0] = 0;
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i = 0;i < 4;i++) {
				int dx = p.x + dir[i][0];
				int dy = p.y + dir[i][1];
				if(dx >= 0 && dx < N && dy >= 0 && dy < N) {
					int size = p.size + arr[dx][dy];
					if(arr2[dx][dy] > size) {
						arr2[dx][dy] = size;
						q.add(new Point(dx,dy,size));
						if(dx == N-1&& dy == N-1 && ans > size)
							ans = size;	
					}
				}
			}
		}
	}
	static class Point{
		int x,y,size;
		public Point(int x,int y,int size) {
			this.x = x;
			this.y = y;
			this.size = size;
		}
	}
}
