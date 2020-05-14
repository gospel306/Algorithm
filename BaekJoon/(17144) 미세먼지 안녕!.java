import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static int[][] map,map2,air;
	static int R,C,T;
	static int[][] d1 = {{-1,0},{0,1},{1,0},{0,-1}};
	static int[][] d2 = {{1,0},{0,1},{-1,0},{0,-1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		T = sc.nextInt();
		map = new int[R][C];
		map2 = new int[R][C];
		air = new int[2][2];
		int a = 0;
		for(int i = 0;i < R;i++)
			for(int j = 0;j < C;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == -1) {
					air[a][0] = i;
					air[a][1] = j;
					a++;
				}
			}
		for(int i = 0;i < T;i++) {
			solution();
			for(int j = 0;j < R;j++)
				Arrays.fill(map2[j], 0);
		}
		int count = 0;
		for(int i = 0;i < R;i++) 
			for(int j = 0;j < C;j++)
				count += map[i][j];
		System.out.println(count);
	}
	public static void solution() {
		for(int i = 0;i < R;i++) {
			for(int j = 0;j < C;j++) {
				if(map[i][j] > 0) {
					int count = 0;
					if(i-1 >= 0 && map[i-1][j] != -1) {
						map2[i-1][j] += map[i][j]/5;
						count++;
					}
					if(i+1 < R && map[i+1][j] != -1) {
						map2[i+1][j] += map[i][j]/5;
						count++;
					}
					if(j-1 >= 0 && map[i][j-1] != -1) {
						map2[i][j-1] += map[i][j]/5;
						count++;
					}
					if(j+1 < C && map[i][j+1] != -1) {
						map2[i][j+1] += map[i][j]/5;
						count++;
					}
					map2[i][j] += map[i][j] - (map[i][j]/5)*count;
				}
			}
		}
		int r = air[0][0], c = air[0][1];
		int xr = r;
		for(int i = 0;i < d1.length;i++) {
			while(r+d1[i][0] >= 0 && r+d1[i][0] <= xr && c +d1[i][1] >= 0 && c + d1[i][1] < C) {
				map2[r][c] = map2[r+d1[i][0]][c+d1[i][1]];
				map2[air[0][0]][air[0][1]] = 0;
				r = r+d1[i][0];
				c = c+d1[i][1];
			}
		}
		r++;
		for(int i = 0;i < d2.length;i++) {
			while(r+d2[i][0] > xr && r+d2[i][0] < R && c +d2[i][1] >= 0 && c + d2[i][1] < C) {
				map2[r][c] = map2[r+d2[i][0]][c+d2[i][1]];
				map2[air[1][0]][air[1][1]] = 0;
				r = r+d2[i][0];
				c = c+d2[i][1];
			}
		}
		for(int i = 0;i < R;i++)
			for(int j = 0;j < C;j++)
				map[i][j] = map2[i][j];
	}
}
