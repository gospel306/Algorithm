import java.util.Scanner;

public class Main {
	static int[][] arr;
	static boolean[] check;
	static int[] list,list2;
	static int N,ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		ans = Integer.MAX_VALUE;
		check = new boolean[N];
		list = new int[N/2];
		list2 = new int[N/2];
		for(int i = 0;i < N;i++)
			for(int j = 0;j < N;j++)
				arr[i][j] = sc.nextInt();
		solution(0,0);
		System.out.println(ans);
	}
	static void solution(int depth,int cnt) {
		if(depth == N)
			return;
		if(cnt == N/2) {
			int a = 0, b = 0, k = 0, l = 0;
			
			for(int i = 0;i < check.length;i++)
				if(check[i]) {
					list[k] = i;
					k++;
				}else {
					list2[l] = i;
					l++;
				}
			for(int i = 0;i < N/2;i++)
				for(int j = 0;j < N;j++)
					if(list[i] != j && check[j])
						a += arr[list[i]][j];
					else if(list2[i] != j && !check[j])
						b += arr[list2[i]][j];
			if(ans > Math.abs(a-b))
				ans = Math.abs(a-b);
			return;
		}
		check[depth++] = true;
		solution(depth--,cnt+1);
		check[depth++] = false;
		solution(depth,cnt);
	}
}
