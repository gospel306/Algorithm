import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int N,M,count;
	static int[][] arr,copy;
	static ArrayList<Point> virus = new ArrayList<>();
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N][M];
		copy = new int[N][M];
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < M;j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 2) {
					virus.add(new Point(i,j));
				}
			}
		}
		solution(0,0);
		System.out.println(count);
	}
	static void Copy() {
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				copy[i][j] = arr[i][j];
			}
		}
	}
	static void spreadout(int x,int y) {
		for(int i = 0;i < dir.length;i++) {
			int xs = x + dir[i][0];
			int ys = y + dir[i][1];
			if(xs >= 0 && xs < arr.length && ys >= 0 && ys < arr[x].length && copy[xs][ys] == 0) {
				copy[xs][ys] = 2;
				spreadout(xs,ys);
			}
		}
	}
	static void solution(int s,int depth) {
		if(depth == 3) {
			Copy();
			int c = 0;
			for(Point p : virus) 
				spreadout(p.x,p.y);
			for(int i = 0;i < N;i++) 
				for(int j = 0;j < M;j++) 
					if(copy[i][j] == 0)
						c++;
			if(c> count) 
				count = c;
			return;
		}
		for(int i = s;i < N*M;i++) {
			int x = i/M;
			int y = i%M;
			
			if(arr[x][y] == 0) {
				arr[x][y] = 1;
				solution(i+1,depth+1);
				arr[x][y] = 0;
			}
		}
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
