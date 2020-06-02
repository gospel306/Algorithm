import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int[][] maze;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	static int sx,sy,ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int testcase = 1; testcase <= 10; testcase++) {
			int T = sc.nextInt();
			maze = new int[16][16];
			ans = 0;
			for(int i = 0;i<maze.length;i++) {
				String line = sc.next();
				for(int j = 0;j < maze.length;j++) {
					maze[i][j] = line.charAt(j)-'0';
					if(maze[i][j] == 2) {
						sx = i;
						sy = j;
					}
				}
			}
			solution();
			System.out.println("#"+T+" "+ans);
		}
	}
	static void solution() {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(sx,sy));
		int x = 0;
		int y = 0;
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i = 0;i < 4;i++) {
				x = p.x + dir[i][0];
				y = p.y + dir[i][1];
				if(x >= 0 && x < 16 && y >= 0 && y < 16 && maze[x][y] != 1) {
					if(maze[x][y] == 0) {
						q.add(new Point(x,y));
						maze[x][y] = 2;
					}else if(maze[x][y] == 3) {
						ans = 1;
						return;
					}
				}
			}
		}
	}
	static class Point{
		int x,y;
		public Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
}
