import java.util.Scanner;

public class Solution {
	static boolean result;
	static char[][] p;
	static boolean[][][][] check;
	static int[][] d = {{0,1},{0,-1},{-1,0},{1,0}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		for(int t = 1;t <= testcase;t++) {
			int R = sc.nextInt();
			int C = Integer.parseInt(sc.nextLine().trim());
			p = new char[R][C];
			result = false;
			for(int i = 0;i < R;i++)
				p[i] = sc.nextLine().toCharArray();
			check = new boolean[R][C][4][16];
				solution(0,0,0,-1);
			if(result)
				System.out.println("#"+t+" YES");
			else
				System.out.println("#"+t+" NO");
		}
	}
	static void solution(int dir,int mem,int x,int y) {
		if(result) {
			return;	
		}else {
			int nx = x + d[dir][0],ny = y + d[dir][1];
			if(nx <0||ny<0||nx>=p.length||ny>=p[x].length) {
				if(nx<0)
					nx = p.length-1;
				else if(nx >=p.length)
					nx = 0;
				else if(ny < 0)
					ny = p[x].length-1;
				else if(ny >= p[x].length)
					ny = 0;
			}
			if(!check[nx][ny][dir][mem]) {
				char nv = p[nx][ny];
				int nd = dir;
				int nm = mem;
				if(nv != '?') {
					switch(nv) {
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
						nm = nv - '0';
						break;
					case '@':
						result = true;
						return;
					case '+':
						nm = (nm+1)%16;
						break;
					case '-':
						if(nm == 0)
							nm = 16;
						nm = (nm-1);
						break;
					case '>':
						nd = 0;
						break;
					case '<':
						nd = 1;
						break;
					case '^':
						nd = 2;
						break;
					case 'v':
						nd = 3;
						break;
					case '_':
						if(nm == 0)
							nd = 0;
						else
							nd = 1;
						break;
					case '|':
						if(nm == 0)
							nd = 3;
						else
							nd = 2;
						break;
					case '.':
						break;
					}
					if(!check[nx][ny][nd][nm]) {
						check[nx][ny][nd][nm] = true;
						solution(nd,nm,nx,ny);
					}
				}else {
					for(int i = 0;i < d.length;i++) {
						if(!check[nx][ny][i][mem]) {
							check[nx][ny][i][mem] =true;
							solution(i,mem,nx,ny);
						}
					}
				}
			}
		}
	}
}
