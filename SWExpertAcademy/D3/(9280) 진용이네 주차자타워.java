import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution9280 {
	static int[] R_i, W_i, R;
	static Queue<Integer> q;
	static int sum, dir;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			R_i = new int[n];
			R = new int[n];
			W_i = new int[m];
			for (int i = 0; i < n; i++)
				R_i[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				W_i[i] = sc.nextInt();
			q = new LinkedList<>();
			dir = 0;
			sum = 0;
			for (int i = 0; i < m * 2; i++) {
				int num = sc.nextInt();
				if (num > 0) {
					dir = blank();
					if (dir == -1) {
						q.add(num);
						continue;
					} else {
						R[dir] = num;
						sum += R_i[dir]*W_i[num-1];
					}
				}else {
					findnum(Math.abs(num));
					
				}
			}
			System.out.println("#"+testcase+" "+sum);
		}
	}

	static int blank() {
		for (int i = 0; i < R.length; i++) {
			if (R[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	static void findnum(int a) {
		for(int i = 0;i < R.length;i++) {
			if(R[i] == a) {
				if(!q.isEmpty()) {
					R[i] = q.poll();
					sum += R_i[i]*W_i[R[i] - 1];
				}else {
					R[i] = 0;
				}
				return;
			}
		}
	}
}
