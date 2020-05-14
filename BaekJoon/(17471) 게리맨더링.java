import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N,Answer = Integer.MAX_VALUE;
	static int[] Person;
	static boolean[][] Connect;
	static boolean[] Visit, Select;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Person = new int[N];
		Select = new boolean[N];
		Connect = new boolean[N][N];
		for(int i = 0;i < N;i++)
			Person[i] = sc.nextInt();
		for(int i = 0;i < N;i++) {
			int Cnt = sc.nextInt();
			for(int j = 0;j < Cnt;j++) {
				int a = sc.nextInt();
				Connect[i][a-1] = true;
				Connect[a-1][i] = true;
			}
		}
		DFS(0,0);
		if(Answer == Integer.MAX_VALUE)
			Answer = -1;
		System.out.println(Answer);
	}
	static boolean Check_Connection(ArrayList<Integer> P, boolean T) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(P.get(0));
		Visit = new boolean[N];
		Visit[P.get(0)] = true;
		int Cnt = 1;
		
		while(!Q.isEmpty()) {
			int x = Q.poll();
			for(int i = 0;i < N;i++) {
				/* BFS 탐색 조건 3개
				 * 조건 1 : 현재 구역과 탐색하려는 구역 연결 여부
				 * 조건 2 : 탐색하려는 구역이 선거구에 맞는지 여부
				 * 조건 3 : 아직 방문하지 않은 구역이 있는지 여부
				 */
				if(Connect[x][i] == true && Select[i] == T && Visit[i] == false) {
					Visit[i] = true;
					Cnt++;
					Q.add(i);
				}
			}
		}
		if(P.size() == Cnt)
			return true;
		return false;
	}
	static boolean Check() {
		/* 선거구가 가질 수 있는 조건들에 대해서 Check 해주는 함수.
	       조건 1 : 선거구에 포함된 구역의 갯수가 1개 이상인지 여부
	       조건 2 : 선거구에 포함된 구역들 끼리 모두 연결되어 있는지 여부
	    */
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		for(int i = 0;i < N;i++)
			if(Select[i] == true)
				A.add(i);
			else
				B.add(i);
		if(A.size() == 0 || B.size() == 0)
			return false;
		boolean AState = Check_Connection(A, true);
		if(AState == false)
			return false;
		boolean BState = Check_Connection(B,false);
		if(BState == false)
			return false;
		return true;
	}
	static void Calculate() {
		int A_Num = 0, B_Num = 0, Diff;
		for(int i = 0;i < N;i++)
			if(Select[i] == true)
				A_Num += Person[i];
			else
				B_Num += Person[i];
		Diff = Math.abs(A_Num - B_Num);
		if(Answer > Diff)
			Answer = Diff;
	}
	static void DFS(int idx, int cnt) {
		if(cnt >= 1 && Check() == true)
			Calculate();
		for(int i = idx;i < N;i++) {
			if(Select[i] == true)
				continue;
			Select[i] = true;
			DFS(i, cnt+1);
			Select[i] = false;
		}
	}
}
