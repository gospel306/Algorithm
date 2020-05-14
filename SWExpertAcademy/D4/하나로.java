import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	static int N, E;
	static int[] parent;
	static boolean[] visit;
	static ArrayList<Edge> mst;
	static PriorityQueue<Edge> pq;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			N = sc.nextInt();
			E = (N-1)*N/2;
			
			long result = 0;
			visit = new boolean[N + 1];
			parent = new int[N + 1];
			pq = new PriorityQueue<>(new EdgeComparator());
			mst = new ArrayList<>();
			int[][] island = new int[N][2];
			for(int i = 0;i < island.length;i++)
				island[i][0] = sc.nextInt();
			for(int i = 0;i < island.length;i++)
				island[i][1] = sc.nextInt();
			double a = sc.nextDouble();
			for (int e = 0; e < island.length - 1; e++) {
				for(int i = e + 1;i < island.length;i++) {
					int st = e;
					int end = i;
					double value = Math.pow(island[e][0] - island[i][0],2) + Math.pow(island[e][1] - island[i][1],2);
					pq.add(new Edge(st, end, value));
				}
			}
			kruskal();
			for(int i = 0;i < mst.size();i++)
				result += mst.get(i).value;
			System.out.printf("#%d %.0f\n",t,result*a);
		}
	}

	static void kruskal() {
		for (int i = 1; i <= N; i++)
			parent[i] = i;
		for (int i = 0; i < E; i++) {
			Edge edge = pq.poll();

			if (find(edge.start) == find(edge.end))
				continue;
			union(edge.start, edge.end);
			mst.add(edge);
		}
	}

	static int find(int n) {
		if (parent[n] == n)
			return n;
		parent[n] = find(parent[n]);
		return parent[n];
	}

	static void union(int n1, int n2) {
		int p1 = find(n1);
		int p2 = find(n2);
		if (p1 != p2)
			parent[p1] = p2;
	}

	static class EdgeComparator implements Comparator<Edge> {
		@Override
		public int compare(Edge o1, Edge o2) {
			return o1.value > o2.value ? 1 : -1;
		}

	}

	static class Edge {
		int start, end;
		double value;

		Edge(int s, int e, double v) {
			start = s;
			end = e;
			value = v;
		}
	}
}
