import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int size = sc.nextInt();
			int trsize = sc.nextInt();
			int[][] fly = new int[size][size];
			int result = 0,sum;
			for(int i = 0;i < fly.length;i++)
				for(int j = 0;j < fly[i].length;j++)
					fly[i][j] = sc.nextInt();
			for(int i = 0;i <fly.length - trsize+1;i++) {
				for(int j = 0;j < fly[i].length - trsize+1;j++) {
					sum = 0;
					for(int k = 0;k < trsize;k++)
						for(int l = 0;l < trsize;l++)
							sum += fly[i+k][j+l];
					if(result < sum)
						result = sum;
				}
			}
			System.out.printf("#%d %d\n", t,result);
		}
	}
}
