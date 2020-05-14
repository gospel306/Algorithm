import java.util.Scanner;

public class Solution {
	static int[] arr;
	static boolean[] check;
	static int count,max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			arr = new int[N];
			check = new boolean[N];
			count = 0;max = 0;
			for(int i =0;i < N;i++) {
				arr[i] = sc.nextInt();
				if(max < arr[i])
					max = arr[i];
			}
			solution(0);
			sb.append("#"+t+" "+count+"\n");
		}
		System.out.println(sb);
	}
	static void solution(int depth) {
		if(depth == arr.length) {
			int left=0,right=0;
			swift(0,left,right);
			return;
		}
		for(int i = depth;i < arr.length;i++) {
			swap(i,depth);
			solution(depth+1);
			swap(i,depth);
		}
		
	}
	static void swift(int depth,int left,int right) {
		if(left < right)
			return;
		if(depth == arr.length) {
			count++;
			return;
		}
		swift(depth+1,left+arr[depth],right);
		swift(depth+1,left,right+arr[depth]);
	}
	static void swap(int i,int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
