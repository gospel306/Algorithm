import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int[] dx = {1,-1,0,0},dy = {0,0,1,-1};
	static int[][] arr;
	static int tmp,N;
	static Queue<Point> q;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testcase = Integer.parseInt(st.nextToken());
		for(int t = 1;t <= testcase;t++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			q = new LinkedList<>();
			for(int i = 0;i < N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0;j < N;j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			int start = 0,result = 0;
			for(int i = 0;i < N;i++) {
				for(int j = 0;j < N;j++) {
					q.add(new Point(i,j));
					tmp = 1;
					BFS();
					if(tmp > result) {
						result = tmp;
						start = arr[i][j];
					}else if(tmp == result && start > arr[i][j])
						start = arr[i][j];
				}
			}
			System.out.println("#"+t+" "+start+" "+result);
		}
	}
	static void BFS() {
		while(!q.isEmpty()) {
			Point p = q.poll();
			for(int i = 0;i < 4;i++) {
				int x = dx[i] + p.x;
				int y = dy[i] + p.y;
				if(x >= 0 && y >= 0 && x < N && y < N  && arr[x][y] == arr[p.x][p.y]+1) {
					q.add(new Point(x,y));
					tmp++;
				}
			}
		}
	}
}
