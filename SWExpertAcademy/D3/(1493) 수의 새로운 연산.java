import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int[][] arr = new int[300][300];
		int n = 1,m=1;
		arr[1][1] = 1;
		for(int i = 1;i < arr.length;i++) {
			m = n+1;
			for(int j = 2;j < arr.length;j++) {
				arr[i][j] = arr[i][j-1] + m;
				m++;
			}
			if(i+1 < arr.length)
				arr[i+1][1] = arr[i][1] + n;
			n++;
		}
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int px = 0,py = 0,qx = 0,qy = 0;
			out:
			for(int i = 1;i < arr.length;i++) {
				if(arr[i][arr.length-1] < p)
					continue;
				for(int j = 1;j < arr.length;j++) {
					if(arr[i][j] > p)
						break;
					else if(arr[i][j] == p) {
						px = i;
						py = j;
						break out;
					}
				}
			}
			out:
				for(int i = 1;i < arr.length;i++) {
					if(arr[i][arr.length-1] < q)
						continue;
					for(int j = 1;j < arr.length;j++) {
						if(arr[i][j] > q)
							break;
						else if(arr[i][j] == q) {
							qx = i;
							qy = j;
							break out;
						}
					}
				}
			System.out.println("#"+t+" "+arr[px+qx][py+qy]);
		}
	}
}
