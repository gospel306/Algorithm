import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int[][] arr;
	static int[] dx = {1,-1,0,0,1,1,-1,-1};
	static int[] dy = {0,0,1,-1,1,-1,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			arr = new int[N+2][N+2];
			for(int i = 0;i < arr.length;i++)
				Arrays.fill(arr[i],9);
			for(int i = 1;i < N+1;i++) {
				String line = sc.next();
				for(int j = 1;j < N+1;j++) 
					if(line.charAt(j-1) == '*')
						arr[i][j] = -1;
					else if(line.charAt(j-1) == '.')
						arr[i][j] = 0;
			}
			for(int i = 0;i<arr.length;i++) 
				for(int j = 0;j < arr.length;j++) 
					if(arr[i][j] == -1) 
						for(int k = 0;k < dx.length;k++) 
							if(i+dx[k]>=0 && i+dx[k]<arr.length && j+dy[k]>=0 && j+dy[k]<arr.length && arr[i+dx[k]][j+dy[k]] != -1)
								arr[i+dx[k]][j+dy[k]]++;		
			int gc = 0;
			for(int i = 0;i <arr.length;i++) 
				for(int j = 0;j < arr.length;j++) 
					if(arr[i][j] == 0) {
						int tmp = group(i,j,0);
						if(tmp > 0)
							gc++;
					}	
			for(int i = 0;i < arr.length;i++) 
				for(int j = 0;j < arr.length;j++) 
					if(arr[i][j] == -5) 
						go(i,j);	
			for(int i = 0;i < arr.length;i++) 
				for(int j = 0;j < arr.length;j++) 
					if(arr[i][j]>0 && arr[i][j] < 9)
						gc++;
			System.out.println("#"+t+" "+gc);
		}
	}
	static int group(int x,int y,int count) {
		int t = 0;
		if(x>0 && y>0 && x < arr.length -1 && y < arr.length -1 && arr[x][y] == 0) {
			arr[x][y] = -5;
			t = 1;
			for(int i = 0;i < dx.length;i++) 
				t += group(x+dx[i],y+dy[i],count+1);	
		}else
			return 0;
		return t;
	}
	static void go(int x,int y) {
		for(int i = 0;i < dx.length;i++) 
			if(x+dx[i]>=0 && x+dx[i] < arr.length && y+dy[i]>=0 && y+dy[i]<arr.length && arr[x+dx[i]][y+dy[i]]>0) 
				arr[x+dx[i]][y+dy[i]] = 9;
		arr[x][y] = 9;
	}
}
