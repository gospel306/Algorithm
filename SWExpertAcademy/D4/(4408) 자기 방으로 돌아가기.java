import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine().trim());
		for(int t = 1;t <= testcase;t++) {
			int N = Integer.parseInt(br.readLine().trim());
			int max = 0;
			int[] room = new int[200];
			int[] go = new int[2];
			for(int i = 0;i < N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				go[0] = Integer.parseInt(st.nextToken());
				go[1] = Integer.parseInt(st.nextToken());
				for(int j = 0;j < 2;j++) {
					if(go[j]%2 == 0) {
						go[j] = go[j]/2 -1;
					}else
						go[j] = go[j]/2;
				}
         		if(go[0] > go[1]) {
					int tmp = go[0];
					go[0] = go[1];
					go[1] = tmp;
				}
				for(int j = go[0];j <= go[1];j++) {
					room[j]++;
					if(room[j] > max)
						max = room[j];
				}
			}
			System.out.printf("#%d %d\n",t,max);			
		}
	}
}
