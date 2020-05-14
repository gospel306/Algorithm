import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testcase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int[][] cow = new int[N+1][4];
			
			for (int i = 1; i < cow.length; i++) {
				int n = Integer.parseInt(br.readLine());
				System.arraycopy(cow[i-1], 0, cow[i], 0, 4);
				cow[i][n]++;
			}
			StringBuilder result = new StringBuilder(String.format("#%d\n",t));
			for (int i = 0; i < Q; i++) {
				st = new StringTokenizer(br.readLine());
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
				result.append(cow[R][1] - cow[L-1][1]).append(" ").append(cow[R][2] - cow[L-1][2]).append(" ").append(cow[R][3] - cow[L-1][3]).append("\n");
			}
			System.out.print(result);
		}
	}
}
