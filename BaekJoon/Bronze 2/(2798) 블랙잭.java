import java.util.Scanner;

public class Main {
	static int N, M,answer;
	static int[] arr;
	static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		check = new boolean[N];
		for(int i = 0;i < N;i++)
			arr[i] = sc.nextInt();
		answer = 0;
		solution(0,0);
		System.out.println(answer);
	}
	public static void solution(int depth,int cnt) {
		if(depth == N && cnt == 3) {
			int sum = 0;
			for(int i = 0;i <arr.length;i++)
				if(check[i]) {
					sum+=arr[i];
					if(sum > M)
						break;
				}
			if(sum <= M && answer < sum)
				answer = sum;
			return;
		}
		if(cnt > 3 || depth == N)
			return;
		check[depth++]=true;
		solution(depth--,++cnt);
		check[depth++]=false;
		solution(depth,--cnt);
	}
}
