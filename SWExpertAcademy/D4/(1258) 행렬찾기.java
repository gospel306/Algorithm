import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;


public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for(int t = 1;t <= testcase;t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			List<Vec> list = new ArrayList<Vec>();
			for(int i = 0;i < N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0;j <N;j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			for(int i = 0;i < N;i++) {
				int x = i;
				for(int j = 0;j < N;j++) {
					int y = j;
					if(arr[i][j] != 0) {
						for(y = j+1;y < N;y++) {
							if(arr[i][y] == 0)
								break;
						};
						for(x = i+1;x <N;x++) {
							if(arr[x][j] == 0)
								break;
						};
						for(int k = i;k < x;k++) {
							for(int l = j;l < y;l++)
								arr[k][l] = 0;
						}
						list.add(new Vec((x-i)*(y-j),x-i,y-j));
					}
					j = y;
				}
			}
			Collections.sort(list,new Comparator<Vec>() {
				@Override
				public int compare(Vec o1, Vec o2) {
					if(o1.mult > o2.mult)
						return 1;
					else if(o1.mult < o2.mult)
						return -1;
					else {
						if(o1.x>o2.x) {
							return 1;
						}else if(o1.x<o2.x) {
							return -1;
						}else {
							return 0;
						}
					}
				}
			});
			System.out.print("#"+t+" "+list.size()+" ");
			for(int i = 0;i < list.size();i++) {
				System.out.print(list.get(i).x+" "+ list.get(i).y+" ");
			}
			System.out.println();
		}
		
	}
	static class Vec{
		int mult;
		int x;
		int y;
		public Vec(int mult,int x,int y) {
			this.mult = mult;
			this.x = x;
			this.y = y;
		}
	}
}
