import java.util.Scanner;

public class Main {
	static int[][] arr;
	static int c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N][2];
		for(int i = 0;i < N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		c = 0;
		solution(0,0);
		System.out.println(c);
	}
	static void solution(int count,int depth) {
		if(depth >= arr.length) {
			if(c < count)
				c = count;
			return;
		}
		for(int i = depth;i < arr.length;i++) {
			if(i+arr[i][0] <= arr.length) {
				solution(count+arr[i][1],i+arr[i][0]);
			}
		}
		solution(count,arr.length);
	}
}
