import java.util.Scanner;

public class Solution {
	static int[] parent;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			parent = new int[n+1];
			StringBuilder sb = new StringBuilder();
			sb.append("#"+t+" ");
			for(int i = 0;i < parent.length;i++)
				make_set(i);
			for (int i = 0; i < m; i++) {
				int c = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(c == 0) {
					union(a,b);
				}else if(c == 1)
					if(find(a) == find(b))
						sb.append("1");
					else
						sb.append("0");
			}
			System.out.println(sb);
		}
	}
	static void make_set(int x) {
		parent[x] = x;
	}
	static void union(int x,int y) {
		x = find(x);
		y = find(y);
		if(x == y)
			return;
		if(x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		parent[y] = x;
	}
	static int find(int x) {
		return (int) (parent[x] == x? x:find(parent[x]));
	}
}
