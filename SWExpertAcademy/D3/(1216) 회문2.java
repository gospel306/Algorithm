import java.util.Scanner;

public class Solution {
	static int max;
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int testcase = 1;testcase <= 10;testcase++) {
			int T = sc.nextInt();
			sc.nextLine();
			arr = new char[100][100];
			max = 1;
			for(int i = 0;i < 100;i++) {
				String s = sc.nextLine();
				arr[i] = s.toCharArray();
			}
			for(int i = 0;i < 100;i++)
				for(int j = 0;j < 100;j++)
					for(int k = 2;k < 100;k++) {
						if(j+k <=100)
							check_horizontal(i,j,k);
						if(i+k <= 100)
							check_vertical(i,j,k);
					}
			System.out.println("#"+testcase+" "+max);
		}
	}
	static void check_horizontal(int x, int y, int L) {
		int sx = x;
		int sy = y;
		int ey = L + y - 1;
		boolean check = false;
		while(true) {
			if(sy > ey) {
				check = true;
				break;
			}
			if(arr[sx][sy] == arr[sx][ey]) {
				sy++;
				ey--;
			}else 
				break;
		}
		if(check && max < L)
			max = L;
	}
	static void check_vertical(int x, int y, int L) {
		int sx = x;
		int sy = y;
		int ex = L + x - 1;
		boolean check = false;
		while(true) {
			if(sx > ex) {
				check = true;
				break;
			}
			if(arr[sx][sy] == arr[ex][sy]) {
				sx++;
				ex--;
			}else 
				break;
		}
		if(check && max < L)
			max = L;
	}
}
