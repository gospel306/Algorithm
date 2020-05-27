import java.util.Scanner;

public class Main {
	static int n,m,x,y,d,dx,dy,count;
	static int[][] arr;
	static int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		x = sc.nextInt();
		y = sc.nextInt();
		d = sc.nextInt();
		for(int i = 0;i < n;i++)
			for(int j = 0;j < m;j++)
				arr[i][j] = sc.nextInt();
		while(true) {
			boolean check = solution();
			if(check)
				break;
		}
		System.out.println(count);
	}
	static boolean solution() {
		if(arr[x][y] == 0) {
			arr[x][y] = 2;
			count++;
		}
		boolean go = false;
		int check = 0;
		int dt = d;
		for(int i = 0;i < 4;i++) {
			dt = dt-1;
			if(dt == -1)
				dt = 3;
			dx = x + dir[dt][0];
			dy = y + dir[dt][1];
			if(dx>= 0 && dy>=0 && dx < n && dy < m) {
				if(arr[dx][dy] == 0) {
					x = dx;
					y = dy;
					d = dt;
					break;
				}else
					check++;
					
			}
		}
		if(check == 4) {
			if(d >1)
				dt = d - 2;
			else
				dt = d + 2;
			dx = x + dir[dt][0];
			dy = y + dir[dt][1];
			if(dx>= 0 && dy>=0 && dx < n && dy < m) {
				if(arr[dx][dy] == 1)
					go = true;
				else {
					x = dx;
					y = dy;
				}
			}
		}
		return go;
	}
}
