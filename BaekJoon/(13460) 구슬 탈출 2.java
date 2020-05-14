import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M, cx, cy, ans = -1;
	static char[][] map;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	static boolean[][][][] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new char[N][M];
		visit = new boolean[N][M][N][M];
		int bx = 0, by = 0, rx = 0, ry = 0;
		for(int i = 0;i < N;i++) {
			char[] line = sc.next().toCharArray();
			for(int j = 0;j < M;j++) {
				map[i][j] = line[j];
				if(map[i][j] == 'B') {
					bx = i;
					by = j;
				}else if(map[i][j] == 'R') {
					rx = i;
					ry = j;
				}
			}
		}
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(bx,by,rx,ry,0));
		while(!q.isEmpty()) {
			Point p = q.poll();
			if(p.depth > 10)
				break;
			if(map[p.rx][p.ry] == 'O') {
				ans =p.depth;
				break;
			}
			for(int i = 0;i < 4;i++) {
				move(p.bx,p.by,i);
				bx = cx;by = cy;
				move(p.rx,p.ry,i);
				rx = cx;ry = cy;
				if(map[bx][by] == 'O')
					continue;
				if(bx == rx && by == ry) {
					switch(i) {
					case 0:
						if(p.bx < p.rx)
							bx--;
						else
							rx--;
						break;
					case 1:
						if(p.bx < p.rx)
							rx++;
						else
							bx++;
						break;
					case 2:
						if(p.by < p.ry)
							by--;
						else
							ry--;
						break;
					case 3:
						if(p.by < p.ry)
							ry++;
						else
							by++;
						break;
					}
				}
				if(!visit[bx][by][rx][ry]) {
					q.add(new Point(bx,by,rx,ry,p.depth+1));
					visit[bx][by][rx][ry] = true;
				}
			}
		}
		System.out.println(ans);
	}
	static void move(int x, int y, int d) {
		while(true) {
			x += dir[d][0];
			y += dir[d][1];
			if(map[x][y] == '#') {
				x -= dir[d][0];
				y -= dir[d][1];
				break;
			}else if(map[x][y] == 'O') {
				break;
			}
		}
		cx = x;cy = y;
	}
	static class Point{
		int bx, by, rx, ry, depth;
		public Point(int bx, int by, int rx, int ry,int depth) {
			this.bx = bx;
			this.by = by;
			this.rx = rx;
			this.ry = ry;
			this.depth = depth;
		}
	}
}
