import java.util.Scanner;

public class Solution {
	static double max;
	static boolean[] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			double result = 1;
			max = 0;
			visit = new boolean[N];
			for(int i = 0;i <arr.length;i++)
				for(int j = 0;j < arr.length;j++)
					arr[i][j] = sc.nextInt();
			solution(arr,0,result);
			System.out.printf("#%d %.6f\n",t,max*100);
		}
	}
	static void solution(int[][] arr,int depth,double result) {
		if(depth == arr.length) {
			if(max < result)
				max = result;
			return;
		}
        if(max >= result)
            return;
		for(int i = 0;i <arr.length;i++) {
			if(!visit[i]) {
				visit[i] = true;
				solution(arr,depth+1,result * arr[depth][i]/100.0);
				visit[i] = false;
			}
		}
	}
}
