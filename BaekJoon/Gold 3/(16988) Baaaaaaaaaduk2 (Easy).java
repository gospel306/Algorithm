import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] arr,dir= {{1,0},{-1,0},{0,1},{0,-1}};
	static int ans = 0,N,M;
	static boolean[][] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][M];
		for(int i = 0;i < N;i++)
			for(int j = 0;j < M;j++)
				arr[i][j] = sc.nextInt();
		solution(0);
		System.out.println(ans);
	}
	static void solution(int depth) {
		if(depth == 2) {
			int n = checkBlack();
			if(ans < n)
				ans = n;
			return;
		}
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				if(arr[i][j] == 0) {
					arr[i][j] = 1;
					solution(depth+1);
					arr[i][j] = 0;
				}
			}
		}
	}
	static int checkBlack() {
		int cnt = 0;
		visit = new boolean[N][M];
		for(int i = 0;i < N;i++)
			for(int j = 0;j < M;j++)
				if(arr[i][j] == 2 && !visit[i][j])
					cnt += check(i,j);
		return cnt;
	}
	static int check(int x,int y) {
		int cnt = 0;
		
		boolean get = true;
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x,y));
		visit[x][y] = true;
		cnt++;
		while(!q.isEmpty()) {
			int nx = q.peek().x;
			int ny = q.peek().y;
			q.poll();
			
			for(int i = 0;i < 4;i++) {
				int ax = nx + dir[i][0];
				int ay = ny + dir[i][1];
				
				if(ax<0||ax>=N||ay<0||ay>=M)
					continue;
				if(arr[ax][ay]==0)
					get = false;
				if(arr[ax][ay]==2&&!visit[ax][ay]) {
					visit[ax][ay] = true;
					q.add(new Point(ax,ay));
					cnt++;
				}
			}
		}
		if(get)
			return cnt;
		else
			return 0;
	}
	static class Point{
		int x;
		int y;
		public Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
}
