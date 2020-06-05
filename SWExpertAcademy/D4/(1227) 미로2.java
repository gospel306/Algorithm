import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static int[][] arr,dir = {{1,0},{-1,0},{0,1},{0,-1}};
	static int N,ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1;tc <= 10;tc++) {
			N = sc.nextInt();
			arr = new int[100][100];
			int x = 0,y = 0;
			ans = 0;
			for(int i = 0;i < 100;i++) {
				String line = sc.next();
				for(int j = 0;j < 100;j++) {
					arr[i][j] = line.charAt(j) - '0';
					if(arr[i][j] == 2) {
						x = i;
						y = j;
					}
				}
			}
			solution(x,y);
			System.out.println("#"+tc+" "+ans);
		}
	}
	static void solution(int x,int y) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(1,1));
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i = 0;i < 4;i++) {
				int dx = p.x + dir[i][0];
				int dy = p.y + dir[i][1];
				if(dx >= 0 && dx < 100 && dy >= 0 && dy < 100) {
					if(arr[dx][dy] == 0) {
						arr[dx][dy] = 2;
						q.add(new Point(dx,dy));
					}else if(arr[dx][dy] == 3) {
						ans = 1;
					}
				}
			}
		}
	}
	static class Point{
		int x,y,size;
		public Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
}
