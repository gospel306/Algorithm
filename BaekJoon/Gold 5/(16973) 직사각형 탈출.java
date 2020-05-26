import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int H, W, Sr, Sc, Fr, Fc, N, M, ans;
	static int[][] map;
	static boolean[][] visit;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		visit = new boolean[N][M];
		for(int i = 0;i < N;i++)
			for(int j = 0;j < M;j++) 
				map[i][j] = sc.nextInt();
		H = sc.nextInt();
		W = sc.nextInt();
		Sr = sc.nextInt()-1;
		Sc = sc.nextInt()-1;
		Fr = sc.nextInt()-1;
		Fc = sc.nextInt()-1;
		ans = 0;
		Solution(Sr,Sc);
		System.out.println(ans);
	}
	static void Solution(int x,int y) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x,y,0));
		visit[x][y] = true;
		while(!q.isEmpty()) {
			Point p = q.poll();
			if(p.x == Fr && p.y == Fc) {
				ans = p.count;
				return;
			}
			for(int i = 0;i < dir.length;i++) {
				int nx = p.x + dir[i][0];
				int ny = p.y + dir[i][1];
				if(nx>=0&&nx<N&&ny>=0&&ny<M&&!visit[nx][ny]&&CanMove(nx,ny,i)) {
					visit[nx][ny] = true;
					q.add(new Point(nx,ny,p.count+1));
				}
			}
		}
		ans = -1;
	}
	static class Point{
		int x;
		int y;
		int count;
		public Point(int x,int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	static boolean CanMove(int x,int y,int dir) {
		if(dir == 0) {
			int nx = x + H -1;
			if(nx >= N)
				return false;
			for(int i = y;i < y + W;i++) {
				if(map[nx][i] == 1)
					return false;
			}
		}else if(dir == 1) {
			for(int i = y;i < y + W;i++) {
				if(map[x][i] == 1)
					return false;
			}
		}else if(dir == 2) {
			int ny = y + W -1;
			if(ny >= M)
				return false;
			for(int i = x;i < x + H;i++) {
				if(map[i][ny] == 1)
					return false;
			}
		}else if(dir == 3) {
			for(int i = x;i < x + H;i++) {
				if(map[i][y] == 1)
					return false;
			}
		}
		return true;
	}
}
