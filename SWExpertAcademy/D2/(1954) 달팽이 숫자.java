import java.util.Scanner;

public class Solution {
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			n = 1;
			solution(arr,n,0,0,0);
			System.out.println("#"+t);
			for(int i = 0;i<arr.length;i++) {
				for(int j = 0;j<arr.length;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		}
	}
	static void solution(int[][] arr,int n,int x,int y,int dir) {
		if(n == arr.length*arr.length && dir == 3) {
			return;
		}
		arr[x][y] = n;
		if(dir == 0) {
			if(y+dy[dir]<arr.length && arr[x+dx[dir]][y+dy[dir]] == 0)
				solution(arr,n+1,x+dx[dir],y+dy[dir],0);
			else
				solution(arr,n,x,y,1);
		}else if(dir == 1) {
			if(x+dx[dir]<arr.length&& arr[x+dx[dir]][y+dy[dir]] == 0)
				solution(arr,n+1,x+dx[dir],y+dy[dir],1);
			else
				solution(arr,n,x,y,2);
		}else if(dir == 2) {
			if(y+dy[dir]>=0&& arr[x+dx[dir]][y+dy[dir]] == 0)
				solution(arr,n+1,x+dx[dir],y+dy[dir],2);
			else
				solution(arr,n,x,y,3);
		}else{
			if(x+dx[dir]>=0&& arr[x+dx[dir]][y+dy[dir]] == 0)
				solution(arr,n+1,x+dx[dir],y+dy[dir],3);
			else
				solution(arr,n,x,y,0);
		}
	}
}
