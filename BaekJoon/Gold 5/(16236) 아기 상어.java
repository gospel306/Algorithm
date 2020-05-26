import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static int sx, sy, size, N, count;
	static int[][] field;
	static int[][] d = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		field = new int[N][N];
		size = 2;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++) {
				field[i][j] = sc.nextInt();
				if (field[i][j] == 9) {
					sy = i;
					sx = j;
					field[i][j] = 0;
				}
			}
		count = 0;
		solution();
		System.out.println(count);
	}

	static void solution() {
		Queue<Point> q1 = new LinkedList<>();
		int eat = 0;
		q1.add(new Point(sx,sy,size));
		while(true) {
			int[][] dist = new int[N][N];
			LinkedList<Point> q2 = new LinkedList<>();
			while(!q1.isEmpty()) {
				Point p = q1.poll();
				for(int i = 0;i < 4;i++) {
					int X = p.x + d[i][1];
					int Y = p.y + d[i][0];
					if(X >= 0 && X < N && Y >= 0 && Y < N && dist[Y][X] == 0 && field[Y][X] <= size) {
						dist[Y][X] = dist[p.y][p.x]+1; 
						if(field[Y][X] > 0 && field[Y][X] < size) {
							q2.add(new Point(X,Y,dist[Y][X]));
							q1.add(new Point(X,Y,dist[Y][X]));
							continue;
						}
						q1.add(new Point(X,Y,dist[Y][X]));
					}
				}
			}
			if(q2.size() == 0) {
				return;
			}
			Point eatfish = q2.get(0);
			for(int i = 1;i < q2.size();i++) {
				if(eatfish.dist > q2.get(i).dist)
					eatfish = q2.get(i);
				else if(eatfish.dist == q2.get(i).dist) {
					if(eatfish.y > q2.get(i).y)
						eatfish = q2.get(i);
					else if(eatfish.y == q2.get(i).y)
						if(eatfish.x > q2.get(i).x)
							eatfish = q2.get(i);
				}
			}
			count += eatfish.dist;
			eat++;
			field[eatfish.y][eatfish.x]= 0; 
			if(eat == size) {
				eat = 0;
				size++;
			}
			q1.add(new Point(eatfish.x,eatfish.y,size));
		}
	}
	static class Point {
		int x;
		int y;
		int dist;
		public Point(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
}
