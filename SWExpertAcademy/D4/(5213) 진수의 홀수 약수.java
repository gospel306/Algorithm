import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testcase = Integer.parseInt(st.nextToken());
		long[] num = new long[1000001];
		num[1] = 1;
		for(int i = 2;i < num.length;i++) {
			for(int j = 1; j*j<=i;j++) {
				if(i%j == 0) {
					if(j%2 == 1)
						num[i] += j;
					if(i/j%2 == 1 && j != i/j)
						num[i] += i/j;
				}
			}
			num[i] += num[i-1];
		}
		for (int t = 1; t <= testcase; t++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			long result = 0;
			result = num[right] - num[left - 1];
			System.out.printf("#%d %d\n",t,result);
		}
	}
}
