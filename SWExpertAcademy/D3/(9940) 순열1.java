import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int N = sc.nextInt();
			boolean check = false;
			int[] arr = new int[100001];
			for(int i = 0;i < N;i++)
				arr[sc.nextInt()]++;
			for(int i: arr)
				if(i > 1)
					check = true;
			if(check)
				System.out.println("#"+testcase+" No");
			else
				System.out.println("#"+testcase+" Yes");	
		}
	}
}
