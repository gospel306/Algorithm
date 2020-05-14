import java.util.Scanner;

public class Solution1494 {
	static int[] x,y;
	static boolean[] check;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			N = sc.nextInt();
			x = new int[N];
			y = new int[N];
			check = new boolean[N];
			for(int i = 0;i < N;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			System.out.println("#"+t+" "+solution(0,0));
		}
	}
	static long solution(int index,int count) {
		long r = Long.MAX_VALUE;
		if(count == N/2) {
			long xx = 0,yy = 0;
			for(int i = 0;i < N;i++) {
				if(check[i]) {
					xx += x[i];
					yy += y[i];
				}else {
					xx -= x[i];
					yy -= y[i];
				}
			}
			r = (xx*xx) + (yy*yy);
		}
		if(index +1 < N) {
			check[index + 1] = true;
			r = Math.min(r, solution(index+1,count+1));
			check[index + 1] = false;
			r = Math.min(r, solution(index+1,count));
		}
		return r;
	}
}
