import java.io.*;
import java.util.StringTokenizer;

public class Solution {
	static int[][] n;
	static int size;
	static int max;
	static int max_cal;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bf.readLine());
		for(int t = 1;t <= testcase;t++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			size = Integer.parseInt(st.nextToken());
			max_cal = Integer.parseInt(st.nextToken());
			n = new int[size][2];
			for(int i = 0;i < size;i++) {
				st = new StringTokenizer(bf.readLine());
				n[i][0] = Integer.parseInt(st.nextToken());
				n[i][1] = Integer.parseInt(st.nextToken());
			}
			max = 0;
			permutation(0,0,0);
			System.out.println("#"+t+" "+max);
		}
	}
	public static void permutation(int depth,int sumT,int sumK) {
		if(depth == size) {
			if(sumK <= max_cal && max < sumT)
				max = sumT;
		}
		else if(sumK <= max_cal) {
			permutation(depth+1,sumT,sumK);
			permutation(depth+1,sumT+n[depth][0],sumK + n[depth][1]);
		}
	}
}
